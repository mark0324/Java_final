import java.util.ArrayList;

public class SinglePoint{

    static ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
	static ArrayList<setType> Set_Menu = new ArrayList<setType>();

	private int No;
	private String Name;
	private int Price;

	public SinglePoint(){}

	public SinglePoint(int i){

		new MenuData(Single_Menu, Set_Menu);

		No = i;

		switch(i){

			case 1:
				Name = Single_Menu.get(0).getName();
				Price = 33;
				break;
			case 2:
				Name = "������  ";
				Price = 44;
				break;
			case 3:
				Name = "�i��(�p)";
				Price = 28;
				break;
			case 4:
				Name = "����(�p)";
				Price = 28;
				break;
			case 5:
				Name = "����(��)";
				Price = 44;
				break;
			case 6:
				Name = "����    ";
				Price = 30;
				break;
			case 7:
				Name = "���ֳ�  ";
				Price = 48;
				break;
			case 8:
				Name = "����(�j)";
				Price = 55;
				break;
			case 9:
				Name = "�j���J  ";
				Price = 72;
				break;
			case 10:
				Name = "�ɦ̿@��";
				Price = 40;
				break;
		}
	}

	public int getNo(){

		return No;

	}

	public String getName(){

		return Name;

	}

	public int getPrice(){

		return Price;

	}


	public String toString(){

		return getName() + "     ";
	}
}