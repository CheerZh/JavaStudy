package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("d:/test1.txt");
		File f2 = new File("d:/test2.txt");
		BufferedWay(f1);
		DataStreamWay(f2);

	}
	
	public static void BufferedWay(File f1) {
		
		//判断文件是否存在，不存在则试着创建
		if(!f1.exists()) {
			try{
				f1.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			
			try(
					FileReader fr = new FileReader(f1);
					//字符流
					BufferedReader br = new BufferedReader(fr);
					//缓存流建立在字节流基础上
					FileWriter fw = new FileWriter(f1);
					PrintWriter bw = new PrintWriter(fw);
					){
				
				Scanner s =new Scanner(System.in);
				//用Scanner实现交互
				
				System.out.println("请输入两个数，以@隔开");
				String str = s.nextLine();
				
				//缓存流的使用
				bw.println(str);   //缓存输出流
				
				bw.flush();//***立即写入，不要等缓存区满***
				
				String line = br.readLine();  //缓存输入流
				System.out.println(line);
				String Strs [] = line.split("@");
				System.out.println("你输入的数为：");
				for(String each : Strs) {   //增强型for
					System.out.println(Integer.parseInt(each));
				}
				
			}catch(Exception e) 
			
			{
				e.printStackTrace();
			}
		}
	}
		
	public static void DataStreamWay(File f) {
		
		if(!f.exists()) {
			try{f.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
				
				try(FileInputStream fis = new FileInputStream(f);
						DataInputStream dis = new DataInputStream(fis);
						FileOutputStream fos = new FileOutputStream(f);
						DataOutputStream dos = new DataOutputStream(fos);
						){
					Scanner s = new Scanner(System.in);
					System.out.println("请依次输入两个数");
					
					//数据流使用方法
					int a1 = s.nextInt();
					int a2 = s.nextInt();
					
					dos.writeInt(a1); //数据输出流
					dos.writeInt(a2);
					System.out.println("你输入的数为：");
					
					System.out.println(dis.readInt()); //数据输入流
					System.out.println(dis.readInt());
					
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
	
			}
		
}
