package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class TestBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
		
		File f = new File("d:/lol.txt");
		
		//�����ļ��ַ���
		//���������뽨����һ�����ڵ����Ļ�����
		
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				){
			while(true) {
				//һ�ζ�һ��
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
