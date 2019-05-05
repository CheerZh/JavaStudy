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
  
        JLabel l = new JLabel("文本域：");
  
        javax.swing.JTextArea ta = new javax.swing.JTextArea();
        ta.setPreferredSize(new Dimension(200, 150));
        //\n换行符
        ta.setText("像我这么帅的\n在别的故事里\n");
        //追加数据
        ta.append("可是主角哦，哈哈哈哈哈哈哈哈哈哈或或或或或或或或或或或或或或或");
        //设置自动换行
        ta.setLineWrap(true);
        f.add(l);
        f.add(ta);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}