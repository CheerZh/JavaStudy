package digit;

import java.math.BigInteger; //����

public class TestMath {
	
	public static void main(String[] args) {
		float f1 = 5.4f;
		float f2 = 5.5f;
		
		//��������
		System.out.println(Math.round(f1));
		System.out.println(Math.round(f2));
		
		//�õ�һ��0-1֮��������������ȡ����1��
		System.out.println(Math.random()); 
		//������дΪrandom
		System.out.println((int)( Math.random()*10));
		
		//����
		System.out.println(Math.sqrt(9));
		
		//�ݺ�����2��4�η���
		System.out.println(Math.pow(2,4));
		
		//��
		System.out.println(Math.PI);
		
		//��Ȼ����
		System.out.println(Math.E);
		
		int n = Integer.MAX_VALUE;
		double e = Math.pow(1 + 1d/n, n);
		System.out.println(e);
	}
}
