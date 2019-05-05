package IO;
import java.io.File;

public class TravelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("c:\\windows");  //文件路径中：\\等价于：/
		File [] fs = f.listFiles(); //f.listFiles()获取文件数组
		
		if (null==fs) {
			return;
		}
		long minSize = Integer.MAX_VALUE; //整形最大值
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		for(File file :fs) {
			if(file.isFile()) {
				System.out.println(file.getName()+"文件");
				if(file.length()>maxSize) {
					maxSize = file.length(); //单位Byte
					maxFile = file;
					
				}
				if(file.length()!=0 && file.length()<minSize) {
					minSize = file.length();
					minFile = file; 
				}
				
				
			}
			
			//遍历子文件
			else if(file.isDirectory()) {
				
				System.out.println(file.getName()+"文件夹");
				File[] fd = file.listFiles();
				if(fd != null) {
					for(File sd:fd) {
						System.out.println(sd.getName()+"子文件");
						//listFiles();
					}
				}
			}
			
		}
		System.out.printf("最大的文件是%s,其大小是%,d"
				+ "字节%n",maxFile.getAbsoluteFile(),maxFile.length());
		
		//file.getAbsoluteFile()获取文件名及其路径
		System.out.printf("最小的文件是%s,其大小是%,d" 
				+"字节%n",minFile.getAbsoluteFile(),minFile.length());
	}

}
