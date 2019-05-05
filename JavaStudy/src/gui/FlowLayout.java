package gui;
 
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class FlowLayout {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        // 设置布局器为FlowLayerout
        // 容器上的组件水平摆放
        f.setLayout(new java.awt.FlowLayout());
 
        JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄2");
        JButton b3 = new JButton("英雄3");
        
     // 即便 使用 布局器 ，也可以 通过setPreferredSize，向布局器建议该组件显示的大小
        b3.setPreferredSize(new Dimension(180, 40));
 
        // 加入到容器即可，无需单独指定大小和位置
        f.add(b1);
        f.add(b2);
        f.add(b3);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}