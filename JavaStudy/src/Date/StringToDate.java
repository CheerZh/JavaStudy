package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//����ʱ���ʽ
		
		String str = "2016/1/5 12:12:12";
		
		try {
			Date d = sdf.parse(str);//ͨ��parse����ת����ʱ��
			
			
			System.out.printf("�ַ���%sͨ����ʽ  yyyy/MM/dd "
					+ "HH:mm:ss %nת��Ϊ���ڶ���%s"
					,str,d.toString());
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
	}

}
