package gui;
 
import javax.swing.JFrame;

/**
 * showConfirmDialog确认对话框
 * showInputDialog输入框
 * showMessageDialog消息框
 * 
 * 
 * @author zgq
 *
 */
public class JOptionPane {
    public static void main(String[] args) {
 
        JFrame f = new javax.swing.JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);
 
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
 
        int option = javax.swing.JOptionPane.showConfirmDialog(f, "是否 使用外挂 ？");
        if (javax.swing.JOptionPane.OK_OPTION == option) {
            String answer = javax.swing.JOptionPane.showInputDialog(f, "请输入yes，表明使用外挂后果自负");
            if ("yes".equals(answer))
            	javax.swing.JOptionPane.showMessageDialog(f, "你使用外挂被抓住！ 罚拣肥皂3次！");
        }
 
    }
}