package IO;
/**
 * FileReader / FileWriter
 * 
 * @author zgq
 *
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("d:/lol.txt");
		//准备文件
		try (FileReader fr = new FileReader(f)){
			char [] all = new char[(int)f.length()];
			//创建字符数组，其长度是文件的长度
			fr.read(all);
			for(char b : all) {
				System.out.println(b);
			}
		}
		catch(IOException e ) {
				e.printStackTrace();
		}
		
		File f1 = new File("d:/lol2.txt");
		try (FileWriter fr = new FileWriter(f1)){
			String data ="abcdefg1234567890";
			char [] cs = data.toCharArray();
			fr.write(cs);
					
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
				
}


