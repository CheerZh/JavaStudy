package socket;
  
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

   
public class Server {
   
    public static void main(String[] args)  {
        try {
            //����˴򿪶˿�8888
            ServerSocket ss = new ServerSocket(8888);
               
            //��8888�˿��ϼ��������Ƿ��������������
            System.out.println("�����ڶ˿ں�:8888");
            //��������
            Socket s =  ss.accept();
               
            System.out.println("�����ӹ���" + s);
             
          //��������
            InputStream is = s.getInputStream();
 
            //����������װ��DataInputStream
            DataInputStream dis = new DataInputStream(is);
            //ʹ��readUTF��ȡ�ַ���
            String msg = dis.readUTF();
            System.out.println(msg);
 
            s.close();
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}