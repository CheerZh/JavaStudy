package IO;
/**
 * getAbsolutePath()
 */

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("d:/LOLFolder");
		System.out.println("f1�ľ���·����"+f1.getAbsolutePath());
		
		//���·��������ڹ���Ŀ¼�������eclipse�У�������ĿĿ¼
		File f2 = new File("LOL.exe");
		System.out.println("f2�ľ���·����"+f2.getAbsolutePath());
		
		//��f1��Ϊ��Ŀ¼�����ļ�����
		File f3 = new File(f1,"LOL.exe");
		
		System.out.println("f3�ľ���·����"+f3.getAbsolutePath());
		
		
		File f = new File("d:/LOLFolder/LOL.exe");
		System.out.println("��ǰ�ļ��ǣ�"+f);
		
		System.out.println("�ж��ļ��Ƿ����"+f.exists());
		
		System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
		
		System.out.println("�ж��Ƿ����ļ���"+f.isFile());
		
		System.out.println("��ȡ�ļ��ĳ��ȣ�"+f.length());
		
		
		//�ļ��ĳ��÷���
		
		f.list(); //��*�ַ�������*��ʽ���ص�ǰ�ļ����µ�
		//�����ļ����������ļ��м����ļ���
		
		File [] fs = f.listFiles();  //�ļ���ʽ�ľ���File(s)
		//��*�ļ�����*����ʽ�����ص�ǰ�ļ����µ������ļ���ͬ������
		
		f.getParent();
		//��*�ַ���*��ʽ���ػ�ȡ�����ļ���
		
		f.getParentFile();
		//��*�ļ�*��ʽ���ػ�ȡ�����ļ���
		
		f.mkdir();
		//�����ļ��У�������ļ���skin�����ڣ���������Ч
		
		f.mkdirs();
		//�����ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
		
		//f.createNewFile();
		//����һ�����ļ��У�������ļ���skin�����ڣ��ͻ��׳��쳣
		//���Դ���һ�����ļ���֮ǰ��ͨ�����ᴴ�����ļ���
		f.getParentFile().mkdirs();
		
		f.listRoots();
		//�г����е��̷�
		
		f.delete();
		//ɾ���ļ�
		
		f.deleteOnExit();
		//JVM����ʱ��ɾ���ļ�����������ʱ�ļ���ɾ��
		
		
		
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("��ȡ�ļ�������޸�ʱ�䣺"+d);
		f.setLastModified(0);
		
		File f4 = new File("d:/LOLFolder/DOTA.exe");
		f.renameTo(f4); //�ļ�������
		System.out.println("��LOL.exe����Ϊ��DOTA.exe");
		
		System.out.println("ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,"
				+ "\r\n�ſ��Կ�����Ӧ�ļ������޸�ʱ�����Ϣ");
		
		
	}
}
