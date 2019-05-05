package multiplethread;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class SearchFileThread extends Thread{
 
    private File file;
    private String search;
    public SearchFileThread(File file,String search) {
        this.file = file;
        this.search= search;
    }
     
    public void run(){
        String fileContent = readFileConent(file);
        if(fileContent.contains(search)){
            System.out.printf("找到子目标字符串%s,在文件:%s%n",search,file);
        }
    }
     
    public String readFileConent(File file){
        try (FileReader fr = new FileReader(file)) {
            char[] all = new char[(int) file.length()];
            fr.read(all);   //将文件内容读入到char[]数组中
            return new String(all);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } 
    }  
}