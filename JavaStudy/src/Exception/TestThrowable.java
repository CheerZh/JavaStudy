package Exception;
/**
 *�׳�Throwable����࣬�ڵ��÷���������쳣����
 */

import java.io.File;
import java.io.FileInputStream;

public class TestThrowable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:/LOL.exe");
		try {
			method1(f);
			//ʹ��Throwable�����쳣��׽
		}catch(Throwable t){
			System.out.println("�ļ�������");
			t.printStackTrace();
		}
	}
	public static void method1(File a) throws Throwable {
		
			System.out.println("���Դ��ļ�");
			new FileInputStream(a);	
	}
}
