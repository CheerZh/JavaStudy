package gui;
  
import java.awt.Dimension;
import java.awt.FlowLayout;
  
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JTextArea {
    public static void main(String[] args) {
  
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
  
        f.setLayout(new FlowLayout());
  
        JLabel l = new JLabel("�ı���");
  
        javax.swing.JTextArea ta = new javax.swing.JTextArea();
        ta.setPreferredSize(new Dimension(200, 150));
        //\n���з�
        ta.setText("������ô˧��\n�ڱ�Ĺ�����\n");
        //׷������
        ta.append("��������Ŷ��������������������������������������");
        //�����Զ�����
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}