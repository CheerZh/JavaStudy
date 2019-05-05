package digit;

import java.math.BigInteger; //大数

public class TestMath {
	
	public static void main(String[] args) {
		float f1 = 5.4f;
		float f2 = 5.5f;
		
		//四舍五入
		System.out.println(Math.round(f1));
		System.out.println(Math.round(f2));
		
		//得到一个0-1之间的随机浮点数（取不到1）
		System.out.println(Math.random()); 
		//完整地写为random
		System.out.println((int)( Math.random()*10));
		
		//开方
		System.out.println(Math.sqrt(9));
		
		//幂函数（2的4次方）
		System.out.println(Math.pow(2,4));
		
		//π
		System.out.println(Math.PI);
		
		//自然常数
		System.out.println(Math.E);
		
		int n = Integer.MAX_VALUE;
		double e = Math.pow(1 + 1d/n, n);
		System.out.println(e);
	}
}
