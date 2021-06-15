import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ShoppingCart extends JFrame {
    static ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    static ArrayList<setType> Set_Menu = new ArrayList<setType>();

    static JButton ViewMenu;
    static JFrame frame;
    static JTextField Discount;
    static JTextArea Remarks;
    // �إ߫��s��
    static JRadioButton Cash;
    static JRadioButton CreditCard;
    static JRadioButton forHere;
    static JRadioButton toGo;
    static DefaultTableModel model1;
    static DefaultTableModel model2;

    public static void ShoppingCartFrame() {
        new MenuData(Single_Menu, Set_Menu);
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

        // �إ߫��s
        ViewMenu = new JButton("��^���");
        forHere = new JRadioButton("����",false);
        toGo = new JRadioButton("�~�a",false);

        // �إߤ@��ButtonGroup����
        ButtonGroup eating = new ButtonGroup();
        eating.add(forHere);
        eating.add(toGo);

        // �]�w��m�j�p
        forHere.setBounds(0, 10, 100, 50);
        toGo.setBounds(120, 10, 100, 50);
        ViewMenu.setBounds(1120, 0, 200, 50);

        // ��r���j�p
        forHere.setFont(forHere.getFont().deriveFont(26.0f));
        toGo.setFont(toGo.getFont().deriveFont(26.0f));
        ViewMenu.setFont(ViewMenu.getFont().deriveFont(20.0f));

        // �⤸��[��TopPanel��
        TopPanel.add(forHere);
        TopPanel.add(toGo);
        TopPanel.add(ViewMenu);

        // �]�w�i�u�ʪ��
        model1 = new DefaultTableModel();
        model1.addColumn("�\�I");
        model1.addColumn("�ƶq");
        model1.addColumn("����");
        AssignSingleOrderData(model1);
        JTable table = new JTable(model1);


        JScrollPane jscrollpane = new JScrollPane(table);

        // �[�J�ĤG�Ӫ��
        model2 = new DefaultTableModel();
        model2.addColumn("�D�\");
        model2.addColumn("���\1");
        model2.addColumn("���\2");
        model2.addColumn("����");
        model2.addColumn("�ƶq");
        model2.addColumn("����");
        AssignSetOrderData(model2);
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
        JLabel total = new JLabel("�`���B"+"String");

        // �إ߿�J��
        Remarks = new JTextArea();
        LineBorder tt = new LineBorder(Color.GRAY);
        Remarks.setBorder(tt);
        Discount = new JTextField();
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
        total.setBounds(1100, 20, 200, 70);
        RemarksLab.setBounds(0, 100, 200, 100);
        DiscountLab.setBounds(0, 200, 200, 100);
        PayWayLab.setBounds(0, 270, 200, 100);
        Remarks.setBounds(120, 100, 1200, 100);
        Discount.setBounds(120, 220, 1080, 50);
        Verification.setBounds(1220, 220, 100, 50);
        Cash.setBounds(120, 290, 100, 50);
        CreditCard.setBounds(340, 290, 100, 50);
        CreditCardNumber.setBounds(450, 290, 800, 50);
        CancelOrder.setBounds(1000, 370, 150, 80);
        Checkout.setBounds(1170, 370, 150, 80);

        // ��r���j�p
        total.setFont(total.getFont().deriveFont(26.0f));
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
        BottomPanel.add(total);
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
        CancelOrder.addActionListener(new CancelListener());
        Checkout.addActionListener(new DetailListener());
        ViewMenu.addActionListener(new ViewMenuListener());
        Verification.addActionListener(new VerificationListener());

        // �]�w�T��panel����m.�j�p
        TopPanel.setBounds(40, 20, 1320, 100);
        jscrollpane.setBounds(40, 120, 1320, 120);
        jscrollpane2.setBounds(40, 250, 1320, 120);
        BottomPanel.setBounds(40, 360, 1320, 550);

        // �[�Jpanel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        
    }
    public static void AssignSingleOrderData(DefaultTableModel model) {
        for (int i = 0; i < 10 ; i++) {
            if (OrderData.Singlecount[i] > 0) {
                String[] temp = {(Single_Menu.get(i).getName()),(OrderData.Singlecount[i]+""),((Single_Menu.get(i).getPrice() * OrderData.Singlecount[i])+"")};
                model.addRow(temp);
            }
        }
    }
    public static void AssignSetOrderData(DefaultTableModel model) {
        String MainMealName = null;
        int price = 0;
        for (int i = 0; i < 9; i++) {
            if (OrderData.Setcount[i] > 0) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                        MainMealName = Single_Menu.get(1).getName();
                        price = Single_Menu.get(1).getPrice();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        MainMealName = Single_Menu.get(6).getName();
                        price = Single_Menu.get(6).getPrice();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        MainMealName = Single_Menu.get(8).getName();
                        price = Single_Menu.get(8).getPrice();
                        break;
                }
                String[] temp = {MainMealName+" "+ Set_Menu.get(i).getName(), (Set_Menu.get(i).getDish1().getName()), (Set_Menu.get(i).getDish2().getName()), (Set_Menu.get(i).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp);
            }
        }
    }
    public static void CouponSingle(String[] CouponMeal){
        //String[] CouponMeal = {(ShoppingCart.Single_Menu.get(7).getName()),"1","Free"};
        model1.addRow(CouponMeal);
    }
    public static void CouponSet(String[] CouponMeal) {
        model2.addRow(CouponMeal);
    }
}
