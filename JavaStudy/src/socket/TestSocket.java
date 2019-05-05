package socket;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class TestSocket {
 
    public static void main(String[] args) throws IOException {
    	
    	//InetAddress�����ַ�࣬getLocalHost�������õ������ż�ip��ַ
        InetAddress host = InetAddress.getLocalHost();
        
        //getHostAddress�������ĵ�ַ��ip��ַ
        String ip =host.getHostAddress();
        System.out.println("����ip��ַ��" + ip);
        System.out.println("����������" + host);
        
        //ͨ�����̵õ�����ʱ������ϵͳ
        Process p = Runtime.getRuntime().exec("ping " + "169.254.184.105");
        
        //�õ�������������������Reader,����BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        
        //StringBulider��������String
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
            	
            	//ͨ��append��������String
                sb.append(line + "\r\n");
        }
        System.out.println("����ָ��ص���Ϣ�ǣ�");
        System.out.println(sb.toString());
    }
}