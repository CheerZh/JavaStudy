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
			
			//�����ļ���������
			FileInputStream fis = new FileInputStream(f);
			// ͨ��������������Ϳ��԰����ݴ�Ӳ�̣�
			//��ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
			byte [] all = new byte[(int) f.length()];
			//�����ֽ����飬�䳤�Ⱦ����ļ�����
			
			
			fis.read(all);
			
			for(byte b :all) {
				System.out.println(b);
				
			}
			
			fis.close(); //�������������йر�
			
			
			//���ļ�д������
			File f2 = new File("d:/test/io/lol2.txt");
			//·�����ļ����Ƕ�����
			File dir = f2.getParentFile(); //�õ�·��
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
