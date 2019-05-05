package Date;
import java.util.Date;
//注意：是java.util.Date;
//而非 java.sql.Date，此类是给数据库访问的时候使用的

import java.text.SimpleDateFormat;
/**
 * 
 * @author zgq
 *
 */

public class TestDate {

	public static void main(String[] args) {
		
		

		//当前时间
		Date d1 = new Date(); //无参返回当前时间
		System.out.println("当前时间：");
		System.out.println(d1);
		System.out.println();
		
		//从1970年1月1日 早上8点0分0秒 开始经历毫秒数
		Date d2 = new Date(5000);
		//有参时返回的是从时间原点经历了参数毫秒后的时间
		System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间：");
		System.out.println(d2);
		
		
		//getTime() 得到一个long型的整数
		Date now = new Date();
		System.out.println("当前时间："+now.toString());  
		//自动将long类型数字转换成时间
		System.out.println("当前时间getTime()返回的时间是："+now.getTime());
		Date zero = new Date(0);
	        System.out.println("用0作为构造方法，得到的日期是:"+zero);
	        
	    //System.currentTimeMillis() 当前日期的毫秒数
		//new Date().getTime() 和 System.currentTimeMillis() 是一样的
	    System.out.println("Date.getTime() \t\t\t返回值: "+now.getTime());
	    System.out.println("System.currentTimeMillis()\t返回值："+System.currentTimeMillis());
	    
	    //格式化输出时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date d = new Date();
		String str = sdf.format(d);
		System.out.println("当前时间"+str);
	}

}
