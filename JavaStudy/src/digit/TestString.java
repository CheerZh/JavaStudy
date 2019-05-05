package digit;
import java.util.Random;
/**
 * 
 * @author zgq
 *
 */

public class TestString {

	public static void main(String[] args) {
		String garen = "盖伦";//字面值，自动创建字符串
		
		String teemo = new String("提莫");
		//创建了两个字符串对象，teemo和无名串
		
		char[] cs = new char[] {'崔','斯','特'};
		
		//*********字符数组转换成字符串*************
		String hero = new String(cs);
		//通过字符数组创建一个字符串对象
		
		String hero3 = garen + teemo;
		System.out.println(hero3.length()); //length方法
		
		//通过+进行字符串拼接
		
		//String 被修饰为final,不能被继承
		//MyString str = new MyString();	
		
		
		
		//作业：
		//创建一个长度是5的随机字符串，随机字符有可能是数字
		//大写字母或者小写字母
//		System.out.println((short)('a')); //97
//		System.out.println((short)('z')); //122
//		System.out.println((short)('A')); //65
//		System.out.println((short)('Z')); //90
//		System.out.println((short)('0')); //48
//		System.out.println((short)('9')); //57
//		
		
		//String SJS = cs5.toString();
		//是错的，它只会将cs5的地址转换成字符串
		
		String [] ss8 = InitArrayString(8);
		for (int i=0;i<8;i++) {
			System.out.println(ss8[i]);
		}
		System.out.println("排序后字符串数组为：");
		sortString(ss8);
		
		for (int i=0;i<8;i++) {
			System.out.println(ss8[i]);
		}
		
	}

	//static class MyString extends String{
		//The type MyString cannot subclass the final class String
	//}
	
	public static char[] InitArraycs(int c) {
		char [] csc = new char[c];
		for(int i=0;i<c;i++) {
			int j = (int)(Math.random()*3);
			if(j == 0) {
				csc[i] = (char)((short)(Math.random()*26) +97);
			}
			if(j == 1) {
				csc[i] = (char)((short)(Math.random()*26) +65);
			}
			if(j == 2) {
				csc[i] = (char)((short)(Math.random()*10) +48);
			}
			// System.out.println(cs5[i]);测试
			
		}
		return csc;
	}
	
	public static String [] InitArrayString(int c) {
		String [] ss = new String[c];
		for(int i=0;i<c;i++) {
			ss[i] = new String(InitArraycs(5));
		}
		return ss;
	}
	
	//冒泡排序
	public static void sortString(String [] a) {
		String temp ;
		for(int i=a.length;i>0;i--) {
			int flag = 0;
			for(int j=1;j<i;j++) {
				if(Comp(a[j-1],a[j]) ) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					flag = 1;
				}	
			}
			if (flag == 0) break;
		}
//		for (int k=0;k<a.length;k++) {
//			System.out.println(a[k]);
//		}
	}
	
	public static boolean Comp(String a,String b) {
		char [] a1 =new char [a.length()];
		char [] b1 =new char [b.length()];
		
		a1 = a.toCharArray();
		b1 = b.toCharArray();
		
		if(SToint(a1[0])>SToint(b1[0])) return true;
		else return false;	
	}
	
	public static int SToint(char c) {
		int value = (short)(c);
		if(value>=65 && value<=90) value+=32;
		return value;
	}
}
