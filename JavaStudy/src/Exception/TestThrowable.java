package Exception;
/**
 *抛出Throwable这个类，在调用方法里进行异常处理
 */

import java.io.File;
import java.io.FileInputStream;

public class TestThrowable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:/LOL.exe");
		try {
			method1(f);
			//使用Throwable进行异常捕捉
		}catch(Throwable t){
			System.out.println("文件不存在");
			t.printStackTrace();
		}
	}
	public static void method1(File a) throws Throwable {
		
			System.out.println("尝试打开文件");
			new FileInputStream(a);	
	}
}
