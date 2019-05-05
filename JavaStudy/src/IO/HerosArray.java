package IO;

import charactor.Hero;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class HerosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero[] heros = new Hero[10];
		
		for(int i = 0; i<heros.length;i++) {
			heros[i] = new Hero();  
			//***对于每一个对象实例需要单独初始化***
			heros[i].name = "hero_"+i;
			heros[i].hp = (int)(Math.random()*100+500);
			//注意random()函数的用法
		}

		File f = new File("d:/lol/HerosArray.lol");
		//直接创建没有父目录会失败
		
		if(!f.exists()) {
			try {
				f.getParentFile().mkdirs();
				//创建父目录
				f.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			
		try(
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//先创建输出流
				
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				){
				Hero [] heros2 = new Hero [10];
				
				for(int i=0;i<heros.length;i++) {
					oos.writeObject(heros[i]); //写入一个，读出一个
					heros2[i]  = (Hero) ois.readObject();  //不能一次读写全部
					System.out.println("hero:" + heros2[i].name);
				}
			}
			catch(IOException e) {
					e.printStackTrace();
				}
		
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
