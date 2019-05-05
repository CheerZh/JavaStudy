package IO;

/**
 * 输入输出流相当于管道
 * 
 * 流的三种关闭方式
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
	public static void splitAndMergeFile(File srcFile) {
		File destFile;
		File ff=new File("D:/TEST/TEST1.exe");
		//组合路径，组合还能正常使用
		
		
		FileOutputStream foss=null;
		FileInputStream fiss=null;
		
	try {
		FileInputStream fis=new FileInputStream(srcFile);
		FileOutputStream fos=null;
		System.out.println("文件名称:"+srcFile.getName());
		System.out.println("文件大小:"+srcFile.length()/1024+"KB");
		//总大小
		int fileSize=(int) (srcFile.length()/1024);
		//余数
		int surplus=(fileSize%100)*1024;
		byte [] readSize;
		for(int i=0;i<fileSize/100+1;i++) {
			destFile=new File("D:/TEST/TEST-"+i+".exe"); 
			//先进行字符串运算，再创建文件，故可行
			//以指定文件名创建文件
			fos=new FileOutputStream(destFile);
			if(i<fileSize/100) {
				readSize=new byte[1024*100]; //100k
				fis.read(readSize); //输入流读入100k
				fos.write(readSize); //输出流写回100k
			}
			else {
				readSize=new byte[surplus];
				fis.read(readSize); //读入余下的数据
				fos.write(readSize); //写回余下的数据
			}
			System.out.println("输出子文件"+destFile.getName()+
					",其大小是"+destFile.length()+"字节");
			
			
			//合并文件
			fiss=new FileInputStream(destFile);
			byte writeSize[]=new byte[(int) destFile.length()];
			fiss.read(writeSize);
			foss=new FileOutputStream(ff,true); //***
			//***true***表示写入文件末尾，而不是从头覆盖
			
			foss.write(writeSize);
		}
		System.out.println("输出源文件"+ff.getName()+
				",其大小是"+ff.length()/1024+"KB");
		
		
		fis.close();
		//若流定义在try外面，如果出现异常无法正确关闭，不推荐
		
		
		//fos.close();
		//把流**定义在try()里**,try,catch或者finally结束的时候，
//		会自动关闭,这种编写代码的方式叫做 try-with-resources， 
//		这是从JDK7开始支持的技术
		
		
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//	1. 首先把流的引用声明在try的外面，如果声明在try里面
//	，其作用域无法抵达finally.
//	2. 在finally关闭之前，要先判断该引用是否为空
//	3. 关闭的时候，需要再一次进行try catch处理

	finally {
		
		if(null != fiss && null != foss) {
			try {
				fiss.close();
				foss.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	}
public static void main(String[] args) {
	File f=new File("D:/TEST/TEST.exe");
	splitAndMergeFile(f);
}
}