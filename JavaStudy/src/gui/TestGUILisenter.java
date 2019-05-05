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
 * ActionLisetener按钮监听
 * KeyListener键盘监听
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
        
        
        // 增加键盘监听
        f.addKeyListener(new KeyListener() {
  
            // 键被弹起
            public void keyReleased(KeyEvent e) {
  
                // 39代表按下了 “右键”
                if (e.getKeyCode() == 39) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + 10, l.getY());
                }
            }
  
            //键被按下
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
  
            }
  
            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {
  
            }
        });
        
  
        JButton b = new JButton("隐藏图片");
        b.setBounds(150, 200, 100, 30);
  
        // 给按钮 增加 监听
        b.addActionListener(new ActionListener() {
  
            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
            public void actionPerformed(ActionEvent e) {
            	if(b.getText().equals("隐藏图片")) {
            		 l.setVisible(false);
                     b.setText("显示图片");
            		
            	}else {
            		l.setVisible(true);
                    b.setText("隐藏图片");
            	}
               
            }
            
        });
  
        f.add(l);
        f.add(b);
        
        
//        l.addMouseListener(new MouseListener() {
//        	  
//            // 释放鼠标
//            public void mouseReleased(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//  
//            // 按下鼠标
//            public void mousePressed(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//  
//            // 鼠标退出
//            public void mouseExited(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//  
//            // 鼠标进入
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
//            // 按下释放组合动作为点击鼠标
//            public void mouseClicked(MouseEvent e) {
//                // TODO Auto-generated method stub
//  
//            }
//        });
//        
        
        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
        l.addMouseListener(new MouseAdapter() {
  
            // 只有mouseEntered用到了
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