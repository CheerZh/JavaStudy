package IO;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			File f = new File("d:/lol.txt");
			
			//创建文件的输入流
			FileInputStream fis = new FileInputStream(f);
			// 通过这个输入流，就可以把数据从硬盘，
			//读取到Java的虚拟机中来，也就是读取到内存中
			byte [] all = new byte[(int) f.length()];
			//创建字节数组，其长度就是文件长度
			
			
			fis.read(all);
			
			for(byte b :all) {
				System.out.println(b);
				
			}
			
			fis.close(); //用完流，都进行关闭
			
			
			//向文件写入数据
			File f2 = new File("d:/test/io/lol2.txt");
			//路径和文件名是独立的
			File dir = f2.getParentFile(); //得到路径
			if(!dir.exists()) {
				dir.mkdirs();
			}
			byte [] data = {88,89};
			FileOutputStream fos = new FileOutputStream(f2);
			fos.write(data);
			fos.close();
			
		}
		catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
}
