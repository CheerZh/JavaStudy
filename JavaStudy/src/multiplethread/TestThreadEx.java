package multiplethread;


import java.io.File;
  
/**
 * һ���̸߳��������ļ���
 * ��ÿ��Ŀ���ļ�����һ�����̣߳����ַ���
 */
public class TestThreadEx {
  
    public static void search(File file, String search) {
        if (file.isFile()) {
            if(file.getName().toLowerCase().endsWith(".java")){
            	System.out.println("������һ��Ŀ���ļ�"+file.getName());
                //���ҵ�.java�ļ���ʱ�򣬾�����һ���̣߳�����ר�ŵĲ���
                new SearchFileThread(file,search).start();
            }
        }
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (File f : fs) {
                search(f, search);
            }
        }
    }
      
    public static void main(String[] args) {
        File folder =new File("D:\\test");
        search(folder,"public");
    }
}