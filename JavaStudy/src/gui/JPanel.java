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
        // 设置面板大小
        p1.setBounds(50, 50, 300, 60);
        
        // 设置面板背景颜色
        p1.setBackground(Color.RED);
 
        // 这一句可以没有，因为JPanel默认就是采用的FlowLayout
        p1.setLayout(new FlowLayout());
 
        JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄2");
        JButton b3 = new JButton("英雄3");
 
        // 把按钮加入面板
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
 
        //Jpanel2
        javax.swing.JPanel p2 = new javax.swing.JPanel();
        javax.swing.JButton b4 = new javax.swing.JButton("英雄4");
        javax.swing.JButton b5 = new javax.swing.JButton("英雄5");
        javax.swing.JButton b6 = new javax.swing.JButton("英雄6");
 
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
 
        p2.setBackground(Color.BLUE);
        p2.setBounds(10, 150, 300, 60);
 
        // 把面板加入窗口
        f.add(p1);
        f.add(p2);
        
        // 平时通过f.add()向JFrame增加组件，其实是向JFrame上的 ContentPane加东西
        // f.add等同于f.getContentPane().add(b);
        f.getContentPane().add(p1);
 
        // b.getParent()获取按钮b所处于的容器
        // 打印出来可以看到，实际上是ContentPane而非JFrame
        System.out.println(p1.getParent());
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}