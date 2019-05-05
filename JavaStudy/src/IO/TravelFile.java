package IO;
import java.io.File;

public class TravelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("c:\\windows");  //�ļ�·���У�\\�ȼ��ڣ�/
		File [] fs = f.listFiles(); //f.listFiles()��ȡ�ļ�����
		
		if (null==fs) {
			return;
		}
		long minSize = Integer.MAX_VALUE; //�������ֵ
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		for(File file :fs) {
			if(file.isFile()) {
				System.out.println(file.getName()+"�ļ�");
				if(file.length()>maxSize) {
					maxSize = file.length(); //��λByte
					maxFile = file;
					
				}
				if(file.length()!=0 && file.length()<minSize) {
					minSize = file.length();
					minFile = file; 
				}
				
				
			}
			
			//�������ļ�
			else if(file.isDirectory()) {
				
				System.out.println(file.getName()+"�ļ���");
				File[] fd = file.listFiles();
				if(fd != null) {
					for(File sd:fd) {
						System.out.println(sd.getName()+"���ļ�");
						//listFiles();
					}
				}
			}
			
		}
		System.out.printf("�����ļ���%s,���С��%,d"
				+ "�ֽ�%n",maxFile.getAbsoluteFile(),maxFile.length());
		
		//file.getAbsoluteFile()��ȡ�ļ�������·��
		System.out.printf("��С���ļ���%s,���С��%,d" 
				+"�ֽ�%n",minFile.getAbsoluteFile(),minFile.length());
	}

}
