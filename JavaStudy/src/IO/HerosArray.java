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
			//***����ÿһ������ʵ����Ҫ������ʼ��***
			heros[i].name = "hero_"+i;
			heros[i].hp = (int)(Math.random()*100+500);
			//ע��random()�������÷�
		}

		File f = new File("d:/lol/HerosArray.lol");
		//ֱ�Ӵ���û�и�Ŀ¼��ʧ��
		
		if(!f.exists()) {
			try {
				f.getParentFile().mkdirs();
				//������Ŀ¼
				f.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			
		try(
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//�ȴ��������
				
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				){
				Hero [] heros2 = new Hero [10];
				
				for(int i=0;i<heros.length;i++) {
					oos.writeObject(heros[i]); //д��һ��������һ��
					heros2[i]  = (Hero) ois.readObject();  //����һ�ζ�дȫ��
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
