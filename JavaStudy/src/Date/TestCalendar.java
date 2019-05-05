package Date;
/*****
 * 
 * Calendar c = Calendar.getInstance() //��ȡ��������
 * Date d = c.getTime() //ͨ�������õ�����
 * c.setTime(d) //��������������d
 * c.add(Calendar.MONTH,1) //�����·�
 * c.add(Calendar.YEAR,1) //�������
 * c.add(Calendar.DATE,1) //�������� 
 * c.set(c.DATE,3) //��������������/�·�/���
 * int d = c.getMaximum(c.DATE) //��ȡ����/�·ݵ����ֵ
 * c.set(Calendar.DATE, -2); //���ص���������
 * c.set(Calendar.DATE, 0); //��0�������һ��!!!
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestCalendar {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		
		//���õ���ģʽ��ȡ��������Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		
		//ͨ����������õ����ڶ���
		
		Date now = c.getTime();
		
		System.out.println("��ǰ���ڣ�\t" + format(c.getTime()));
		
		//�¸��µĽ���
		c.setTime(now);
		c.add(Calendar.MONTH, 1);//��month�ϼ�1
		System.out.println("�¸��µĽ��죺\t"+format(c.getTime()));
		
		//ȥ��Ľ���
		c.setTime(now);
		c.add(Calendar.YEAR, -1);//��YEAR�ϼ�-1
		System.out.println("ȥ��Ľ��죺\t" + format(c.getTime()));
		
		//�ϸ��µĵ�����
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DATE, 3);
		System.out.println("�ϸ��µĵ����죺\t"+format(c.getTime()));
		
		//��ҵ��
		//�¸��µĵ���������
		c.setTime(now);
		c.add(c.MONTH, 1);
		int d = c.getMaximum(c.DATE); //��ȡ�����������
		//c.set(Calendar.DATE, -3); 
		c.set(Calendar.DATE, -2);
		c.set(Calendar.DATE, 0); //��0�������һ��??
		c.set(c.DATE,d-3); 
		System.out.println("�¸��µĵ��������죺\t"+format(c.getTime()));
		Date d2 = new Date(0);
		
		c.setTime(d2); //��������������ڵ���1970.1.1 08��00:00
		
	}
	private static String format (Date time) {
		return sdf.format(time);
	}
}
