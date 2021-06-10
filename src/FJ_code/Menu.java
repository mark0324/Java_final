import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

	public static void Menu() { 
		JFrame frame = new JFrame("������I�\�t��"); 
		Container contentPane = frame.getContentPane();

        // �]�w�ϥ�
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
		contentPane.setBackground(Color.yellow); // �NJFrame�Ҷ��I���]�w������ 
		frame.setSize(1400, 900); 
		frame.setLocationRelativeTo(null);// --> �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��

		JPanel panel = new JPanel(); // �إߤ@��JPanel���Ҷ� 
		panel.setBackground(Color.red); // �NJPanel���Ҷ��I���]�w������ 

 		panel.setLayout(null); //�]�w�e�����ϥΧG���޲z��
	
		//�إ߹Ϥ�����
		ImageIcon shoppingCartButtonIcon = new ImageIcon("image/shoppingCart.jpg");
		ImageIcon setAButtonIcon = new ImageIcon("image/setA.jpg");
		ImageIcon setBButtonIcon = new ImageIcon("image/setB.jpg");
		ImageIcon setCButtonIcon = new ImageIcon("image/setC.jpg");

		ImageIcon McMuffinButtonIcon = new ImageIcon("image/McMuffin.jpg");
		ImageIcon McChickenButtonIcon = new ImageIcon("image/McChicken.jpg");
		ImageIcon BigMacButtonIcon = new ImageIcon("image/BigMac.jpg");

		ImageIcon smallFriesButtonIcon = new ImageIcon("image/smallFries.jpg");
		ImageIcon mediumFriesButtonIcon = new ImageIcon("image/mediumFries.jpg");
		ImageIcon largeFriesButtonIcon = new ImageIcon("image/largeFries.jpg");
		ImageIcon hashBrownButtonIcon = new ImageIcon("image/hashBrown.jpg");
		ImageIcon cornSoupButtonIcon = new ImageIcon("image/cornSoup.jpg");

		ImageIcon CokeButtonIcon = new ImageIcon("image/Coke.jpg");
		ImageIcon SpriteButtonIcon = new ImageIcon("image/Sprite.jpg");

		//�ŧi���s����
 		JButton shoppingCart = new JButton("�˵��ʪ���", shoppingCartButtonIcon); 

 		JButton setA = new JButton(setAButtonIcon);
		JButton setB = new JButton(setBButtonIcon);
		JButton setC = new JButton(setCButtonIcon);

 		JButton McMuffin = new JButton(McMuffinButtonIcon);
		JButton McChicken = new JButton(McChickenButtonIcon);
		JButton BigMac = new JButton(BigMacButtonIcon);

 		JButton smallFries = new JButton(smallFriesButtonIcon);
		JButton mediumFries = new JButton(mediumFriesButtonIcon);
		JButton largeFries = new JButton(largeFriesButtonIcon);
 		JButton hashBrown = new JButton(hashBrownButtonIcon);
		JButton cornSoup = new JButton(cornSoupButtonIcon);

		JButton Coke = new JButton(CokeButtonIcon);
		JButton Sprite = new JButton(SpriteButtonIcon);

		//�]�w���s�j�p
 		shoppingCart.setSize(new Dimension(300,60)); 
		setA.setSize(new Dimension(520,230)); 
		setB.setSize(new Dimension(520,230)); 
		setC.setSize(new Dimension(520,230)); 

		McMuffin.setSize(new Dimension(260,230)); 
		McChicken.setSize(new Dimension(260,230)); 
		BigMac.setSize(new Dimension(260,230)); 

		smallFries.setSize(new Dimension(260,150)); 
		mediumFries.setSize(new Dimension(260,150)); 
		largeFries.setSize(new Dimension(260,150));
 		hashBrown.setSize(new Dimension(260,230)); 
		cornSoup.setSize(new Dimension(260,230)); 

		Coke.setSize(new Dimension(260,230)); 
		Sprite.setSize(new Dimension(260,230)); 

		//�]�w�����m
 		shoppingCart.setLocation(1070, 20); 
 		setA.setLocation(850, 110); 
 		setB.setLocation(850, 360); 
 		setC.setLocation(850, 610); 

 		McMuffin.setLocation(20, 110); 
 		McChicken.setLocation(300, 110); 
 		BigMac.setLocation(580, 110); 

 		smallFries.setLocation(20, 360); 
 		mediumFries.setLocation(20, 520); 
 		largeFries.setLocation(20, 680); 
 		hashBrown.setLocation(300, 360); 
 		cornSoup.setLocation(580, 360); 

 		Coke.setLocation(300, 610); 
 		Sprite.setLocation(580, 610); 


		//�[�JĲ�o����
		McMuffin.addActionListener(new McMuffinOrder());
		smallFries.addActionListener(new smallFriesOrder());

		//�N����[�J�e��
 		panel.add(shoppingCart); 
 		panel.add(setA);
 		panel.add(setB);
 		panel.add(setC);

 		panel.add(McMuffin);
 		panel.add(McChicken);
 		panel.add(BigMac);

 		panel.add(smallFries);
 		panel.add(mediumFries);
 		panel.add(largeFries);
 		panel.add(hashBrown);
 		panel.add(cornSoup);

 		panel.add(Coke);
 		panel.add(Sprite);

		contentPane.add(panel); // �NJPanel�Ҷ��s�W��JFrame
		frame.setVisible(true); 
	}
}

class McMuffinOrder implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	   BurgerOrder.BurgerOrder();
	}
}

class smallFriesOrder implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		OrderWindow.OrderWindow();
	}
}