import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;
import java.util.*;


public class t1 extends JFrame{
    /*
        private String[][] data = {{"�s���@","��Ƥ@", "4"},{"�s���G","��ƤG", "4"},{"�s���T","��ƤT", "4"}};
        private String[] dataTitle = {"�\�I","�ƶq", "����"};
        private JTable jtable = new JTable(data, dataTitle);
        private JScrollPane jscrollpane = new JScrollPane(jtable);
*/
        public t1() {
        String[][] data = {{"�s���@","��Ƥ@", "4"},{"�s���G","��ƤG", "4"},{"�s���T","��ƤT", "4"}};
        String[] dataTitle = {"�\�I","�ƶq", "����"};
        JTable jtable = new JTable(data, dataTitle);            
        JScrollPane jscrollpane = new JScrollPane(jtable);

        setTitle("�إߪ��");
        setBounds(300,300,300,300);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jscrollpane,BorderLayout.CENTER);
        }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        t1 T = new t1(); 
    }
}
