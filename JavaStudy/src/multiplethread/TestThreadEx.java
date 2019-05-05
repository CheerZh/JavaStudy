package multiplethread;


import java.io.File;
  
/**
 * 一个线程负责搜索文件，
 * 对每个目标文件产生一个新线程，找字符串
 */
public class TestThreadEx {
  
    public static void search(File file, String search) {
        if (file.isFile()) {
            if(file.getName().toLowerCase().endsWith(".java")){
            	System.out.println("这里有一个目标文件"+file.getName());
                //当找到.java文件的时候，就启动一个线程，进行专门的查找
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