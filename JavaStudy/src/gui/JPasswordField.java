package gui;
 
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class JPasswordField {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        f.setLayout(new FlowLayout());
 
        JLabel l = new JLabel("密码：");
        // 密码框
        javax.swing.JPasswordField pf = new javax.swing.JPasswordField("");
        pf.setText("&48kdh4@#");
        pf.setPreferredSize(new Dimension(80, 30));
 
        // 与文本框不同，获取密码框里的内容，推荐使用getPassword
        // 该方法会返回一个字符数组，而非字符串
        char[] password = pf.getPassword();
        //字符数组转字符串
        String p = String.valueOf(password);
        System.out.println(p);
 
        f.add(l);
        f.add(pf);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}