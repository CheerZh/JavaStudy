package digit;

public class TestNumber {
	
	public static void main(String[] args) {
		int i = 5;
		//��һ���������͵ı�����ת����Integer����
		Integer it = new Integer(i);
		System.out.println(it instanceof Number); //instanceof
		//��һ��Integer����ת��Ϊһ���������͵�int
		int i2 = it.intValue();
		
		//�Զ�ת���ͽ���װ��
		Integer it2 = i;
		int i3 = it;
		String str3 = "999";
		
		
		//����ת�����ַ���
		//����1
		String str = String.valueOf(i); //��дO????
		
		//����2
		Integer it3 = i;
		String str2 = it3.toString();
		
		
		//�ַ���ת��������
		int i4 = Integer.parseInt(str3);
		
		//******************************
		//��ҵ��
//		�Ѹ����� 3.14 ת��Ϊ �ַ��� "3.14"
//		�ٰ��ַ��� ��3.14�� ת��Ϊ ������ 3.14
		
/*1	*/	float f1 = 3.14f;
		//String strf = f1.toString(); ����float Ϊ��������
		//ʹ��toString�������Ƚ����װ�ɶ���,����
		Float Ff1 = f1;
		String strf0 = Ff1.toString();
		
		//����ʹ��String��valueOf����
		String strf1 = String.valueOf(f1);
		
		
/*2	*/	f1 = Float.parseFloat(strf0);	
//���Ƶ���Float��parseFloat����

		//*******************************
		
		
		System.out.println(i3);
		System.out.println(it2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(i4);
	}

}
