package digit;
/**
 * ��1~1000�������е�����
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
		System.out.printf("\nһ��������%d��\n",n);
		//  \n == %n
		//Java��ʹ��%n��ʾ���з���ʵ��ƽ̨�޹���
	}

}
