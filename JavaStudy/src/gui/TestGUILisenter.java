package gui;
  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JFrame,JLable,JButton
 * ActionLisetener��ť����
 * KeyListener���̼���
 * @author zgq
 *
 */
public class TestGUILisenter {
    public static void main(String[] args) {
  
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
  
        final JLabel l = new JLabel();
  
        ImageIcon i = new ImageIcon("D:/test/shana.png");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
        
        
        // ���Ӽ��̼���
        f.addKeyListener(new KeyListener() {
  
            // ��������
            public void keyReleased(KeyEvent e) {
  
                // 39�������� ���Ҽ���
                if (e.getKeyCode() == 39) {
                    // ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
                    l.setLocation(l.getX() + 10, l.getY());
                }
            }
  
            //��������
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
  
            }
  
            // һ�����µ������϶���
            public void keyTyped(KeyEvent e) {
  
            }
        });
        
  
        JButton b = new JButton("����ͼƬ");
        b.setBounds(150, 200, 100, 30);
  
        // ����ť ���� ����
        b.addActionListener(new ActionListener() {
  
            // ����ť�����ʱ���ͻᴥ�� ActionEvent�¼�
            // actionPerformed �����ͻᱻִ��
            public void actionPerformed(ActionEvent e) {
            	if(b.getText().equals("����ͼƬ")) {
            		 l.setVisible(false);
                     b.setText("��ʾͼƬ");
            		
            	}else {
            		l.setVisible(true);
                    b.setText("����ͼƬ");
            	}
               
            }
            
        });
  
        f.add(l);
        f.add(b);
        
        
//        l.addMouseListener(new MouseListener() {
//        	  
//            // �ͷ����
//            public void mouseReleased(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//  
//            // �������
//            public void mousePressed(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//  
//            // ����˳�
//            public void mouseExited(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//  
//            // ������
//            public void mouseEntered(MouseEvent e) {
//  
//                Random r = new Random();
//  
//                int x = r.nextInt(f.getWidth() - l.getWidth());
//                int y = r.nextInt(f.getHeight() - l.getHeight());
//  
//                l.setLocation(x, y);
//  
//            }
//  
//            // �����ͷ���϶���Ϊ������
//            public void mouseClicked(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//        });
//        
        
        // MouseAdapter ��������ֻ��Ҫ��д�õ��ķ�����û���õ��ľͲ���д��
        l.addMouseListener(new MouseAdapter() {
  
            // ֻ��mouseEntered�õ���
            public void mouseEntered(MouseEvent e) {
  
                Random r = new Random();
  
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
  
                l.setLocation(x, y);
  
            }
        });
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}