package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//设置时间格式
		
		String str = "2016/1/5 12:12:12";
		
		try {
			Date d = sdf.parse(str);//通过parse方法转换成时间
			
			
			System.out.printf("字符串%s通过格式  yyyy/MM/dd "
					+ "HH:mm:ss %n转换为日期对象：%s"
					,str,d.toString());
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
	}

}
