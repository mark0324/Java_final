import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;
import java.util.*;

public class ShoppingCart extends JFrame{
    
    public ShoppingCart(){

        JFrame frame = new JFrame("�I�\"); 
		Container contentPane = frame.getContentPane();

        // �]�w�ϥ�
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(1400, 900);
        frame.setLocationRelativeTo(null);// --> �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��

        JPanel panel = new JPanel(); // �إߤ@��JPanel���Ҷ� 
 
        panel.setLayout(null); //�]�w�e�����ϥΧG���޲z��

        String[][] data = {{"�s���@","��Ƥ@", "4"},{"�s���G","��ƤG", "4"},{"�s���T","��ƤT", "4"}};
        String[] dataTitle = {"�\�I","�ƶq", "����"};       
        JTable jtable = new JTable(data, dataTitle);
        JScrollPane jscrollpane = new JScrollPane(jtable);
 
        jtable.setBounds(100,100,1000,100); //(x, y, width, height)


        //�إ߿�J��
        JTextField amount = new JTextField("�Ƶ�");
        
        //�إ߫��s
        JButton Cancel = new JButton("�����q��");
        JButton Confirm = new JButton("���b");

        //�]�w�j�p
        amount.setSize(new Dimension(1000,70));        
        Cancel.setSize(new Dimension(100,60));
        Confirm.setSize(new Dimension(100,60));

        //�]�w��m
        jtable.setLocation(100,100);
        amount.setLocation(100, 500);
        Cancel.setLocation(1000, 750); 
        Confirm.setLocation(1200, 750); 

        //�N����K�[��panel
        panel.add(jscrollpane);
        panel.add(jtable);
        panel.add(amount);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 
        add(jscrollpane,BorderLayout.CENTER);
    }

    public static void main (String [] args){
        ShoppingCart ShoppingCart = new ShoppingCart();
        //ShoppingCart.ShoppingCart();
    } 
}