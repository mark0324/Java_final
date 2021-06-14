import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingCart extends JFrame {

    static JButton ViewMenu;
    static JFrame frame;
    // �إ߫��s��
    static JRadioButton Cash;
    static JRadioButton CreditCard;

    public static void ShoppingCartFrame() {
        // �إ�Frame
        frame = new JFrame("�ʪ���");
        Container contentPane = frame.getContentPane();
        // �]�wFrame���j�p
        frame.setSize(1400, 900);
        // �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��
        frame.setLocationRelativeTo(null);
        // �]�w�e�����ϥΧG���޲z��
        contentPane.setLayout(null);

        // �]�w�̤W����panel
        // �إ�panel
        JPanel TopPanel = new JPanel();

        // �]�w�e�����ϥΧG���޲z��
        TopPanel.setLayout(null);

        // �إߤ�rLabel
        JLabel OrderNumberLab = new JLabel("�q��s��: " + "�q��s���Ʀr�ন�r��");

        // �إ߫��s
        ViewMenu = new JButton("��^���");

        // �]�w��m�j�p
        OrderNumberLab.setBounds(0, 0, 1080, 50);
        ViewMenu.setBounds(1120, 0, 200, 50);

        // ��r���j�p
        OrderNumberLab.setFont(OrderNumberLab.getFont().deriveFont(26.0f));
        ViewMenu.setFont(ViewMenu.getFont().deriveFont(20.0f));

        // �⤸��[��TopPanel��
        TopPanel.add(OrderNumberLab);
        TopPanel.add(ViewMenu);

        // �]�w�i�u�ʪ��
        String[][] data = { { "�s���@", "��Ƥ@", "4" }, { "�s���G", "��ƤG", "4" }, { "�s���T", "��ƤT", "4" } };
        String[] dataTitle = { "�\�I", "�ƶq", "����" };

        MyTableModel model = new MyTableModel(data, dataTitle);
        JTable table = new JTable(model);

        JScrollPane jscrollpane = new JScrollPane(table);

        // �[�J�ĤG�Ӫ��
        String[][] data2 = { { "�s���@", "��Ƥ@", "��Ƥ@", "4", "��Ƥ@", "4" }, { "�s���G", "��ƤG", "��Ƥ@", "4", "��ƤG", "4" },
                { "�s���T", "��ƤT", "��Ƥ@", "4", "��ƤT", "4" } };
        String[] dataTitle2 = { "�D�\", "���\1", "���\2", "����", "�ƶq", "����" };

        MyTableModel model2 = new MyTableModel(data2, dataTitle2);
        JTable table2 = new JTable(model2);

        JScrollPane jscrollpane2 = new JScrollPane(table2);

        // �]�w�̤U����panel
        // �إ�panel
        JPanel BottomPanel = new JPanel();
        // �]�w�e�����ϥΧG���޲z��
        BottomPanel.setLayout(null);

        // �إߤ�rLabel
        JLabel RemarksLab = new JLabel("�Ƶ�");
        JLabel DiscountLab = new JLabel("�u�f�N�X");
        JLabel PayWayLab = new JLabel("�I�ڤ覡");

        // �إ߿�J��
        JTextArea Remarks = new JTextArea();
        LineBorder tt = new LineBorder(Color.GRAY);
        Remarks.setBorder(tt);
        JTextField Discount = new JTextField();
        JTextField CreditCardNumber = new JTextField();

        // �إ߫��s
        JButton Verification = new JButton("����");
        JButton CancelOrder = new JButton("�����q��");
        JButton Checkout = new JButton("�T�{���b");

        Cash = new JRadioButton("�{��",false);
        CreditCard = new JRadioButton("�H�Υd",false);
    
        // �إߤ@��ButtonGroup����
        ButtonGroup bg = new ButtonGroup();

        
        bg.add(Cash);
        bg.add(CreditCard);

        
        // �]�w�����m.�j�p
        RemarksLab.setBounds(0, 0, 200, 100);
        DiscountLab.setBounds(0, 100, 200, 100);
        PayWayLab.setBounds(0, 170, 200, 100);
        Remarks.setBounds(120, 0, 1200, 100);
        Discount.setBounds(120, 120, 1080, 50);
        Verification.setBounds(1220, 120, 100, 50);
        Cash.setBounds(120, 190, 100, 50);
        CreditCard.setBounds(340, 190, 100, 50);
        CreditCardNumber.setBounds(450, 190, 800, 50);
        CancelOrder.setBounds(1000, 270, 150, 80);
        Checkout.setBounds(1170, 270, 150, 80);

        // ��r���j�p
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(16.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(16.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(16.0f));
        Cash.setFont(Cash.getFont().deriveFont(16.0f));
        CreditCard.setFont(CreditCard.getFont().deriveFont(16.0f));
        Verification.setFont(Verification.getFont().deriveFont(16.0f));
        CancelOrder.setFont(CancelOrder.getFont().deriveFont(20.0f));
        Checkout.setFont(Checkout.getFont().deriveFont(20.0f));

        // �⤸��[��BottomPanel��
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Remarks);
        BottomPanel.add(Discount);
        BottomPanel.add(Verification);
        BottomPanel.add(Cash);
        BottomPanel.add(CreditCard);
        BottomPanel.add(CreditCardNumber);
        BottomPanel.add(CancelOrder);
        BottomPanel.add(Checkout);

        // �[�JĲ�o����
        Checkout.addActionListener(new DetailListener());
        ViewMenu.addActionListener(new ViewMenuListener());

        // �]�w�T��panel����m.�j�p
        TopPanel.setBounds(40, 20, 1320, 100);
        jscrollpane.setBounds(40, 120, 1320, 150);
        jscrollpane2.setBounds(40, 270, 1320, 150);
        BottomPanel.setBounds(40, 460, 1320, 350);

        // �[�Jpanel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        
    }
}
