import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;

public class OrderWindow extends JFrame{
    
    public static void OrderWindow(){
        JFrame frame = new JFrame("�I�\"); 
		Container contentPane = frame.getContentPane();

        // �]�w�ϥ�
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        frame.setLocationRelativeTo(null);// --> �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��

        JPanel panel = new JPanel(); // �إߤ@��JPanel���Ҷ� 
 
        panel.setLayout(null); //�]�w�e�����ϥΧG���޲z��

        //�إ߹Ϥ�
        JLabel label = new JLabel();
        ImageIcon smallFriesIcon = new ImageIcon("image/smallFries.jpg");
        label.setIcon(smallFriesIcon);

        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        //�إ߿�J��
        JTextField amount = new JTextField();
        
        //�إ߫��s
        JButton reduceBtn = new JButton(reduceBtnIcon);
        JButton addBtn = new JButton(addBtnIcon);
        JButton Cancel = new JButton("����");
        JButton Confirm = new JButton("�T�{");

        label.setSize(new Dimension(260,150));
        amount.setSize(new Dimension(140,70));        
        reduceBtn.setSize(new Dimension(70,70));
        addBtn.setSize(new Dimension(70,70));
        Cancel.setSize(new Dimension(100,60));
        Confirm.setSize(new Dimension(100,60));

        label.setLocation(270,80);
        amount.setLocation(340, 260);
        reduceBtn.setLocation(230, 260);
        addBtn.setLocation(520, 260);
        Cancel.setLocation(500, 360); 
        Confirm.setLocation(650, 360); 

        panel.add(label);
        panel.add(amount);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 
    }
}