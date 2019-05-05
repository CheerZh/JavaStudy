package Date;
/*****
 * 
 * Calendar c = Calendar.getInstance() //获取日历对象
 * Date d = c.getTime() //通过日历得到日期
 * c.setTime(d) //把日历调成日期d
 * c.add(Calendar.MONTH,1) //更改月份
 * c.add(Calendar.YEAR,1) //更改年份
 * c.add(Calendar.DATE,1) //更改日期 
 * c.set(c.DATE,3) //设置日历的日期/月份/年份
 * int d = c.getMaximum(c.DATE) //获取天数/月份的最大值
 * c.set(Calendar.DATE, -2); //返回倒数第三天
 * c.set(Calendar.DATE, 0); //设0返回最后一天!!!
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestCalendar {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		
		//采用单例模式获取日历对象Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		
		//通过日历对象得到日期对象
		
		Date now = c.getTime();
		
		System.out.println("当前日期：\t" + format(c.getTime()));
		
		//下个月的今天
		c.setTime(now);
		c.add(Calendar.MONTH, 1);//在month上加1
		System.out.println("下个月的今天：\t"+format(c.getTime()));
		
		//去年的今天
		c.setTime(now);
		c.add(Calendar.YEAR, -1);//在YEAR上加-1
		System.out.println("去年的今天：\t" + format(c.getTime()));
		
		//上个月的第三天
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DATE, 3);
		System.out.println("上个月的第三天：\t"+format(c.getTime()));
		
		//作业：
		//下个月的倒数第三天
		c.setTime(now);
		c.add(c.MONTH, 1);
		int d = c.getMaximum(c.DATE); //获取当月最大日期
		//c.set(Calendar.DATE, -3); 
		c.set(Calendar.DATE, -2);
		c.set(Calendar.DATE, 0); //设0返回最后一天??
		c.set(c.DATE,d-3); 
		System.out.println("下个月的倒数第三天：\t"+format(c.getTime()));
		Date d2 = new Date(0);
		
		c.setTime(d2); //把这个日历的日期调成1970.1.1 08：00:00
		
	}
	private static String format (Date time) {
		return sdf.format(time);
	}
}
