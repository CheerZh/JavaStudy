package digit;

import java.util.Locale;
/**
 * 格式化输出
 * @author zgq
 *
 */

public class TestGeSHI {

	public static void main(String[] args) {
		int year = 2020;

//总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
		
		
//		总长度是8,
//		默认***右对齐****  
//		format == printf	
		System.out.format("%8d%n",year);
		//总长度10,左对齐
		System.out.format("%-10d%n",year);
		
		
		//总长度是8,不够补0
        System.out.format("\n%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);
        
        //小数点位数
        System.out.format("\n%.4f%n",Math.PI);
        
      //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
	}

}
