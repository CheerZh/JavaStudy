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
		
		//�ж��ļ��Ƿ���ڣ������������Ŵ���
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
					//�ַ���
					BufferedReader br = new BufferedReader(fr);
					//�������������ֽ���������
					FileWriter fw = new FileWriter(f1);
					PrintWriter bw = new PrintWriter(fw);
					){
				
				Scanner s =new Scanner(System.in);
				//��Scannerʵ�ֽ���
				
				System.out.println("����������������@����");
				String str = s.nextLine();
				
				//��������ʹ��
				bw.println(str);   //���������
				
				bw.flush();//***����д�룬��Ҫ�Ȼ�������***
				
				String line = br.readLine();  //����������
				System.out.println(line);
				String Strs [] = line.split("@");
				System.out.println("���������Ϊ��");
				for(String each : Strs) {   //��ǿ��for
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
					System.out.println("����������������");
					
					//������ʹ�÷���
					int a1 = s.nextInt();
					int a2 = s.nextInt();
					
					dos.writeInt(a1); //���������
					dos.writeInt(a2);
					System.out.println("���������Ϊ��");
					
					System.out.println(dis.readInt()); //����������
					System.out.println(dis.readInt());
					
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
	
			}
		
}
