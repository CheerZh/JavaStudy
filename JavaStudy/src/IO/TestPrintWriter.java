package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��lol2.txt��д���������
		File f = new File("d:/lol2.txt");
		
		try(
				//�����ļ��ַ���
				FileWriter fw = new FileWriter(f);
				//���������뽨����һ�����ڵ����Ļ�����
				PrintWriter pw = new PrintWriter(fw);
				
				){
			pw.println("garen kill teemo");
			pw.println("teemo revive after 1 minutes");
			pw.println("teemo try to garen,but killed again");
			
			pw.flush();//����������д�뵽Ӳ�̣����Ȼ�������
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
