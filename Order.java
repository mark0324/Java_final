import java.util.Scanner;

public class Order{

	public static void main(String [] args){

		new MenuData(Single_Menu, Set_Menu);

		Scanner s = new Scanner(System.in);

		SinglePoint single = new SinglePoint();

		System.out.printf("%s%10s%13s\n\n","�s��","�~��","����");

		for(int counter = 1; counter <= 10; counter++){

			single = new SinglePoint(counter);

			System.out.printf("%-12d%s%10d\n",single.getNo(),single.getName(),single.getPrice());

		}

		int quit = 1;//�O�_�~���ʶR
		int buy = 0;//�ʶR�ӫ~�~��
		int type = 0;//���Ior�M�\
		int typeNumber = 0;//A,B,C�\
		int setcount = 0;//�M�\�ƶq
		int total = 0;//�`���B

		int Singlecount[] = {0,0,0,0,0,0,0,0,0,0};//���I�U�\�I�ƶq
		int Setcount[] = {0,0,0,0,0,0,0,0,0};//�M�\�U�\�I�ƶq

		SinglePoint singlelist [] = {new SinglePoint(1),new SinglePoint(2),new SinglePoint(3),new SinglePoint(4),new SinglePoint(5),new SinglePoint(6),new SinglePoint(7),new SinglePoint(8),new SinglePoint(9),new SinglePoint(10),};
		SetMeal setmeal [] = {new SetMeal(2,1),new SetMeal(2,2),new SetMeal(2,3),new SetMeal(7,1),new SetMeal(7,2),new SetMeal(7,3),new SetMeal(9,1),new SetMeal(9,2),new SetMeal(9,3)};
		while(quit != 2){

			
			System.out.print("\n��ܱ��ʶR�~��:");

			buy = s.nextInt();

			System.out.print("\n");

			switch(buy){

				case 1:
					Singlecount[(buy-1)]++;
					break;
				case 2:
					System.out.print("1���I 2�M�\:");
					type = s.nextInt();

					System.out.print("\n");

					if(type == 1){

						Singlecount[(buy-1)]++;

					}else if(type == 2){

						System.out.print();
						typeNumber = s.nextInt();

						System.out.print("\n");

						setmeal[setcount] = new SetMeal(buy,typeNumber);
						setcount++;
					}
					break;
				case 3:
					Singlecount[(buy-1)]++;
					break;
				case 4:
					Singlecount[(buy-1)]++;
					break;
				case 5:
					Singlecount[(buy-1)]++;
					break;
				case 6:
					Singlecount[(buy-1)]++;
					break;
				case 7:
					System.out.print("1���I 2�M�\:");
					type = s.nextInt();

					System.out.print("\n");

					if(type == 1){

						Singlecount[(buy-1)]++;

					}else if(type == 2){

						System.out.print("1 ���q�M�\ 2 ����M�\ 3 �Y�ܳ��M�\ : ");
						typeNumber = s.nextInt();

						System.out.print("\n");

						setmeal[setcount] = new SetMeal(buy,typeNumber);
						setcount++;
					}
					break;
				case 8:
					Singlecount[(buy-1)]++;
					break;
				case 9:
					System.out.print("1���I 2�M�\:");
					type = s.nextInt();

					System.out.print("\n");

					if(type == 1){

						Singlecount[(buy-1)]++;

					}else if(type == 2){

						System.out.print("1 ���q�M�\ 2 ����M�\ 3 �Y�ܳ��M�\ : ");
						typeNumber = s.nextInt();

						System.out.print("\n");

						setmeal[setcount] = new SetMeal(buy,typeNumber);
						setcount++;
					}
					break;
				case 10:
					Singlecount[(buy-1)]++;
					break;
			}

			System.out.print("�O�_�~���ʶR?1�O 2�_ : ");

			quit = s.nextInt();

		}

		System.out.printf("\n%s%12s%8s\n\n","�~��","�ƶq","����");

		for(int i = 0; i < setcount; i++){

			System.out.println(setmeal[i]);

			total += setmeal[i].getPrice();
		}

		for(int i = 0; i < 10; i++){

			if(Singlecount[i] > 0){

				System.out.println(singlelist[i] + "  x" + Singlecount[i] + "        " + singlelist[i].getPrice() * Singlecount[i] + "��\n");

				total += singlelist[i].getPrice() * Singlecount[i];
			}
		}

		System.out.printf("\n�`���B:                 %d��",total);

	}
}