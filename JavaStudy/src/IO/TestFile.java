package IO;
/**
 * getAbsolutePath()
 */

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("d:/LOLFolder");
		System.out.println("f1的绝对路径："+f1.getAbsolutePath());
		
		//相对路径，相对于工作目录，如果在eclipse中，就是项目目录
		File f2 = new File("LOL.exe");
		System.out.println("f2的绝对路径："+f2.getAbsolutePath());
		
		//把f1作为父目录创建文件对象
		File f3 = new File(f1,"LOL.exe");
		
		System.out.println("f3的绝对路径："+f3.getAbsolutePath());
		
		
		File f = new File("d:/LOLFolder/LOL.exe");
		System.out.println("当前文件是："+f);
		
		System.out.println("判断文件是否存在"+f.exists());
		
		System.out.println("判断是否是文件夹："+f.isDirectory());
		
		System.out.println("判断是否是文件："+f.isFile());
		
		System.out.println("获取文件的长度："+f.length());
		
		
		//文件的常用方法
		
		f.list(); //以*字符串数组*形式返回当前文件夹下的
		//所有文件（不含子文件夹及子文件）
		
		File [] fs = f.listFiles();  //文件形式的均有File(s)
		//以*文件数组*的形式，返回当前文件夹下的所有文件（同不含）
		
		f.getParent();
		//以*字符串*形式返回获取所在文件夹
		
		f.getParentFile();
		//以*文件*形式返回获取所在文件夹
		
		f.mkdir();
		//创建文件夹，如果父文件夹skin不存在，创建就无效
		
		f.mkdirs();
		//创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
		
		//f.createNewFile();
		//创建一个空文件夹，如果父文件夹skin不存在，就会抛出异常
		//所以创建一个空文件夹之前，通常都会创建父文件夹
		f.getParentFile().mkdirs();
		
		f.listRoots();
		//列出所有的盘符
		
		f.delete();
		//删除文件
		
		f.deleteOnExit();
		//JVM结束时，删除文件，常用于临时文件的删除
		
		
		
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("获取文件的最后修改时间："+d);
		f.setLastModified(0);
		
		File f4 = new File("d:/LOLFolder/DOTA.exe");
		f.renameTo(f4); //文件重命名
		System.out.println("把LOL.exe改名为了DOTA.exe");
		
		System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,"
				+ "\r\n才可以看到对应文件长度修改时间等信息");
		
		
	}
}
