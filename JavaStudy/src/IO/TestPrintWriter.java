package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//向lol2.txt中写入三行语句
		File f = new File("d:/lol2.txt");
		
		try(
				//创建文件字符流
				FileWriter fw = new FileWriter(f);
				//缓存流必须建立在一个存在的流的基础上
				PrintWriter pw = new PrintWriter(fw);
				
				){
			pw.println("garen kill teemo");
			pw.println("teemo revive after 1 minutes");
			pw.println("teemo try to garen,but killed again");
			
			pw.flush();//立即把数据写入到硬盘，不等缓冲区满
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
