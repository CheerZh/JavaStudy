package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TryCatch {

	public static void main(String[] args) {

		File f = new File("d:/LOL.exe");
		
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f); //���ļ�f
			System.out.print("�ɹ���");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2016-06-03");
			
		}
		
//		catch(FileNotFoundException e) { //�������ͣ��ļ�������
//			System.out.println("d:/LOL.exe������");
//			e.printStackTrace();
//			//��ӡ���úۼ�
//		}
//		catch(ParseException e) {
//			System.out.println("���ڸ�ʽ��������");
//			e.printStackTrace();
//		}
		
		//���쳣��׽2
		catch(Exception e) {  //����
			if (e instanceof FileNotFoundException ) {
				System.out.println("d:/LOL.exe������");
				
			}
			if(e instanceof ParseException) {
				System.out.println("���ڸ�ʽ��������");
			}
			e.printStackTrace();
		}
		
		finally {
			System.out.println("�����ļ��Ƿ���ڣ�����ִ�еĴ���");
		}
	}
	

}
