//<Ĭ��@--
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainMealOrderFrame extends JFrame implements ActionListener {
    
    //<Hsiang-Ming>
    int singleCountIndex;
    int setCountIndex;
    JButton singleReduceBtn;
    JButton setAReduceBtn;
    JButton setBReduceBtn;
    JButton setCReduceBtn;
    JButton Cancel;
    JButton Confirm;
    JButton singleBtn;
    JButton setABtn;
    JButton setBBtn;
    JButton setCBtn;
    JFrame frame;
    JLabel singleQuantity;
    JLabel setAQuantity;
    JLabel setBQuantity;
    JLabel setCQuantity;
    String mealName;
    ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    ImageIcon MainMealIcon;
    //<Hsiang-Ming>

    public MainMealOrderFrame(ImageIcon image) {
        setImage(image);
    }

    public void setImage(ImageIcon image) {
        MainMealIcon = image;
    }

    public ImageIcon getImage() {
        return MainMealIcon;
    }

    public void OrderFrame(int i) {
        

        new MenuData(Single_Menu);
        singleCountIndex = i;
        Indextrans(singleCountIndex);
        mealName = Single_Menu.get(i).getName();
        frame = new JFrame("Order");
        Container contentPane = frame.getContentPane();

        // �]�w�ϥ�
        frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500);

        // �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��
        frame.setLocationRelativeTo(null);

        // �إߤ@��JPanel���Ҷ�
        JPanel panel = new JPanel();

        // �]�w�e�����ϥΧG���޲z��
        panel.setLayout(null);

        // �إ߼���
        JLabel MainMealLab = new JLabel();
        
        //<Hsiang-Ming>
        singleQuantity = new JLabel(OrderData.Singlecount[singleCountIndex] + "");//��ܳ��I�ƶq
        setAQuantity = new JLabel(OrderData.Setcount[setCountIndex] + "");//���A�\�ƶq�A�H�U�P�z
        setBQuantity = new JLabel(OrderData.Setcount[setCountIndex + 1] + "");
        setCQuantity = new JLabel(OrderData.Setcount[setCountIndex + 2] + "");
        //<Hsiang-Ming>
        //��Ʀr�j�p
        
        singleQuantity.setFont(singleQuantity.getFont().deriveFont(24.0f));
        setAQuantity.setFont(setAQuantity.getFont().deriveFont(24.0f));
        setBQuantity.setFont(setBQuantity.getFont().deriveFont(24.0f));
        setCQuantity.setFont(setCQuantity.getFont().deriveFont(24.0f));

        // �إ߹Ϥ�����
        MainMealLab.setIcon(MainMealIcon);
        ImageIcon smallReduceBtnIcon = new ImageIcon("image/smallReduceBtn.jpg");

        // �إ߫��s
        singleReduceBtn = new JButton(smallReduceBtnIcon);
        setAReduceBtn = new JButton(smallReduceBtnIcon);
        setBReduceBtn = new JButton(smallReduceBtnIcon);
        setCReduceBtn = new JButton(smallReduceBtnIcon);
        Cancel = new JButton("Cancel");
        Confirm = new JButton("Confirm");

        singleBtn = new JButton("���I " + mealName);
        //setABtn = new JButton(ShoppingCart.Set_Menu.get(0).getName()); //TODO:�ݭײz
        setABtn = new JButton("���q�M�\");
        setBBtn = new JButton("����M�\");
        setCBtn = new JButton("�Y�ܹ��M�\");

        // �]�w��m�j�p
        MainMealLab.setBounds(50, 50, 260, 230);
        singleBtn.setBounds(350, 20, 260, 60);
        setABtn.setBounds(350, 100, 260, 60);
        setBBtn.setBounds(350, 180, 260, 60);
        setCBtn.setBounds(350, 260, 260, 60);

        singleReduceBtn.setBounds(710, 30, 40, 40);
        setAReduceBtn.setBounds(710, 110, 40, 40);
        setBReduceBtn.setBounds(710, 190, 40, 40);
        setCReduceBtn.setBounds(710, 270, 40, 40);

        singleQuantity.setBounds(650, 20, 60, 60);
        setAQuantity.setBounds(650, 100, 60, 60);
        setBQuantity.setBounds(650, 180, 60, 60);
        setCQuantity.setBounds(650, 260, 60, 60);

        Cancel.setBounds(500, 360, 100, 60);
        Confirm.setBounds(650, 360, 100, 60);

        // �N����K�[��panel
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
        
//--Ĭ��@>
        //<Hsiang-Ming>
        singleReduceBtn.addActionListener(this);//�I�s�U�誺ActionPerformed
        setAReduceBtn.addActionListener(this);
        setBReduceBtn.addActionListener(this);
        setCReduceBtn.addActionListener(this);
        Cancel.addActionListener(this);
        Confirm.addActionListener(this);
        singleBtn.addActionListener(this);
        setABtn.addActionListener(this);
        setBBtn.addActionListener(this);
        setCBtn.addActionListener(this);
        //<Hsiang-Ming>

//<Ĭ��@--
        // �NJPanel�Ҷ��s�W��JFrame
        contentPane.add(panel);
        frame.setVisible(true);
    }
//--Ĭ��@>

    //<Hsiang-Ming>
    public void Indextrans(int singleCountIndex) { //�N�쥻�bMainMeal.java�a�J���޼��ഫ���M�\�I�\�Ȧs�Ϫ�INDEX��
        if (singleCountIndex == 1) {
            setCountIndex = 0;
        } else if (singleCountIndex == 6) {
            setCountIndex = 3;
        } else if (singleCountIndex == 8) {
            setCountIndex = 6;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Indextrans(singleCountIndex); //�N�쥻�bMainMeal.java�a�J���޼��ഫ���M�\�I�\�Ȧs�Ϫ�INDEX��
        if (e.getSource() == singleBtn) { //e.getSource()�|�h������䪺�W�r�Ӱ��۹������ʧ@
            OrderData.Singlecount[singleCountIndex]++; //���I++
        } else if (e.getSource() == singleReduceBtn) {
            if (OrderData.Singlecount[singleCountIndex] > 0) { //�ˬd�Ȧs�Ϫ��p�ƾ��A�קK�ܦ��t��
                OrderData.Singlecount[singleCountIndex]--; //���I--
            }
        } else if (e.getSource() == setABtn) { //e.getSource()�|�h������䪺�W�r�Ӱ��۹������ʧ@
            OrderData.Setcount[setCountIndex]++; //A�\++
        } else if (e.getSource() == setAReduceBtn) {
            if (OrderData.Setcount[setCountIndex] > 0) { //�ˬd�Ȧs�Ϫ��p�ƾ��A�קK�ܦ��t��
                OrderData.Setcount[setCountIndex]--; //A�\--
            }
        } else if (e.getSource() == setBBtn) { //�P�W��P�z
            OrderData.Setcount[setCountIndex + 1]++;
        } else if (e.getSource() == setBReduceBtn) {
            if (OrderData.Setcount[setCountIndex + 1] > 0) {
                OrderData.Setcount[setCountIndex + 1] --;
            }
        } else if (e.getSource() == setCBtn) {
            OrderData.Setcount[setCountIndex + 2]++;
        } else if (e.getSource() == setCReduceBtn) {
            if (OrderData.Setcount[setCountIndex + 2] > 0) {
                OrderData.Setcount[setCountIndex + 2]--;
            }
        } else if (e.getSource() == Confirm || e.getSource() == Cancel) {
            frame.dispose();
        }
        
        singleQuantity.setText(OrderData.Singlecount[singleCountIndex] + ""); //��s������JLabel���e�]����\�I���X���^
        setAQuantity.setText(OrderData.Setcount[setCountIndex] + "");
        setBQuantity.setText(OrderData.Setcount[setCountIndex + 1] + "");
        setCQuantity.setText(OrderData.Setcount[setCountIndex + 2] + "");
        //<Hsiang-Ming>
    }
}