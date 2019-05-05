package IO;

/**
 * ����������൱�ڹܵ�
 * 
 * �������ֹرշ�ʽ
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
		//���·������ϻ�������ʹ��
		
		
		FileOutputStream foss=null;
		FileInputStream fiss=null;
		
	try {
		FileInputStream fis=new FileInputStream(srcFile);
		FileOutputStream fos=null;
		System.out.println("�ļ�����:"+srcFile.getName());
		System.out.println("�ļ���С:"+srcFile.length()/1024+"KB");
		//�ܴ�С
		int fileSize=(int) (srcFile.length()/1024);
		//����
		int surplus=(fileSize%100)*1024;
		byte [] readSize;
		for(int i=0;i<fileSize/100+1;i++) {
			destFile=new File("D:/TEST/TEST-"+i+".exe"); 
			//�Ƚ����ַ������㣬�ٴ����ļ����ʿ���
			//��ָ���ļ��������ļ�
			fos=new FileOutputStream(destFile);
			if(i<fileSize/100) {
				readSize=new byte[1024*100]; //100k
				fis.read(readSize); //����������100k
				fos.write(readSize); //�����д��100k
			}
			else {
				readSize=new byte[surplus];
				fis.read(readSize); //�������µ�����
				fos.write(readSize); //д�����µ�����
			}
			System.out.println("������ļ�"+destFile.getName()+
					",���С��"+destFile.length()+"�ֽ�");
			
			
			//�ϲ��ļ�
			fiss=new FileInputStream(destFile);
			byte writeSize[]=new byte[(int) destFile.length()];
			fiss.read(writeSize);
			foss=new FileOutputStream(ff,true); //***
			//***true***��ʾд���ļ�ĩβ�������Ǵ�ͷ����
			
			foss.write(writeSize);
		}
		System.out.println("���Դ�ļ�"+ff.getName()+
				",���С��"+ff.length()/1024+"KB");
		
		
		fis.close();
		//����������try���棬��������쳣�޷���ȷ�رգ����Ƽ�
		
		
		//fos.close();
		//����**������try()��**,try,catch����finally������ʱ��
//		���Զ��ر�,���ֱ�д����ķ�ʽ���� try-with-resources�� 
//		���Ǵ�JDK7��ʼ֧�ֵļ���
		
		
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//	1. ���Ȱ���������������try�����棬���������try����
//	�����������޷��ִ�finally.
//	2. ��finally�ر�֮ǰ��Ҫ���жϸ������Ƿ�Ϊ��
//	3. �رյ�ʱ����Ҫ��һ�ν���try catch����

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