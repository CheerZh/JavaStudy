package socket;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class TestSocket {
 
    public static void main(String[] args) throws IOException {
    	
    	//InetAddress网络地址类，getLocalHost方法，得到主机号加ip地址
        InetAddress host = InetAddress.getLocalHost();
        
        //getHostAddress，主机的地址即ip地址
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
        System.out.println("本机主机：" + host);
        
        //通过进程得到运行时环境：系统
        Process p = Runtime.getRuntime().exec("ping " + "169.254.184.105");
        
        //得到输入流，构造输入流Reader,构造BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        
        //StringBulider用于连接String
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
            	
            	//通过append方法连接String
                sb.append(line + "\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}