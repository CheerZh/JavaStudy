package gui;
 
import javax.swing.JFrame;
import javax.swing.JRadioButton;
 
public class ButtonGroup {
    public static void main(String[] args) {
 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);
        JRadioButton b1 = new JRadioButton("����Ӣ��");
        b1.setSelected(true);
        b1.setBounds(50, 50, 130, 30);
        JRadioButton b2 = new JRadioButton("ħ�� Ӣ��");
        b2.setBounds(50, 100, 130, 30);
 
        // ��ť����
        javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
        // ��b1��b2���� ͬһ�� ��ť��������� ������ͬһʱ�䣬ֻ��һ�� ��ť �ᱻѡ��
        bg.add(b1);
        bg.add(b2);
 
        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}