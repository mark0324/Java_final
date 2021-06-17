//<Ĭ��@--
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Detail extends JFrame {

    static JFrame frame;

    public static void Detail() {
        // �إ�Frame
        frame = new JFrame("�q�����");
        Container contentPane = frame.getContentPane();
        // �]�wFrame���j�p
        frame.setSize(800, 700);
        // �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��
        frame.setLocationRelativeTo(null);
        // �]�w�e�����ϥΧG���޲z��
        contentPane.setLayout(null);

        // �]�w�̤W����panel
        // �إ�panel
        JPanel TopPanel = new JPanel();

        // �]�w�e�����ϥΧG���޲z��
        TopPanel.setLayout(null);

        //�P�_���\�覡
        String eating;
        if(ShoppingCart.forHere.isSelected()){
            eating = "For-Here " + OrderData.forhereCount;
        }else{
            eating = "To-Go " + OrderData.togoCount;
        }
        // �إߤ�rLabel
        JLabel OrderNumberLab = new JLabel("�q��s��: " +  eating);

        // �]�w��m�j�p
        OrderNumberLab.setBounds(0, 0, 1080, 50);

        // ��r���j�p
        OrderNumberLab.setFont(OrderNumberLab.getFont().deriveFont(26.0f));

        // �⤸��[��TopPanel��
        TopPanel.add(OrderNumberLab);

        // �]�w�i�u�ʪ��
        JTable table = new JTable(ShoppingCart.model1);
        JScrollPane jscrollpane = new JScrollPane(table);

        // �[�J�ĤG�Ӫ��
        JTable table2 = new JTable(ShoppingCart.model2);
        JScrollPane jscrollpane2 = new JScrollPane(table2);

        // �]�w�̤U����panel
        // �إ�panel
        JPanel BottomPanel = new JPanel();

        // �]�w�e�����ϥΧG���޲z��
        BottomPanel.setLayout(null);

        //�P�_�I�ڤ覡
        String PayWay;
        if(ShoppingCart.CreditCard.isSelected()){
            PayWay = "�H�Υd";
        }
        else{
            PayWay = "�{��";
        }
//--Ĭ��@>

//<�x����--
        String RemarksData;
        RemarksData = Objects.requireNonNull(OrderData.RemarksContent, "�L�Ƶ�");
        String CouponData;
        CouponData = Objects.requireNonNull(OrderData.CouponCode, "���ϥ��u�f�N�X");

        // �إߤ�rLabel
        JLabel total = new JLabel(ShoppingCart.TotalContent); //�@��shoppingcart���`���椺�e
//--�x����>

//<Ĭ��@--

        JLabel RemarksLab = new JLabel("�Ƶ�: " + RemarksData);
        JLabel DiscountLab = new JLabel("�u�f�N�X: " + CouponData);
        JLabel PayWayLab = new JLabel("�I�ڤ覡: " + PayWay);
        JLabel Thanks = new JLabel("���¥��{�A���z���\�r�֡I");

        // �]�w�����m.�j�p
        total.setBounds(0, 0, 200, 50);
        RemarksLab.setBounds(0, 50, 900, 50);
        DiscountLab.setBounds(0, 100, 900, 50);
        PayWayLab.setBounds(0, 150, 900, 50);
        Thanks.setBounds(0, 200, 950, 100);

        // ��r���j�p
        total.setFont(total.getFont().deriveFont(20.0f));
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(20.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(20.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(20.0f));
        Thanks.setFont(Thanks.getFont().deriveFont(40.0f));

        // �⤸��[��BottomPanel��
        BottomPanel.add(total);
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Thanks);

        // �]�w�T��panel����m.�j�p
        TopPanel.setBounds(40, 0, 700, 80);
        jscrollpane.setBounds(40, 80, 700, 100);
        jscrollpane2.setBounds(40, 200, 700, 100);
        BottomPanel.setBounds(40, 320, 700, 450);

        // �[�Jpanel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //��������
        OrderData.Reset();
    }
}
//--Ĭ��@>