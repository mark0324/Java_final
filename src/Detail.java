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

        // �إߤ�rLabel
        JLabel OrderNumberLab = new JLabel("�q��s��: " + "�q��s���Ʀr�ন�r��");

        // �]�w��m�j�p
        OrderNumberLab.setBounds(0, 0, 1080, 50);

        // ��r���j�p
        OrderNumberLab.setFont(OrderNumberLab.getFont().deriveFont(26.0f));

        // �⤸��[��TopPanel��
        TopPanel.add(OrderNumberLab);

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

        //�P�_�I�ڤ覡
        String PayWay;
        if(ShoppingCart.CreditCard.isSelected()){
            PayWay = "�H�Υd";
        }
        else{
            PayWay = "�{��";
        }

        // �إߤ�rLabel
        JLabel RemarksLab = new JLabel("�Ƶ�: " + "String");
        JLabel DiscountLab = new JLabel("�u�f�N�X: " + "String");
        JLabel PayWayLab = new JLabel("�I�ڤ覡: " + PayWay);
        JLabel Thanks = new JLabel("���¥��{�A���z���\�r�֡I");

        // �]�w�����m.�j�p
        RemarksLab.setBounds(0, 0, 900, 50);
        DiscountLab.setBounds(0, 50, 900, 50);
        PayWayLab.setBounds(0, 100, 900, 50);
        Thanks.setBounds(0, 150, 900, 100);

        // ��r���j�p
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(20.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(20.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(20.0f));
        Thanks.setFont(Thanks.getFont().deriveFont(40.0f));

        // �⤸��[��BottomPanel��
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Thanks);

        // �]�w�T��panel����m.�j�p
        TopPanel.setBounds(40, 20, 700, 80);
        jscrollpane.setBounds(40, 100, 700, 120);
        jscrollpane2.setBounds(40, 230, 700, 120);
        BottomPanel.setBounds(40, 370, 700, 300);

        // �[�Jpanel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}