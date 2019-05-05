package digit;

import java.util.Locale;
/**
 * ��ʽ�����
 * @author zgq
 *
 */

public class TestGeSHI {

	public static void main(String[] args) {
		int year = 2020;

//�ܳ��ȣ�����룬��0��ǧλ�ָ�����С����λ�������ػ����
		
		
//		�ܳ�����8,
//		Ĭ��***�Ҷ���****  
//		format == printf	
		System.out.format("%8d%n",year);
		//�ܳ���10,�����
		System.out.format("%-10d%n",year);
		
		
		//�ܳ�����8,������0
        System.out.format("\n%08d%n",year);
        //ǧλ�ָ���
        System.out.format("%,8d%n",year*10000);
        
        //С����λ��
        System.out.format("\n%.4f%n",Math.PI);
        
      //��ͬ���ҵ�ǧλ�ָ���
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
	}

}
