package gui;
  
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
  
public class JFileChooser {
  
    public static void main(String[] args) {
  
        JFrame f = new JFrame("LOL");
        f.setLayout(new FlowLayout());
        //文件选择器
        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        //文件过滤器
        fc.setFileFilter(new FileFilter() {
             
            @Override
            public String getDescription() {
                // TODO Auto-generated method stub
                return ".txt";
            }
             
            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt");
            }
        });
  
        JButton bOpen = new JButton("打开文件");
  
        JButton bSave = new JButton("保存文件");
  
        f.add(bOpen);
        f.add(bSave);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);
  
        f.setVisible(true);
          
        bOpen.addActionListener(new ActionListener() {
              
            @Override
            public void actionPerformed(ActionEvent e) {
            	//打开文件对话框
                 int returnVal =  fc.showOpenDialog(f);
                 File file = fc.getSelectedFile();
                 if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                     JOptionPane.showMessageDialog(f, "计划打开文件:" + file.getAbsolutePath());
                 }
                  
            }
        });
        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//保存文件对话框
                int returnVal =  fc.showSaveDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f, "计划保存到文件:" + file.getAbsolutePath());
                }
            }
        });
  
    }
  
}