package examples;
import static java.lang.System.out; //简化输出为out.println
import java.util.Arrays;

/**
 * 数组
 * @author zgq
 *
 */

public class shuzu {

	public static void main(String[] args) {
//		int a[]; // int[] a; 另一种写法
//		a = new int[5];
	int b[]= new int[] {12,34,56,27,45,80};
//		int i = 0;
//		while (i<5)
//		{
//			a[i] = i+1;
//			System.out.println(a[i]);
//			i++;
//		}
//		System.out.println("数组a的长度为" + a.length);
//		
		int[] c=Init(5);
		out.println("数组中各个随机数是：");
		for(int j=0;j<c.length;j++)
			System.out.println(c[j]);
		int d = SearchMax(c,5);
		System.out.println("数组中最大的数是" + d);
		
		int values [] = new int[] {18,62,68,82,65,9};
		for (int each : values )
		{
			System.out.printf("%d\t",each);
		}
		System.out.println("\n选择排序结果如下：");
		SelectSort (values);
		ArrayPrint(values);
		
		out.println("\n冒泡排序结果如下：");
		MaopaoSort (values);
		ArrayPrint(values);
		
		//复制数组的函数
		//System.arraycopy(src,srcPos,dest,destPos,length)
		out.println("\n复制后的c如下：");
		System.arraycopy(values, 2, c, 1, 4); //系统方法
		ArrayPrint(c);
		
		//合并数组
		//System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的起始位置
        //length: 复制的长度       
		out.println("\n合并后的数组如下：");
		int NewArray[] = new int[11];
		System.arraycopy(values, 0, NewArray, 0, values.length);
		System.arraycopy(c, 0, NewArray,values.length, c.length);
		ArrayPrint(NewArray);
		
		//随机数初始化二维数组，找出其最大数组元素
		int[][] ErWerArray = new int [5][5];
		out.println("\n生成二维数组如下：");
		InitEWA(ErWerArray);
		PrintEWA(ErWerArray);
		int Max = FindMaxEWA(ErWerArray);
		out.printf("\n二维数组最大元素为%d\n",Max);
		
		//测试toString方法，输出结果类似元组
		String content = Arrays.toString(values);
		out.println(content + "\n");
		
		//测试sort方法,binarySearch方法
		out.println(Arrays.toString(b));
		Arrays.sort(b);
		out.println(Arrays.toString(b));
		
        //使用binarySearch之前，必须先使用sort进行排序
        out.println("数字 34出现的位置下标值:"+Arrays.binarySearch(b, 34));
        //有多个相同元素时查询结果不确定
        
        //测试equals方法
        out.println(Arrays.equals(b, c));
        
        //填充fill
        int a[] = new int[10];
        Arrays.fill(a, 5);
        out.println(Arrays.toString(a));
        
        //二维数组排序
        int[][] EWA = new int [5][8];
		out.println("\n生成二维数组如下：");
		InitEWA(EWA); //生成
		PrintEWA(EWA); //打印
        EWAsort(EWA); //排序
        out.println("\n排序后二维数组如下：");
        PrintEWA(EWA); //打印
	}
		
	
	
	
			
	//生成指定长度的数组并赋值
	public static int[] Init(int length)
	{
		int a[];
		a = new int[length];
		for (int i =0; i < length ; i++)
		{
			a[i] = (int)(Math.random()*100); //给数组赋值，）0~100的随机整数			
		}
		return a;
	}
	
	//找出数组中最大的元素
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
	
	//选择排序,数组名为地址，相当于引用传递
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
	
	//冒泡排序,交换相邻逆序
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
	
	//增强型for循环输出数组元素
	public static void ArrayPrint(int a[])
	{
		for (int each : a )
		{
			System.out.printf("%d\t",each);
		}
	}
	
	//随机数初始化二维数组
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
	
	//打印二维数组
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
	
	//找二维数组的最大值
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
	
	//二维数组排序
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
