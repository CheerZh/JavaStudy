package Exception;
/**
 * ���ࣺ
 * ��������ʱ�쳣���ɲ��쳣����
 * @author zgq
 *
 */

public class TestError {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		//����ϵͳ������쳣���ڴ�����ջ��
		
	try {
		for (int i=0;i<Integer.MAX_VALUE;i++) {
	
			sb.append('a');
		}
	}catch(Error e){ //Error ����  Exception
			
		System.out.println("�����ڴ治��");
		
		}
	
	
	//����ʱ�쳣����0���±�Խ�磻��ָ��
	try {
		int []a =new int[10];
		for(int i=0;i<=10;i++) {
			a[i]=i;
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("����ʱ�쳣���±�Խ��");
	}

	}

}
