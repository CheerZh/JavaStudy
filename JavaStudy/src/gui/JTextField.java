package gui;
 
import java.awt.Dimension;
import java.awt.FlowLayout;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class JTextField {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        f.setLayout(new FlowLayout());
 
        JLabel lName = new JLabel("�˺ţ�");
        // �����
        javax.swing.JTextField tfName = new javax.swing.JTextField("");
        tfName.setText("�������˺�");
        //���ý����Сֵ
        tfName.setPreferredSize(new Dimension(80, 30));
 
        JLabel lPassword = new JLabel("���룺");
        // �����
        javax.swing.JTextField tfPassword = new javax.swing.JTextField("");
        tfPassword.setText("����������");
        tfPassword.setPreferredSize(new Dimension(80, 30));
 
        f.add(lName);
        f.add(tfName);
        f.add(lPassword);
        f.add(tfPassword);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
        tfPassword.grabFocus();
    }
}