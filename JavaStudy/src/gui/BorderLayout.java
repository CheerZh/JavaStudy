package gui;
 
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class BorderLayout {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为BorderLayerout
        // 容器上的组件按照上北下南左西右东中的顺序摆放
        f.setLayout(new java.awt.BorderLayout());
 
        JButton b1 = new JButton("洪七");
        JButton b2 = new JButton("段智兴");
        JButton b3 = new JButton("欧阳锋");
        JButton b4 = new JButton("黄药师");
        JButton b5 = new JButton("周伯通");
 
        // 加入到容器的时候，需要指定位置
        f.add(b1, java.awt.BorderLayout.NORTH);
        f.add(b2, java.awt.BorderLayout.SOUTH);
        f.add(b3, java.awt.BorderLayout.WEST);
        f.add(b4, java.awt.BorderLayout.EAST);
        f.add(b5, java.awt.BorderLayout.CENTER);
        
     // 即便 使用 布局器 ，也可以 通过setPreferredSize，向布局器建议该组件显示的大小
        b3.setPreferredSize(new Dimension(180, 40));
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}