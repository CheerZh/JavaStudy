package digit;
import java.util.Scanner;
public class TestChar {

	public static void main(String[] args) {
		char c1 = '1';
		char c2 = '中';
		//char c4 = 'ab'; 只能放一个字符
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		//String a = 'a'; 不能直接把一个字符转换成字符串
		String a2 = Character.toString('a');
		
		//*****Scanner用法************
		Scanner s =new Scanner(System.in);
		//将键盘输入的字符串存入字符数组中
		System.out.println("请输入字符串：");
		String str = s.nextLine();
		
		char[]cs = str.toCharArray();//转换字符数组的方法
		
		//输出其中大写字符
		System.out.println("输入字符串中大写字母有：");
		for(char each : cs) {
			if(Character.isUpperCase(each)) {
				System.out.printf("%c",each);
			}
		}
		//输出其中数字
		System.out.format("%n输入字符串中数字有：%n");
		for(char each : cs) {
			if(Character.isDigit(each)) {
				System.out.printf("%c",each);
			}
		}
	}
	
}
