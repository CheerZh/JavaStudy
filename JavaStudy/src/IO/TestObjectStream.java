package IO;

/**
 * ����һ��Hero��������������Ϊgaren�� 
�Ѹö������л���һ���ļ�garen.lol��
Ȼ����ͨ�����л��Ѹ��ļ�ת��Ϊһ��Hero����

ע����һ���������л���һ��ǰ���ǣ����������࣬����ʵ����Serializable�ӿ�
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

		//����һ��Hero garen
		//Ҫ��Hero����ֱ�ӱ������ļ��ϣ������
		//Hero��ʵ��Serializable�ӿ�
		Hero h = new Hero();
		h.name = "garen";
		h.hp = 616;
		
		
		//׼��һ���ļ����ڱ���ö���
		File f = new File("d:/garen.lol");
		
		try(
			//�������������
				//ͬ���������ֽ�����
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				//��������������	
				FileInputStream fis  = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				){
			oos.writeObject(h);
			//������h������ļ���
			
			Hero h2 = (Hero)ois.readObject();
			//�����ļ��ж��󲢸���h2
			
			System.out.println(h2.name);
			System.out.println(h2.hp);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {  //ע��
			e.printStackTrace();
		}
	}

}
