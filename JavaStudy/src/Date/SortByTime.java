package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SortByTime {
	public static void main(String[] args) {

		Date[] dates = new Date[9];
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startDate = null; // 开始日期
		Date endDate = null; // 结束日期
		try {
			startDate = formatter.parse("1970-01-01 00:00:00");
			endDate = formatter.parse("2000-12-31 23:59:59");
		} catch (ParseException e) {  
			//将出现的异常命名为e????
			//生成一个异常报告类型的对象e?????
			e.printStackTrace();
		}
		// 填充数组
		for (int i = 0; i < dates.length; i++) {
			dates[i] = generateDate(startDate, endDate); //方法首字母不大写
		}
		System.out.println("得到的随机日期数组：");
		printDates(dates);
		
		/*
		 * 使用选择排序对日期数组进行排序
		 */
		for (int i = 0; i < dates.length - 1; i++) {
			for (int j = i + 1; j < dates.length; j++) {
				String str1 = dateToString(dates[i], "HHmmss");//自己定义的dateToString方法，见最后
				String str2 = dateToString(dates[j], "HHmmss");
				int num1 = Integer.parseInt(str1); //parseInt()方法
				int num2 = Integer.parseInt(str2);
				if (num1 > num2) {
					Date temp = dates[i];
					dates[i] = dates[j];
					dates[j] = temp;
				}
			}
		}
		System.out.println("排序后的随机日期数组：");
		printDates(dates);
	}

	/**
	 * 打印日期
	 * @param dates 存储日期的数组
	 */
	public static void printDates(Date[] dates) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		for (int i = 0; i < dates.length; i++) {
			System.out.print(formatter.format(dates[i]) + "\t");
			if (i % 3 == 2) {//2??????????
				//因为下标从0开始，0,1,2    3,4,5
				System.out.println();
			}
		}
	}

	/**
	 * 随机生成指定的两个日期之间的日期
	 * @param startDate 开始日期
	 * @param endDate 结束日期
	 *
	 * @return 两个日期之间的一个随机日期
	 */
	public static Date generateDate(Date startDate, Date endDate) {
		long startMilli = startDate.getTime();  //日期转换成毫秒
		long endMilli = endDate.getTime();
		long randomMilli = (long) (Math.random() * (endMilli - startMilli + 1) + startMilli);
		return new Date(randomMilli);
	}

	/**
	 * 给定一个日期对象和样式
	 * 按照给定的样式，获取日期的字符串表示
	 * @param date 日期对象
	 * @param pattern 日期样式
	 * @return 日期的字符串表示
	 */
	public static String dateToString(Date date, String pattern) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.format(date);
	}
}