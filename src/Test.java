import java.util.Scanner;

public class Test{

	public static void main(String[] args){

		//�~��
		String a = "����(�p)";
		String b = "������  ";
		String c = "�i��(�p)";
		String d = "����(�p)";
		String e = "����(��)";
		String f = "����    ";
		String g = "���ֳ�  ";
		String h = "����(�j)";
		String i = "�j���J  ";
		String j = "�ɦ̿@��";

		//����
		int ap = 33;
		int bp = 44;
		int cp = 28;
		int dp = 28;
		int ep = 44;
		int fp = 30;
		int gp = 48;
		int hp = 55;
		int ip = 72;
		int jp = 40;

		String name[] = {a,b,c,d,e,f,g,h,i,j};//�~���}�C

		int price[] = {ap,bp,cp,dp,ep,fp,gp,hp,ip,jp};//����}�C

		String priceS[] = new String[10];

		for(int o = 0; o < price.length; o++){

			priceS[o] = String.valueOf(price[o]);

		}

		Scanner s = new Scanner(System.in);

		System.out.printf("%s%10s%13s\n\n","�s��","�~��","����");
		for(int counter = 0; counter < name.length; counter++){

			System.out.printf("%-12d%s%10d\n",counter+1,name[counter],price[counter]);

		}

		int quit = 1;//�P�_�O�_�~���ʶR
		int buy = 1;//�\�I�s��
		int type = 0;//���Ior�M�\
		int typeNumber = 0;//�M�\����
		String buylist[] = new String [100];//�ʶR�M��
		int buyNumber = 0;//�ʶR�s��
		int leveup = 0;//�ɯ�
		int drink = 0;//��������
		int total = 0;//�`���B

		while(quit != 2){

			System.out.print("\n��ܱ��ʶR�~��:");

			buy = s.nextInt();

			System.out.print("\n");

			if(buy == 2||buy == 7||buy == 9){

				System.out.print("1���I 2�M�\:");

				type = s.nextInt();

				System.out.print("\n");

				if(type == 2){

					System.out.print("1 ���q�M�\ 2 ����M�\ 3 �Y�ܳ��M�\ : ");

					typeNumber = s.nextInt();

					System.out.print("\n");

					if(typeNumber == 1){

						System.out.print("�O�_�ɯ�����(�j) 1�O 2�_ :");

						leveup = s.nextInt();

						System.out.print("\n");

						if(leveup == 1){

							int priceA = price[(buy - 1)] + 71;

							String spriceA = String.valueOf(priceA);

							System.out.print("�п�ܶ��� 1�i�� 2���� :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){
								buylist[buyNumber] = name[(buy - 1)] + "A�\      " + spriceA + "��\n         ����(�j)\n         �i��";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "A�\      " + spriceA + "��\n         ����(�j)\n         ����";
								buyNumber++;
								total += priceA;

							}

						}else if(leveup == 2){

							int priceA = price[(buy - 1)] + 60;

							String spriceA = String.valueOf(priceA);

							System.out.print("�п�ܶ��� 1�i�� 2���� :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){
 
								buylist[buyNumber] = name[(buy - 1)] + "A�\      " + spriceA + "��\n         ����(��)\n         �i��";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "A�\      " + spriceA + "��\n         ����(��)\n         ����";
								buyNumber++;
								total += priceA;

							}
						}
					}else if(typeNumber == 2){

						System.out.print("�O�_�ɯ����� 1�ɯ�����(��) 2�ɯ�����(�j) 3�_ : ");

						leveup = s.nextInt();

						System.out.print("\n");

						if(leveup == 1){

							int priceA = price[(buy - 1)] + 81;

							String spriceA = String.valueOf(priceA);

							System.out.print("�п�ܶ��� 1�i�� 2���� :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){

								buylist[buyNumber] = name[(buy - 1)] + "B�\      " + spriceA + "��\n         ����(��)\n         ����\n         �i��";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "B�\      " + spriceA + "��\n         ����(��)\n         ����\n         ����";
								buyNumber++;
								total += priceA;

							}

						}else if(leveup == 2){

							int priceA = price[(buy - 1)] + 92;

							String spriceA = String.valueOf(priceA);

							System.out.print("�п�ܶ��� 1�i�� 2���� :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){

								buylist[buyNumber] = name[(buy - 1)] + "B�\      " + spriceA + "��\n         ����(�j)\n         ����\n         �i��";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "B�\      " + spriceA + "��\n         ����(�j)\n         ����\n         ����";
								buyNumber++;
								total += priceA;

							}

						}else if(leveup == 3){

							int priceA = price[(buy - 1)] + 70;

							String spriceA = String.valueOf(priceA);

							System.out.print("�п�ܶ��� 1�i�� 2���� :");

							drink = s.nextInt();

							System.out.print("\n");

							if(drink == 1){

								buylist[buyNumber] = name[(buy - 1)] + "B�\      " + spriceA + "��\n         ����(�p)\n         ����\n         �i��";
								buyNumber++;
								total += priceA;

							}else if(drink == 2){

								buylist[buyNumber] = name[(buy - 1)] + "B�\      " + spriceA + "��\n         ����(�p)\n         ����\n         ����";
								buyNumber++;
								total += priceA;

							}

						}
					}else if(typeNumber == 3){


						int priceA = price[(buy - 1)] + 70;

						String spriceA = String.valueOf(priceA);

						System.out.print("�п�ܶ��� 1�i�� 2���� :");

						drink = s.nextInt();

						System.out.print("\n");

						if(drink == 1){

							buylist[buyNumber] = name[(buy - 1)] + "C�\      " + spriceA + "��\n         ����(�j)\n         �i��";
							buyNumber++;
							total += priceA;

						}else if(drink == 2){

							buylist[buyNumber] = name[(buy - 1)] + "C�\      " + spriceA + "��\n         ����(�j)\n         ����";
							buyNumber++;
							total += priceA;

						}
					}

				}else{

					buylist[buyNumber] = name[(buy - 1)] + "          " + priceS[(buy - 1)] + "��";
					buyNumber++;
					total += price[(buy - 1)];

				}

			}else{

				
					buylist[buyNumber] = name[(buy - 1)] + "          " + priceS[(buy - 1)] + "��";
					buyNumber++;
					total += price[(buy - 1)];

			}
			System.out.print("�O�_�~���ʶR?1�O 2�_ : ");

			quit = s.nextInt();

			System.out.print("\n");

		}

		System.out.println("�\�I����:");
		System.out.printf("%s%5s%14s\n\n","�s��","�~��","����");

		for(int o = 0; o <buyNumber; o++){

			System.out.printf("%d     %s\n\n",(o+1),buylist[o]);

		}

		System.out.printf("�`���B:%19d��",total);

	}
}