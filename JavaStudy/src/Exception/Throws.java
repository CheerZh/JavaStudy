package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Throws {

	public static void main(String[] args) {
		
		method1();
		
	}
	private static void method1() {
		try {
			method2();
			
		}catch(FileNotFoundException e) {
			System.out.println("d:/LOL.exe ������");
			e.printStackTrace();
			
		}
	}
	
	private static void method2() throws FileNotFoundException {
		
		File f = new File("d:/LOL.exe");
		
		System.out.println("��ͼ�� d:/LOL.exe");
		new FileInputStream(f);
		System.out.println("�ɹ���");
	}

}
