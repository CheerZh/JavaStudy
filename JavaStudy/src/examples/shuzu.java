package examples;
import static java.lang.System.out; //�����Ϊout.println
import java.util.Arrays;

/**
 * ����
 * @author zgq
 *
 */

public class shuzu {

	public static void main(String[] args) {
//		int a[]; // int[] a; ��һ��д��
//		a = new int[5];
	int b[]= new int[] {12,34,56,27,45,80};
//		int i = 0;
//		while (i<5)
//		{
//			a[i] = i+1;
//			System.out.println(a[i]);
//			i++;
//		}
//		System.out.println("����a�ĳ���Ϊ" + a.length);
//		
		int[] c=Init(5);
		out.println("�����и���������ǣ�");
		for(int j=0;j<c.length;j++)
			System.out.println(c[j]);
		int d = SearchMax(c,5);
		System.out.println("��������������" + d);
		
		int values [] = new int[] {18,62,68,82,65,9};
		for (int each : values )
		{
			System.out.printf("%d\t",each);
		}
		System.out.println("\nѡ�����������£�");
		SelectSort (values);
		ArrayPrint(values);
		
		out.println("\nð�����������£�");
		MaopaoSort (values);
		ArrayPrint(values);
		
		//��������ĺ���
		//System.arraycopy(src,srcPos,dest,destPos,length)
		out.println("\n���ƺ��c���£�");
		System.arraycopy(values, 2, c, 1, 4); //ϵͳ����
		ArrayPrint(c);
		
		//�ϲ�����
		//System.arraycopy(src, srcPos, dest, destPos, length)
        //src: Դ����
        //srcPos: ��Դ���鸴�����ݵ���ʼλ��
        //dest: Ŀ������
        //destPos: ���Ƶ�Ŀ���������ʼλ��
        //length: ���Ƶĳ���       
		out.println("\n�ϲ�����������£�");
		int NewArray[] = new int[11];
		System.arraycopy(values, 0, NewArray, 0, values.length);
		System.arraycopy(c, 0, NewArray,values.length, c.length);
		ArrayPrint(NewArray);
		
		//�������ʼ����ά���飬�ҳ����������Ԫ��
		int[][] ErWerArray = new int [5][5];
		out.println("\n���ɶ�ά�������£�");
		InitEWA(ErWerArray);
		PrintEWA(ErWerArray);
		int Max = FindMaxEWA(ErWerArray);
		out.printf("\n��ά�������Ԫ��Ϊ%d\n",Max);
		
		//����toString����������������Ԫ��
		String content = Arrays.toString(values);
		out.println(content + "\n");
		
		//����sort����,binarySearch����
		out.println(Arrays.toString(b));
		Arrays.sort(b);
		out.println(Arrays.toString(b));
		
        //ʹ��binarySearch֮ǰ��������ʹ��sort��������
        out.println("���� 34���ֵ�λ���±�ֵ:"+Arrays.binarySearch(b, 34));
        //�ж����ͬԪ��ʱ��ѯ�����ȷ��
        
        //����equals����
        out.println(Arrays.equals(b, c));
        
        //���fill
        int a[] = new int[10];
        Arrays.fill(a, 5);
        out.println(Arrays.toString(a));
        
        //��ά��������
        int[][] EWA = new int [5][8];
		out.println("\n���ɶ�ά�������£�");
		InitEWA(EWA); //����
		PrintEWA(EWA); //��ӡ
        EWAsort(EWA); //����
        out.println("\n������ά�������£�");
        PrintEWA(EWA); //��ӡ
	}
		
	
	
	
			
	//����ָ�����ȵ����鲢��ֵ
	public static int[] Init(int length)
	{
		int a[];
		a = new int[length];
		for (int i =0; i < length ; i++)
		{
			a[i] = (int)(Math.random()*100); //�����鸳ֵ����0~100���������			
		}
		return a;
	}
	
	//�ҳ�����������Ԫ��
	public static int SearchMax(int a[], int length)
	{
		int Max = a[0];
		for (int i=0;i<length;i++)
		{
			if (a[i]>Max )
				Max = a[i];		
		}
			
		return Max;
	}
	
	//ѡ������,������Ϊ��ַ���൱�����ô���
	public static void SelectSort(int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=i; j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
	}
	
	//ð������,������������
	public static void MaopaoSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
	}
	
	//��ǿ��forѭ���������Ԫ��
	public static void ArrayPrint(int a[])
	{
		for (int each : a )
		{
			System.out.printf("%d\t",each);
		}
	}
	
	//�������ʼ����ά����
	public static void InitEWA(int[][]a)
	{
		int b = a.length;
		int c = a[0].length;
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = (int)(Math.random()*100);
			}
		}
	}
	
	//��ӡ��ά����
	public static void PrintEWA(int[][]a)
	{
		int b = a.length;
		int c = a[0].length;
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<c;j++)
			{
				out.printf("%d\t",a[i][j]);
			}
			out.println("");
		}
	}
	
	//�Ҷ�ά��������ֵ
	public static int FindMaxEWA(int[][] a)
	{
		int b = a.length;
		int c = a[0].length;
		int Max=a[0][0];
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j] > Max)
				{
					Max = a[i][j];
				}
			}
		}
		return Max;
	}
	
	//��ά��������
	public static void EWAsort(int [][]a)
	{
		int b[] = new int [a.length * a[0].length];
		for(int i=0;i<a.length;i++)
		{
			System.arraycopy(a[i],0,b,i*a[i].length,a[i].length);
		}
		Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			System.arraycopy(b,i*a[i].length,a[i],0,a[i].length);
		}
	}
}
