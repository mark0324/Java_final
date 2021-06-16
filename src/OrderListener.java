//<Ĭ��@--
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class McMuffinOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.McMuffinFrame();
	}
}

class McChickenOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.McChickenFrame();
	}
}

class BigMacOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.BigMacFrame();
	}
}

class smallFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.smallFriesFrame();
	}
}

class mediumFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.mediumFriesFrame();
	}
}

class largeFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.largeFriesFrame();
	}
}

class hashBrownOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.hashBrownFrame();
	}
}

class cornSoupOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.cornSoupFrame();
	}
}

class CokeOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.CokeFrame();
	}
}

class SpriteOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.SpriteFrame();
	}
}

class ShoppingCartListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		ShoppingCart s = new ShoppingCart();
		s.ShoppingCartFrame();
	}
}

class DetailListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		OrderData.RemarksContent = ShoppingCart.Remarks.getText();
		Detail.Detail();
		//OrderData.forhereCount ++; //���ͤ@�ө��ӶH�x�q�沣�ͤ@���A�G�U�@��ȤH�n�ϥΪ��s���n�[�@
		//OrderData.togoCount ++;
	}
}

class CancelListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "�T�w�n�����q���? \n���U�T�{��t�αN�����{���C", "�����q��T�{", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
}
//--Ĭ��@>

class ViewMenuListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
        ShoppingCart.frame.dispose();
    }
}

//<�x����--
class VerificationListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int check = CouponCheck();
		if(check != 0 && check <= 3){
			OrderData.CouponCode += ShoppingCart.Discount.getText() + " "; //��ϥΪ̥ιL��coupon�s��@��string��K���
			ShoppingCart.CouponSingle(CouponList(check));// ���I��coupon�A�a�J���I��tablemodel
		} else if (check > 3) {
			OrderData.CouponCode += ShoppingCart.Discount.getText() + " ";
			ShoppingCart.CouponSet(CouponList(check));// �M�\��coupon�A�a�J�M�\��tablemodel
		} else {
			JOptionPane.showMessageDialog(null,"Invalid Coupon","Fail",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("image/joptionpaneICON.png"));//�p�Gcoupon���ҥ��Ѫ��ܷ|���X�T���i�D�ϥΪ�
		}

	}
	public static int CouponCheck(){ //���ѨϥΪ̿�J���u�f�N�X
		int value;
		if(ShoppingCart.Discount.getText().equals("Fries")) {
			value = 1;
		} else if(ShoppingCart.Discount.getText().equals("Coke")){
			value = 2;
		} else if(ShoppingCart.Discount.getText().equals("BigMac")){
			value = 3;
		} else if(ShoppingCart.Discount.getText().equals("SuperCoupon")){
			value = 4;
		} else if(ShoppingCart.Discount.getText().equals("���I�@��")){
			value = 5;
		} else if(ShoppingCart.Discount.getText().equals("���饴�착��")) {
			value = 6;
		} else {
			value = 0;
		}
		return value;
	}
	public static String[] CouponList(int check){
		String[] temp ;
		switch(check){
			case 1:
				temp = new String[]{(ShoppingCart.Single_Menu.get(7).getName()),"1","Free"};//��n�s��tablemodel��string�}�C���temp�H�^�ǡA�H�U�P�z
				break;
			case 2:
				temp = new String[]{(ShoppingCart.Single_Menu.get(2).getName()),"1","Free"};
				break;
			case 3:
				temp = new String[]{(ShoppingCart.Single_Menu.get(8).getName()),"1","Free"};
				break;
			case 4:
				temp = new String[]{(ShoppingCart.Single_Menu.get(1).getName() + "�W�����u�f"),(ShoppingCart.Single_Menu.get(7).getName()),(ShoppingCart.Single_Menu.get(7).getName()),(ShoppingCart.Single_Menu.get(9).getName()),"1","Free"};
				break;
			case 5:
				ShoppingCart.TotalContent = "�`���� "+((OrderData.calculateSingle()/10)+(OrderData.calculateSet()))+" ��";//�o����u�f�O�����u�f���ݱa�Jmodel�A�����վ��ʪ����P���Ӫ���X���e�A�H�U�P�z
				ShoppingCart.total.setText(ShoppingCart.TotalContent);
				temp = null;
				break;
			case 6:
				ShoppingCart.TotalContent = "�`���� "+(OrderData.calculateTotal()/20)+" ��";
				ShoppingCart.total.setText(ShoppingCart.TotalContent);
				temp = null;
				break;
			default:
				temp = null;
				break;
		}
		return temp;
	}
//<�x����
}
