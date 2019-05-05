package digit;

public class TestNumber {
	
	public static void main(String[] args) {
		int i = 5;
		//把一个基本类型的变量，转换成Integer对象
		Integer it = new Integer(i);
		System.out.println(it instanceof Number); //instanceof
		//把一个Integer对象，转换为一个基本类型的int
		int i2 = it.intValue();
		
		//自动转换就叫做装箱
		Integer it2 = i;
		int i3 = it;
		String str3 = "999";
		
		
		//数字转换成字符串
		//方法1
		String str = String.valueOf(i); //大写O????
		
		//方法2
		Integer it3 = i;
		String str2 = it3.toString();
		
		
		//字符串转换成数字
		int i4 = Integer.parseInt(str3);
		
		//******************************
		//作业：
//		把浮点数 3.14 转换为 字符串 "3.14"
//		再把字符串 “3.14” 转换为 浮点数 3.14
		
/*1	*/	float f1 = 3.14f;
		//String strf = f1.toString(); 出错，float 为基本类型
		//使用toString方法需先将其封装成对象,如下
		Float Ff1 = f1;
		String strf0 = Ff1.toString();
		
		//或者使用String的valueOf方法
		String strf1 = String.valueOf(f1);
		
		
/*2	*/	f1 = Float.parseFloat(strf0);	
//类似的有Float的parseFloat方法

		//*******************************
		
		
		System.out.println(i3);
		System.out.println(it2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(i4);
	}

}
