package gui;
 
import javax.swing.JFrame;

/**
 * showConfirmDialogȷ�϶Ի���
 * showInputDialog�����
 * showMessageDialog��Ϣ��
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
 
        int option = javax.swing.JOptionPane.showConfirmDialog(f, "�Ƿ� ʹ����� ��");
        if (javax.swing.JOptionPane.OK_OPTION == option) {
            String answer = javax.swing.JOptionPane.showInputDialog(f, "������yes������ʹ����Һ���Ը�");
            if ("yes".equals(answer))
            	javax.swing.JOptionPane.showMessageDialog(f, "��ʹ����ұ�ץס�� �������3�Σ�");
        }
 
    }
}