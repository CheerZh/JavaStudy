package Date;
import java.util.Date;
//ע�⣺��java.util.Date;
//���� java.sql.Date�������Ǹ����ݿ���ʵ�ʱ��ʹ�õ�

import java.text.SimpleDateFormat;
/**
 * 
 * @author zgq
 *
 */

public class TestDate {

	public static void main(String[] args) {
		
		

		//��ǰʱ��
		Date d1 = new Date(); //�޲η��ص�ǰʱ��
		System.out.println("��ǰʱ�䣺");
		System.out.println(d1);
		System.out.println();
		
		//��1970��1��1�� ����8��0��0�� ��ʼ����������
		Date d2 = new Date(5000);
		//�в�ʱ���ص��Ǵ�ʱ��ԭ�㾭���˲���������ʱ��
		System.out.println("��1970��1��1�� ����8��0��0�� ��ʼ������5���ʱ�䣺");
		System.out.println(d2);
		
		
		//getTime() �õ�һ��long�͵�����
		Date now = new Date();
		System.out.println("��ǰʱ�䣺"+now.toString());  
		//�Զ���long��������ת����ʱ��
		System.out.println("��ǰʱ��getTime()���ص�ʱ���ǣ�"+now.getTime());
		Date zero = new Date(0);
	        System.out.println("��0��Ϊ���췽�����õ���������:"+zero);
	        
	    //System.currentTimeMillis() ��ǰ���ڵĺ�����
		//new Date().getTime() �� System.currentTimeMillis() ��һ����
	    System.out.println("Date.getTime() \t\t\t����ֵ: "+now.getTime());
	    System.out.println("System.currentTimeMillis()\t����ֵ��"+System.currentTimeMillis());
	    
	    //��ʽ�����ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date d = new Date();
		String str = sdf.format(d);
		System.out.println("��ǰʱ��"+str);
	}

}
