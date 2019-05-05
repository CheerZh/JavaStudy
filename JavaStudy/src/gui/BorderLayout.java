package gui;
 
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class BorderLayout {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // ���ò�����ΪBorderLayerout
        // �����ϵ���������ϱ����������Ҷ��е�˳��ڷ�
        f.setLayout(new java.awt.BorderLayout());
 
        JButton b1 = new JButton("����");
        JButton b2 = new JButton("������");
        JButton b3 = new JButton("ŷ����");
        JButton b4 = new JButton("��ҩʦ");
        JButton b5 = new JButton("�ܲ�ͨ");
 
        // ���뵽������ʱ����Ҫָ��λ��
        f.add(b1, java.awt.BorderLayout.NORTH);
        f.add(b2, java.awt.BorderLayout.SOUTH);
        f.add(b3, java.awt.BorderLayout.WEST);
        f.add(b4, java.awt.BorderLayout.EAST);
        f.add(b5, java.awt.BorderLayout.CENTER);
        
     // ���� ʹ�� ������ ��Ҳ���� ͨ��setPreferredSize���򲼾�������������ʾ�Ĵ�С
        b3.setPreferredSize(new Dimension(180, 40));
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}