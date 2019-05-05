package digit;

public class TestStringFunctions {

	public static void main(String[] args) {
		Practice1();
		Practice2();
		Practice3();
		
	}
	
	//给出一句英文句子： "let there be light"
	//得到一个新的字符串，每个单词的首字母都转换为大写
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
//	统计这段绕口令有多少个以p开头的单词
	public static void Practice2() {
		String str = "peter piper picked a peck of pickled peppers";
		String letters [] = str.split(" ");
		int count=0;
		for(String letter : letters) {
			if(letter.charAt(0)=='p') ++count;
		}
		System.out.printf("这段绕口令中有%d个以p开头的单词%n",count);
	}
	
	//把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
	public static void Practice3() {
		String str = "lengendary";
		char [] a = str.toCharArray();
		char [] b = new char[a.length/2];
		for(int i=0 ;i<a.length;i+=2) {
			b[i/2] = a[i];
		}
		String str1 = new String(b);
		str1 = str1.toUpperCase();
		//***str1.toUpperCase()方法不更新str1，必须重新赋值********
		b=str1.toCharArray(); 
		for(int i=0 ;i<a.length;i+=2) {
			 a[i]=b[i/2];
		}
		str1 = new String(a);
		System.out.println("间隔大小写后的字符串为："+str1);
	}
}
