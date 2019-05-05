package digit;
/**
 * 求1~1000以内所有的质数
 * @author zgq
 *
 */

public class ZhiShu {

	public static void main(String[] args) {
		
		int n = 0;
		for(int i=1;i < 1000;i++) {
			if(i == 1 || i == 3) {
				System.out.printf("%d\t",i);
				n++;
			}
			else if (i == 2);
			else {
				int j=2;
				while((i%j !=0) && (j != (int)(Math.sqrt(i)) )) j++;
				if(i%j == 0) continue;
				else{
					System.out.printf("%d\t",i);
					n++;
					if(n % 8 == 0) System.out.println("");
				}
			}
		}
		System.out.printf("\n一共有质数%d个\n",n);
		//  \n == %n
		//Java中使用%n表示换行符，实现平台无关性
	}

}
