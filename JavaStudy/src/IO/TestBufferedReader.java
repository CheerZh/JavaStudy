package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class TestBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
		
		File f = new File("d:/lol.txt");
		
		//创建文件字符流
		//缓冲流必须建立在一个存在的流的基础上
		
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				){
			while(true) {
				//一次读一行
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
