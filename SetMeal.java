public class SetMeal{

	private String Meal;
	private String No;
	private String Type;
	private int Price;

	public SetMeal(int j,int i){

		switch(j){

			case 2:
				switch(i){

					case 1:
						Meal = "������(A)\n   ����(��)\n   ����(�p)";
						No = "A";
						Type = "���q�M�\";
						Price = 104;
						break;
					case 2:
						Meal = "������(B)\n   ����(�p)\n   ����\n   �i��(�p)";
						No = "B";
						Type = "����M�\";
						Price = 114;
						break;
					case 3:
						Meal = "������(C)\n   ����(�j)\n   ����(�p)";
						No = "C";
						Type = "�Y�ܳ��M�\";
						Price = 114;
						break;
				}
				break;

			case 7:
				switch(i){

					case 1:
						Meal = "���ֳ�(A)\n   ����(��)\n   ����(�p)";
						No = "A";
						Type = "���q�M�\";
						Price = 108;
						break;
					case 2:
						Meal = "���ֳ�(B)\n   ����(�p)\n   ����\n   �i��(�p)";
						No = "B";
						Type = "����M�\";
						Price = 118;
						break;
					case 3:
						Meal = "���ֳ�(C)\n   ����(�j)\n   ����(�p)";
						No = "C";
						Type = "�Y�ܳ��M�\";
						Price = 118;
						break;
				}
				break;

			case 9:
				switch(i){

					case 1:
						Meal = "�j���J(A)\n   ����(��)\n   ����(�p)";
						No = "A";
						Type = "���q�M�\";
						Price = 132;
						break;
					case 2:
						Meal = "�j���J(B)\n   ����(�p)\n   ����\n   �i��(�p)";
						No = "B";
						Type = "����M�\";
						Price = 142;
						break;
					case 3:
						Meal = "�j���J(C)\n   ����(�j)\n   ����(�p)";
						No = "C";
						Type = "�Y�ܳ��M�\";
						Price = 142;
						break;
				}
				break;
		}
	}

	public String getMeal(){

		return Meal;

	}

	public String getNo(){

		return No;

	}

	public String getType(){

		return Type;

	}

	public int getPrice(){

		return Price;

	}

	public String toString(){

		return getMeal();
	}
}