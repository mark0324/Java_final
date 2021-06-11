import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;

public class SideMealOrderFrame extends JFrame{

    static ImageIcon SideMealIcon; //= new ImageIcon("image/smallFries.jpg");

    public SideMealOrderFrame(ImageIcon image){
        setImage(image);
    }

    public void setImage(ImageIcon image){
        SideMealIcon = image;
    }

    public ImageIcon getImage() {
        return SideMealIcon;
    }
    
    public static void OrderFrame(){

        JFrame frame = new JFrame("�I�\"); 
		Container contentPane = frame.getContentPane();

        // �]�w�ϥ�
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        //�]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��
        frame.setLocationRelativeTo(null);

        // �إߤ@��JPanel���Ҷ�
        JPanel panel = new JPanel(); 
 
        //�]�w�e�����ϥΧG���޲z��
        panel.setLayout(null); 

        //�إ߼���
        JLabel SideMealLab = new JLabel();
        JLabel SideMealQuantity = new JLabel("�ƶq");

        //�إ߹Ϥ�����
        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        SideMealLab.setIcon(SideMealIcon);

        //�إ߫��s
        JButton reduceBtn = new JButton(reduceBtnIcon);
        JButton addBtn = new JButton(addBtnIcon);
        JButton Cancel = new JButton("����");
        JButton Confirm = new JButton("�T�{");
        
        //�]�w��m�j�p 
        SideMealLab.setBounds(280,20,260,230);
        SideMealQuantity.setBounds(365,250,70,70);
        reduceBtn.setBounds(230,250,70,70);
        addBtn.setBounds(500,250,70,70);
        Cancel.setBounds(500, 360,100,60);
        Confirm.setBounds(650, 360,100,60);


        //�N����K�[��panel
        panel.add(SideMealLab);
        panel.add(SideMealQuantity);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 

    }
}