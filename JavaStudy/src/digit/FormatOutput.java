package digit;
/**
 * 
 * @author
 *
 */
import java.util.Scanner;
public class FormatOutput {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); 
		 //����һ�������ֵ�Scanner,�����Ϊϵͳ����in
         
         System.out.printf("�����������%n");
         String place = s.nextLine();
         //����Scanner�ķ���
          
         System.out.printf("�����빫˾���ͣ�%n");
         String company = s.nextLine();
          
         System.out.printf("�����빫˾���ƣ�%n");
         String companyName = s.nextLine();
          
         System.out.printf("�������ϰ����֣�%n");
         String boos = s.nextLine();
          
         System.out.printf("�������%n");
         long money = s.nextInt();
          
         System.out.printf("�������Ʒ��%n");
         String rn = s.nextLine();
         String products = s.nextLine();
          
         System.out.printf("������۸������λ��%n");
         String price = s.nextLine();
          
         String str = "%s���%s%s�����ˣ�%n"
         		+ "���˵��ϰ�%s�Ժ��ζģ�Ƿ����%d���ڣ�%n"
                 + "��������С��������!����û�а취������%s�ֹ���!%n"
                 + "ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���Ǯ��������ȫ��ֻ����ʮ�飬%n"
                 +"ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬%n"
                 +"�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
         System.out.format(str, place,company,companyName,boos,money,products,price,price,price,boos);

	}

}
