package digit;

public class TestStringFunctions {

	public static void main(String[] args) {
		Practice1();
		Practice2();
		Practice3();
		
	}
	
	//����һ��Ӣ�ľ��ӣ� "let there be light"
	//�õ�һ���µ��ַ�����ÿ�����ʵ�����ĸ��ת��Ϊ��д
	public static void Practice1(){
		String str = "let there be light!";
		System.out.println(str);
		String str1 = new String();
		
		String letters [] = str.split(" ");
		for(String letter : letters) {
			String letter1 = new String();
			letter1 = letter.replaceFirst(letter.substring(0,1),(letter.toUpperCase()).substring(0,1));
			str1 += (letter1+" ");
		}
		System.out.println(str1);	
	}

//	peter piper picked a peck of pickled peppers
//	ͳ������ƿ����ж��ٸ���p��ͷ�ĵ���
	public static void Practice2() {
		String str = "peter piper picked a peck of pickled peppers";
		String letters [] = str.split(" ");
		int count=0;
		for(String letter : letters) {
			if(letter.charAt(0)=='p') ++count;
		}
		System.out.printf("����ƿ�������%d����p��ͷ�ĵ���%n",count);
	}
	
	//�� lengendary �ĳɼ����дСдģʽ���� LeNgEnDaRy
	public static void Practice3() {
		String str = "lengendary";
		char [] a = str.toCharArray();
		char [] b = new char[a.length/2];
		for(int i=0 ;i<a.length;i+=2) {
			b[i/2] = a[i];
		}
		String str1 = new String(b);
		str1 = str1.toUpperCase();
		//***str1.toUpperCase()����������str1���������¸�ֵ********
		b=str1.toCharArray(); 
		for(int i=0 ;i<a.length;i+=2) {
			 a[i]=b[i/2];
		}
		str1 = new String(a);
		System.out.println("�����Сд����ַ���Ϊ��"+str1);
	}
}
