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
    static JTextField Remarks;//JTextArea -> JTextField
    // 建立按鈕組
    static JRadioButton Cash;
    static JRadioButton CreditCard;
    static JRadioButton forHere;
    static JRadioButton toGo;
    static DefaultTableModel model1;
    static DefaultTableModel model2;
    static String TotalContent = "";
    static JLabel total;

    public static void ShoppingCartFrame() {
        new MenuData(Single_Menu, Set_Menu);
        // 建立Frame
        frame = new JFrame("購物車");
        Container contentPane = frame.getContentPane();
        // 設定Frame的大小
        frame.setSize(1400, 900);
        // 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
        frame.setLocationRelativeTo(null);
        // 設定容器不使用佈局管理員
        contentPane.setLayout(null);

        // 設定最上面的panel
        // 建立panel
        JPanel TopPanel = new JPanel();

        // 設定容器不使用佈局管理員
        TopPanel.setLayout(null);

        // 建立按鈕
        ViewMenu = new JButton("返回菜單");
        forHere = new JRadioButton("內用",false);
        toGo = new JRadioButton("外帶",true);

        // 建立一個ButtonGroup物件
        ButtonGroup eating = new ButtonGroup();
        eating.add(forHere);
        eating.add(toGo);

        // 設定位置大小
        forHere.setBounds(0, 10, 100, 50);
        toGo.setBounds(120, 10, 100, 50);
        ViewMenu.setBounds(1120, 0, 200, 50);

        // 改字的大小
        forHere.setFont(forHere.getFont().deriveFont(26.0f));
        toGo.setFont(toGo.getFont().deriveFont(26.0f));
        ViewMenu.setFont(ViewMenu.getFont().deriveFont(20.0f));

        // 把元件加到TopPanel裡
        TopPanel.add(forHere);
        TopPanel.add(toGo);
        TopPanel.add(ViewMenu);

        // 設定可滾動表格
        model1 = new MyTableModel();
        model1.addColumn("餐點");
        model1.addColumn("數量");
        model1.addColumn("價錢");
        AssignSingleOrderData(model1);
        JTable table = new JTable(model1);


        JScrollPane jscrollpane = new JScrollPane(table);

        // 加入第二個表格
        model2 = new MyTableModel();
        model2.addColumn("主餐");
        model2.addColumn("副餐1");
        model2.addColumn("副餐2");
        model2.addColumn("飲料");
        model2.addColumn("數量");
        model2.addColumn("價錢");
        AssignSetOrderData(model2);
        JTable table2 = new JTable(model2);

        JScrollPane jscrollpane2 = new JScrollPane(table2);

        // 設定最下面的panel
        // 建立panel
        JPanel BottomPanel = new JPanel();
        // 設定容器不使用佈局管理員
        BottomPanel.setLayout(null);
        // 建立文字Label
        JLabel RemarksLab = new JLabel("備註");
        JLabel DiscountLab = new JLabel("優惠代碼");
        JLabel PayWayLab = new JLabel("付款方式");
        if(TotalContent.equals("")){
            TotalContent = "總金額 "+OrderData.calculateTotal()+" 元";
        }
        total = new JLabel(TotalContent);

        // 建立輸入框
        Remarks = new JTextField();//TODO:Check
        LineBorder tt = new LineBorder(Color.GRAY);
        Remarks.setBorder(tt);
        Discount = new JTextField();
        JTextField CreditCardNumber = new JTextField();

        // 建立按鈕
        JButton Verification = new JButton("驗證");
        JButton CancelOrder = new JButton("取消訂單");
        JButton Checkout = new JButton("確認結帳");

        Cash = new JRadioButton("現金",true);
        CreditCard = new JRadioButton("信用卡",false);
        // 建立一個ButtonGroup物件
        ButtonGroup bg = new ButtonGroup();
        bg.add(Cash);
        bg.add(CreditCard);

        
        // 設定元件位置.大小
        total.setBounds(1100, 20, 200, 70);
        RemarksLab.setBounds(0, 200, 200, 100);//NOTE: y 100->200
        DiscountLab.setBounds(0, 100, 200, 100);//NOTE: y 200-> 100
        PayWayLab.setBounds(0, 270, 200, 100);
        Remarks.setBounds(120, 220, 1200, 50);//NOTE: y 100 -> 220
        Discount.setBounds(120, 120, 1080, 50);//NOTE: y 220 -> 100
        Verification.setBounds(1220, 120, 100, 50);
        Cash.setBounds(120, 290, 100, 50);
        CreditCard.setBounds(340, 290, 100, 50);
        CreditCardNumber.setBounds(450, 290, 800, 50);
        CancelOrder.setBounds(1000, 370, 150, 80);
        Checkout.setBounds(1170, 370, 150, 80);

        // 改字的大小
        total.setFont(total.getFont().deriveFont(26.0f));
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(16.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(16.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(16.0f));
        Cash.setFont(Cash.getFont().deriveFont(16.0f));
        CreditCard.setFont(CreditCard.getFont().deriveFont(16.0f));
        Verification.setFont(Verification.getFont().deriveFont(16.0f));
        CancelOrder.setFont(CancelOrder.getFont().deriveFont(20.0f));
        Checkout.setFont(Checkout.getFont().deriveFont(20.0f));

        // 把元件加到BottomPanel裡
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(total);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Discount);
        BottomPanel.add(Remarks);
        //BottomPanel.add(Discount);
        BottomPanel.add(Verification);
        BottomPanel.add(Cash);
        BottomPanel.add(CreditCard);
        BottomPanel.add(CreditCardNumber);
        BottomPanel.add(CancelOrder);
        BottomPanel.add(Checkout);

        // 加入觸發物件
        CancelOrder.addActionListener(new CancelListener());
        Checkout.addActionListener(new DetailListener());
        ViewMenu.addActionListener(new ViewMenuListener());
        Verification.addActionListener(new VerificationListener());

        // 設定三個panel的位置.大小
        TopPanel.setBounds(40, 20, 1320, 100);
        jscrollpane.setBounds(40, 120, 1320, 120);
        jscrollpane2.setBounds(40, 250, 1320, 120);
        BottomPanel.setBounds(40, 360, 1320, 550);

        // 加入panel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        
    }
    public static void AssignSingleOrderData(DefaultTableModel model) {
        for (int i = 0; i < 10 ; i++) {
            if (OrderData.Singlecount[i] > 0) {
                String[] temp1 = {(Single_Menu.get(i).getName()),(OrderData.Singlecount[i]+""),((Single_Menu.get(i).getPrice() * OrderData.Singlecount[i])+"")};
                model.addRow(temp1);
            }
        }
    }
    public static void AssignSetOrderData(DefaultTableModel model) {
        for (int i = 0; i < 3 ; i++) {
            String MainMealName = null;
            int price = 0;
            if (OrderData.Setcount[i] > 0){
                MainMealName = Single_Menu.get(1).getName();
                price = Single_Menu.get(1).getPrice();
            }
            if(MainMealName != null) {
                String[] temp2 = {MainMealName+" "+ Set_Menu.get(i).getName(), (Set_Menu.get(i).getDish1().getName()), (Set_Menu.get(i).getDish2().getName()), (Set_Menu.get(i).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp2);
            }
        }
        for (int i = 3; i < 6; i++){
            String MainMealName = null;
            int price = 0;
            if (OrderData.Setcount[i] > 0){
                MainMealName = Single_Menu.get(6).getName();
                price = Single_Menu.get(6).getPrice();
            }
            if(MainMealName != null) {
                String[] temp2 = {MainMealName+" "+ Set_Menu.get(i).getName(), (Set_Menu.get(i).getDish1().getName()), (Set_Menu.get(i).getDish2().getName()), (Set_Menu.get(i).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp2);
            }
        }
        for (int i = 6; i < 9; i++){
            String MainMealName = null;
            int price = 0;
            if (OrderData.Setcount[i] > 0){
                MainMealName = Single_Menu.get(8).getName();
                price = Single_Menu.get(8).getPrice();
            }
            if(MainMealName != null) {
                String[] temp2 = {MainMealName+" "+ Set_Menu.get(i).getName(), (Set_Menu.get(i).getDish1().getName()), (Set_Menu.get(i).getDish2().getName()), (Set_Menu.get(i).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp2);
            }
        }
    }
    public static void CouponSingle(String[] CouponMeal){
        model1.addRow(CouponMeal);
    }
    public static void CouponSet(String[] CouponMeal) {
        model2.addRow(CouponMeal);
    }
}
