package digit;
import java.util.Random;
/**
 * 
 * @author zgq
 *
 */

public class TestString {

	public static void main(String[] args) {
		String garen = "����";//����ֵ���Զ������ַ���
		
		String teemo = new String("��Ī");
		//�����������ַ�������teemo��������
		
		char[] cs = new char[] {'��','˹','��'};
		
		//*********�ַ�����ת�����ַ���*************
		String hero = new String(cs);
		//ͨ���ַ����鴴��һ���ַ�������
		
		String hero3 = garen + teemo;
		System.out.println(hero3.length()); //length����
		
		//ͨ��+�����ַ���ƴ��
		
		//String ������Ϊfinal,���ܱ��̳�
		//MyString str = new MyString();	
		
		
		
		//��ҵ��
		//����һ��������5������ַ���������ַ��п���������
		//��д��ĸ����Сд��ĸ
//		System.out.println((short)('a')); //97
//		System.out.println((short)('z')); //122
//		System.out.println((short)('A')); //65
//		System.out.println((short)('Z')); //90
//		System.out.println((short)('0')); //48
//		System.out.println((short)('9')); //57
//		
		
		//String SJS = cs5.toString();
		//�Ǵ�ģ���ֻ�Ὣcs5�ĵ�ַת�����ַ���
		
		String [] ss8 = InitArrayString(8);
		for (int i=0;i<8;i++) {
			System.out.println(ss8[i]);
		}
		System.out.println("������ַ�������Ϊ��");
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
			// System.out.println(cs5[i]);����
			
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
	
	//ð������
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
