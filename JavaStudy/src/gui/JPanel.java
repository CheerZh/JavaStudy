package gui;
 
import java.awt.Color;
import java.awt.FlowLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;

public class JPanel {
    public static void main(String[] args) {
 
    	javax.swing.JFrame f = new javax.swing.JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        f.setLayout(null);
        
        //JPanel1
 
        javax.swing.JPanel p1 = new javax.swing.JPanel();
        // ��������С
        p1.setBounds(50, 50, 300, 60);
        
        // ������屳����ɫ
        p1.setBackground(Color.RED);
 
        // ��һ�����û�У���ΪJPanelĬ�Ͼ��ǲ��õ�FlowLayout
        p1.setLayout(new FlowLayout());
 
        JButton b1 = new JButton("Ӣ��1");
        JButton b2 = new JButton("Ӣ��2");
        JButton b3 = new JButton("Ӣ��3");
 
        // �Ѱ�ť�������
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
 
        //Jpanel2
        javax.swing.JPanel p2 = new javax.swing.JPanel();
        javax.swing.JButton b4 = new javax.swing.JButton("Ӣ��4");
        javax.swing.JButton b5 = new javax.swing.JButton("Ӣ��5");
        javax.swing.JButton b6 = new javax.swing.JButton("Ӣ��6");
 
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
 
        p2.setBackground(Color.BLUE);
        p2.setBounds(10, 150, 300, 60);
 
        // �������봰��
        f.add(p1);
        f.add(p2);
        
        // ƽʱͨ��f.add()��JFrame�����������ʵ����JFrame�ϵ� ContentPane�Ӷ���
        // f.add��ͬ��f.getContentPane().add(b);
        f.getContentPane().add(p1);
 
        // b.getParent()��ȡ��ťb�����ڵ�����
        // ��ӡ�������Կ�����ʵ������ContentPane����JFrame
        System.out.println(p1.getParent());
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}