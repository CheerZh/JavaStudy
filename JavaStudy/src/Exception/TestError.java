package Exception;
/**
 * 三类：
 * 错误；运行时异常；可查异常三类
 * @author zgq
 *
 */

public class TestError {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		//错误：系统级别的异常，内存满，栈满
		
	try {
		for (int i=0;i<Integer.MAX_VALUE;i++) {
	
			sb.append('a');
		}
	}catch(Error e){ //Error 而非  Exception
			
		System.out.println("错误：内存不足");
		
		}
	
	
	//运行时异常：除0；下标越界；空指针
	try {
		int []a =new int[10];
		for(int i=0;i<=10;i++) {
			a[i]=i;
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("运行时异常：下标越界");
	}

	}

}
