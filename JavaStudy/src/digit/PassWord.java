package digit;
import java.util.*;
/**1. ����һ��������3������ַ�����������ַ�����Ϊ��������

2. ʹ����ٷ����ɳ�����3���ַ�����ƥ���������ɵ�����

Ҫ�� �ֱ�ʹ�ö��forѭ�� �� �ݹ�����������

���������ּ���ĸ���
 * 
 * @author zgq
 *
 */


public class PassWord {

	public static void main(String[] args) {
		
		String password = IintPassWord(3);
		System.out.println(password);
		
		ResolvePw(password);
		

	}
	public static String IintPassWord(int len) {
	char [] pw = new char [len];
		for(int i=0;i<len;i++) {
			int j = (int)(Math.random()*3);
			if(j == 0) {
				pw[i] = (char)((short)(Math.random()*26) +97);
			}
			if(j == 1) {
				pw[i] = (char)((short)(Math.random()*26) +65);
			}
			if(j == 2) {
				pw[i] = (char)((short)(Math.random()*10) +48);
			}
		
	 
		}
		//String b = new String(pw);
		return new String(pw);
	}
	
	public static void ResolvePw(String a) {
		char [] pw = a.toCharArray();
		int b[] = new int[62];
		for(int i=0;i<62;i++) {
			if(i<10) b[i]=i+48;
			else if (i<36) b[i]=i+55;
			else b[i] = i+62;
		}
		
	//	for(int i=0;i<a.length();i++) {
			int flag = 0;
			for(int each :b ) {
				for(int each2 :b) {
					for(int each3 :b) {
						if(each==pw[0] && each2==pw[1] && each3 ==pw[2]) {
							char [] pwr = {(char)each,(char)each2,(char)each3};
							flag = 1;
							System.out.printf("�ƽ���������Ϊ��%s%n",new String(pwr));
							break;
						}
						if(flag == 1) break;
					}
					if(flag == 1) break;
				}
				if(flag == 1) break;
			}
		//}
	}
}