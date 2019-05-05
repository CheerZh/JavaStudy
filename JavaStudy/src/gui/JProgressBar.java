package gui;
 
import java.awt.Dimension;
import java.awt.FlowLayout;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
 
public class JProgressBar {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
 
        f.setLayout(new FlowLayout());
 
        javax.swing.JProgressBar pb = new javax.swing.JProgressBar();
 
        //进度条最大100
        pb.setMaximum(100);
        //当前进度是50
        pb.setValue(50);
        //显示当前进度
        pb.setStringPainted(true);
 
        f.add(pb);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}