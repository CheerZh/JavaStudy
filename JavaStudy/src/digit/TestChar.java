package digit;
import java.util.Scanner;
public class TestChar {

	public static void main(String[] args) {
		char c1 = '1';
		char c2 = '��';
		//char c4 = 'ab'; ֻ�ܷ�һ���ַ�
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		//String a = 'a'; ����ֱ�Ӱ�һ���ַ�ת�����ַ���
		String a2 = Character.toString('a');
		
		//*****Scanner�÷�************
		Scanner s =new Scanner(System.in);
		//������������ַ��������ַ�������
		System.out.println("�������ַ�����");
		String str = s.nextLine();
		
		char[]cs = str.toCharArray();//ת���ַ�����ķ���
		
		//������д�д�ַ�
		System.out.println("�����ַ����д�д��ĸ�У�");
		for(char each : cs) {
			if(Character.isUpperCase(each)) {
				System.out.printf("%c",each);
			}
		}
		//�����������
		System.out.format("%n�����ַ����������У�%n");
		for(char each : cs) {
			if(Character.isDigit(each)) {
				System.out.printf("%c",each);
			}
		}
	}
	
}
