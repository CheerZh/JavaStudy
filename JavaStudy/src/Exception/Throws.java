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
			System.out.println("d:/LOL.exe 不存在");
			e.printStackTrace();
			
		}
	}
	
	private static void method2() throws FileNotFoundException {
		
		File f = new File("d:/LOL.exe");
		
		System.out.println("试图打开 d:/LOL.exe");
		new FileInputStream(f);
		System.out.println("成功打开");
	}

}
