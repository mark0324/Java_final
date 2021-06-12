import javax.swing.*; 
import java.awt.*;
import java.util.*;

public class MainMealOrderFrame extends JFrame{

    static ImageIcon MainMealIcon; 

    public MainMealOrderFrame(ImageIcon image){
        setImage(image);
    }

    public void setImage(ImageIcon image){
        MainMealIcon = image;
    }

    public ImageIcon getImage() {
        return MainMealIcon;
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
        JLabel MainMealLab = new JLabel();

        JLabel singleQuantity = new JLabel("�ƶq");
        JLabel setAQuantity = new JLabel("�ƶq");
        JLabel setBQuantity = new JLabel("�ƶq");
        JLabel setCQuantity = new JLabel("�ƶq");

        //�إ߹Ϥ�����
        MainMealLab.setIcon(MainMealIcon);
        ImageIcon smallReduceBtnIcon = new ImageIcon("image/smallReduceBtn.jpg");
        
        //�إ߫��s
        JButton singleReduceBtn = new JButton(smallReduceBtnIcon);
        JButton setAReduceBtn = new JButton(smallReduceBtnIcon);
        JButton setBReduceBtn = new JButton(smallReduceBtnIcon);
        JButton setCReduceBtn = new JButton(smallReduceBtnIcon);
        JButton Cancel = new JButton("����");
        JButton Confirm = new JButton("�T�{");

        JButton singleBtn = new JButton("���I");
        JButton setABtn = new JButton("A���q�M�\");
        JButton setBBtn = new JButton("B����M�\");
        JButton setCBtn = new JButton("C�Y�ܹ��M�\");

        //�]�w��m�j�p 
        MainMealLab.setBounds(50,50,260,230);
        singleBtn.setBounds(350,20,260,60);
        setABtn.setBounds(350,100,260,60);
        setBBtn.setBounds(350,180,260,60);
        setCBtn.setBounds(350,260,260,60);

        

        singleReduceBtn.setBounds(710,30,40,40);
        setAReduceBtn.setBounds(710,110,40,40);
        setBReduceBtn.setBounds(710,190,40,40);
        setCReduceBtn.setBounds(710,270,40,40);

        singleQuantity.setBounds(650,20,60,60);
        setAQuantity.setBounds(650,100,60,60);
        setBQuantity.setBounds(650,180,60,60);
        setCQuantity.setBounds(650,260,60,60);

        Cancel.setBounds(500,360,100,60);
        Confirm.setBounds(650,360,100,60);


        //�N����K�[��panel
        panel.add(singleReduceBtn);
        panel.add(setAReduceBtn);
        panel.add(setBReduceBtn);
        panel.add(setCReduceBtn);
        panel.add(MainMealLab);
        panel.add(singleBtn);
        panel.add(setABtn);
        panel.add(setBBtn);
        panel.add(setCBtn);

        panel.add(singleQuantity);
        panel.add(setAQuantity);
        panel.add(setBQuantity);
        panel.add(setCQuantity);

        panel.add(Cancel);
        panel.add(Confirm);

        // �NJPanel�Ҷ��s�W��JFrame
		contentPane.add(panel); 
		frame.setVisible(true); 
    }
}