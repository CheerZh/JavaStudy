package IO;

/**
 * 创建一个Hero对象，设置其名称为garen。 
把该对象序列化到一个文件garen.lol。
然后再通过序列化把该文件转换为一个Hero对象

注：把一个对象序列化有一个前提是：这个对象的类，必须实现了Serializable接口
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import charactor.Hero;


public class TestObjectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建一个Hero garen
		//要把Hero对象直接保存在文件上，务必让
		//Hero类实现Serializable接口
		Hero h = new Hero();
		h.name = "garen";
		h.hp = 616;
		
		
		//准备一个文件用于保存该对象
		File f = new File("d:/garen.lol");
		
		try(
			//创建对象输出流
				//同样建立在字节流上
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				//创建对象输入流	
				FileInputStream fis  = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				){
			oos.writeObject(h);
			//将对象h输出到文件中
			
			Hero h2 = (Hero)ois.readObject();
			//读入文件中对象并赋给h2
			
			System.out.println(h2.name);
			System.out.println(h2.hp);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {  //注意
			e.printStackTrace();
		}
	}

}
