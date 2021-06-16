//<Ĭ��@--
import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMealOrderFrame extends JFrame implements ActionListener{
    //<Hsiang-Ming>
    //�����ŧi�b�W�誺��]�O�A�ݦs��class�ŧO���U�誺��k�~�ઽ���s��
    static int singleCountIndex;
    JButton addBtn;
    JButton reduceBtn;
    JButton Cancel;
    JButton Confirm;
    JFrame frame;
    JLabel SideMealQuantity;
    //<Hsiang-Ming>
    static ImageIcon SideMealIcon; 
    

    public SideMealOrderFrame(ImageIcon image){
        setImage(image);
    }

    public void setImage(ImageIcon image){
        SideMealIcon = image;
    }

    public ImageIcon getImage() {
        return SideMealIcon;
    }
    
    public void OrderFrame(int i){

        singleCountIndex = i;
        frame = new JFrame("Order");
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
        SideMealQuantity = new JLabel(OrderData.Singlecount[singleCountIndex]+"");//��ܷ�e�ƶq

        //�]�w�r���j�p
        SideMealQuantity.setFont(SideMealQuantity.getFont().deriveFont(32.0f));

        //�إ߹Ϥ�����
        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        SideMealLab.setIcon(SideMealIcon);

        //�إ߫��s
        reduceBtn = new JButton(reduceBtnIcon);
        addBtn = new JButton(addBtnIcon);
        Cancel = new JButton("Cancel");
        Confirm = new JButton("Confirm");
        
        //�]�w��m�j�p
        SideMealLab.setBounds(280,20,260,230);
        SideMealQuantity.setBounds(380,250,70,70);
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

        reduceBtn.addActionListener(this);//�]�w��ť�A��ActionPerformed�B�@
        addBtn.addActionListener(this);
        Cancel.addActionListener(this);
        Confirm.addActionListener(this);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 

    }
//--Ĭ��@>

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        if (e.getSource() == addBtn) { //�z�Le.getSource() ������s
            OrderData.Singlecount[singleCountIndex] ++; //���I++
        } else if (e.getSource() == reduceBtn) {
            if(OrderData.Singlecount[singleCountIndex] > 0) { //�ˬd�Ȧs�Ϫ��p�ƾ��A�קK�ܦ��t��
                OrderData.Singlecount[singleCountIndex]--; //���I�С�
            }
        } else if(e.getSource() == Confirm || e.getSource() == Cancel) {
            frame.dispose();
        }
        SideMealQuantity.setText(OrderData.Singlecount[singleCountIndex]+""); //��slabel���p�ƾ�
    }
}