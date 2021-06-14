import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMealOrderFrame extends JFrame implements ActionListener{
    static int singleCountIndex;
    JButton addBtn;
    JButton reduceBtn;
    JButton Cancel;
    JButton Confirm;
    JFrame frame;
    JLabel SideMealQuantity;
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
        SideMealQuantity = new JLabel(OrderData.Singlecount[singleCountIndex]+"");

        //��Ʀr�j�p
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

        reduceBtn.addActionListener(this);
        addBtn.addActionListener(this);
        Cancel.addActionListener(this);
        Confirm.addActionListener(this);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 

    }
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        if (e.getSource() == addBtn) {
            OrderData.Singlecount[singleCountIndex] ++;
        } else if (e.getSource() == reduceBtn) {
            if(OrderData.Singlecount[singleCountIndex] > 0) {
                OrderData.Singlecount[singleCountIndex]--;
            }
        } else if(e.getSource() == Confirm || e.getSource() == Cancel) {
            frame.dispose();

            System.out.printf("\n%s%12s%8s\n\n", "�~��", "�ƶq", "����");

            for (int i = 0; i < 9; i++) {

                if (OrderData.Setcount[i] > 0) {
                    System.out.println(OrderData.setlist[i] + "    x" + OrderData.Setcount[i] + "       "
                            + OrderData.setlist[i].getPrice() * OrderData.Setcount[i] + "��\n");
                    total += OrderData.setlist[i].getPrice() * OrderData.Setcount[i];
                }
            }

            for (int i = 0; i < 10; i++) {
                if (OrderData.Singlecount[i] > 0) {
                    System.out.println(OrderData.singlelist[i] + "  x" + OrderData.Singlecount[i] + "        "
                            + OrderData.singlelist[i].getPrice() * OrderData.Singlecount[i] + "��\n");
                    total += OrderData.singlelist[i].getPrice() * OrderData.Singlecount[i];
                }
            }
            System.out.printf("\n�`���B:                 %d��", total);

        }
        SideMealQuantity.setText(OrderData.Singlecount[singleCountIndex]+"");
    }
}