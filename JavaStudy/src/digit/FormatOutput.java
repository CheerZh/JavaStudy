package digit;
/**
 * 
 * @author
 *
 */
import java.util.Scanner;
public class FormatOutput {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); 
		 //创建一个有名字的Scanner,其参数为系统方法in
         
         System.out.printf("请输入地名：%n");
         String place = s.nextLine();
         //调用Scanner的方法
          
         System.out.printf("请输入公司类型：%n");
         String company = s.nextLine();
          
         System.out.printf("请输入公司名称：%n");
         String companyName = s.nextLine();
          
         System.out.printf("请输入老板名字：%n");
         String boos = s.nextLine();
          
         System.out.printf("请输入金额：%n");
         long money = s.nextInt();
          
         System.out.printf("请输入产品：%n");
         String rn = s.nextLine();
         String products = s.nextLine();
          
         System.out.printf("请输入价格计量单位：%n");
         String price = s.nextLine();
          
         String str = "%s最大%s%s倒闭了，%n"
         		+ "王八蛋老板%s吃喝嫖赌，欠下了%d个亿，%n"
                 + "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!%n"
                 + "原价都是一%s多、两%s多、三%s多的钱包，现在全部只卖二十块，%n"
                 +"统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，%n"
                 +"你不发工资，你还我血汗钱，还我血汗钱!";
         System.out.format(str, place,company,companyName,boos,money,products,price,price,price,boos);

	}

}
