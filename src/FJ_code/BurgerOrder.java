import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;

public class BurgerOrder extends JFrame{
    
    public static void BurgerOrder(){
        JFrame frame = new JFrame("�I�\"); 
		Container contentPane = frame.getContentPane();

        // �]�w�ϥ�
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        frame.setLocationRelativeTo(null);// --> �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��

        JPanel panel = new JPanel(); // �إߤ@��JPanel���Ҷ� 
 
        panel.setLayout(null); //�]�w�e�����ϥΧG���޲z��

        //�إ߼���
        JLabel McMuffinLab = new JLabel();

        //�إ߹Ϥ�����
        ImageIcon McMuffinIcon = new ImageIcon("image/McMuffin.jpg");

        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        McMuffinLab.setIcon(McMuffinIcon);

        //�إ߿�J��
        JTextField amount = new JTextField();
        
        //�إ߫��s
        JButton reduceBtn = new JButton(reduceBtnIcon);
        JButton addBtn = new JButton(addBtnIcon);
        JButton Cancel = new JButton("����");
        JButton Confirm = new JButton("�T�{");

        JButton setABtn = new JButton("A���q�M�\");
        JButton setBBtn = new JButton("B����M�\");
        JButton setCBtn = new JButton("C�Y�ܹ��M�\");

        //�]�w�j�p
        McMuffinLab.setSize(new Dimension(260,230));
        setABtn.setSize(new Dimension(260,80));
        setBBtn.setSize(new Dimension(260,80));
        setCBtn.setSize(new Dimension(260,80));

        amount.setSize(new Dimension(140,70));        
        reduceBtn.setSize(new Dimension(70,70));
        addBtn.setSize(new Dimension(70,70));
        Cancel.setSize(new Dimension(100,60));
        Confirm.setSize(new Dimension(100,60));

        //�]�w��m
        McMuffinLab.setLocation(100,40);
        setABtn.setLocation(500,60);
        setBBtn.setLocation(500,160);
        setCBtn.setLocation(500,260);

        amount.setLocation(170, 300);
        reduceBtn.setLocation(80, 300);
        addBtn.setLocation(340, 300);
        Cancel.setLocation(500, 360); 
        Confirm.setLocation(650, 360); 

        //�N����K�[��panel
        panel.add(McMuffinLab);
        panel.add(setABtn);
        panel.add(setBBtn);
        panel.add(setCBtn);

        panel.add(amount);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 
    }
}