package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class UnicodeToUTF {

	public static void main(String[] args) 
			throws UnsupportedEncodingException{
		// TODO Auto-generated method stub
		
		File f = new File("d:/test.txt");
		File f2 = new File("d:/test2.txt");
		//�������޸��ļ���
		try(
				FileInputStream isr = new FileInputStream(f);
				//FileInputStream���ֽ���
				FileWriter fr = new FileWriter(f2);
				//FileWriter���ַ���
				){
			byte[] cs = new byte[(int)f.length()];
			isr.read(cs);
			String str =new String(cs,"UTF-8");
			//���ֽ��밴UTF-8��ʽ������ַ���
			String str2 = str.replaceAll("//?", " ");
			char[] cs2 = new char[str2.length()];
			cs2 = str2.toCharArray();
			fr.write(cs2);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
