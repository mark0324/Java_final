import javax.swing.*;  //�ޥ�Swing�M��
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
	public static void Menu() { 
		JFrame frame = new JFrame("�������I�\�t��"); 
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
		ImageIcon setAIcon = new ImageIcon("image/setA.jpg");
		ImageIcon setBIcon = new ImageIcon("image/setB.jpg");
		ImageIcon setCIcon = new ImageIcon("image/setC.jpg");

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

		//�]�w����
		JLabel setA = new JLabel(setAIcon);
		JLabel setB = new JLabel(setBIcon);
		JLabel setC = new JLabel(setCIcon);

		//�]�w�����m�j�p
		shoppingCart.setBounds(1070, 20,300,60); 
		setA.setBounds(850, 110,520,230); 
		setB.setBounds(850, 360,520,230); 
		setC.setBounds(850, 610,520,230); 

		McMuffin.setBounds(20, 110,260,230); 
		McChicken.setBounds(300, 110,260,230); 
		BigMac.setBounds(580, 110,260,230); 

		smallFries.setBounds(20, 360,260,150); 
		mediumFries.setBounds(20, 520,260,150); 
		largeFries.setBounds(20, 680,260,150);
		hashBrown.setBounds(300, 360,260,230); 
		cornSoup.setBounds(580, 360,260,230);

		Coke.setBounds(300, 610,260,230); 
		Sprite.setBounds(580, 610,260,230); 

		//�[�JĲ�o����
		McMuffin.addActionListener(new McMuffinOrderListener());
		McChicken.addActionListener(new McChickenOrderListener());
		BigMac.addActionListener(new BigMacOrderListener());

		smallFries.addActionListener(new smallFriesOrderListener());
		mediumFries.addActionListener(new mediumFriesOrderListener());
		largeFries.addActionListener(new largeFriesOrderListener());
		hashBrown.addActionListener(new hashBrownOrderListener());
		cornSoup.addActionListener(new cornSoupOrderListener());
		Coke.addActionListener(new CokeOrderListener());
		Sprite.addActionListener(new SpriteOrderListener());
		shoppingCart.addActionListener(new ShoppingCartListener());

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
