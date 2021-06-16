import java.util.ArrayList;
//<�x����--
//�o��{�����ت��O��Ū�i�Ӫ�CSV�q�쥻���OString�ন�ڭ̷Q�n����ƫ��O
public class MenuData{
    public ArrayList<String> Single_Meal = new ArrayList<String>();//�ŧi��ӪŪ�ArrayList�ΨӦs��Y�N�s�i�Ӫ�CSV�ɮ�
    public ArrayList<String> Set_Meal = new ArrayList<String>();
    public MenuData(ArrayList<singleType> menu1, ArrayList<setType> menu2) {
        Single_Meal.addAll(new ReadCSV("Single_meal.csv").csvArrayList);//�N���I����ƾ㵧�[�JSingle_Meal�o��ArrayList
        Set_Meal.addAll(new ReadCSV("Set_meal.csv").csvArrayList);//�N�M�\��ƾ㵧�[�JSet_Meal�o��ArrayList

        if (menu1 != null) {
            for (int i = 1; i < (Single_Meal.size() / 5); i++) {//���I����ƬO���Ӭ��@���A�ҥH��For�j�鱱��Y�NŪ�i�h�s��ؼЫ��O��ArrayList
                int k = i * 5; //Single_Meal��Index�ȡA�q���}�l����]�O���F���s�J�Ĥ@�C�����Y
                singleType temp1 = new singleType(Single_Meal.get(k), Single_Meal.get(k + 1), Single_Meal.get(k + 2), Single_Meal.get(k + 3), Single_Meal.get(k + 4));//���Ʃ��Ȧs��ArrayList�A��ƫ��O�O�ڭ̦۫ت�
                menu1.add(temp1);//���Ʊq�Ȧs��ArrayList��i�h�ڭ̷Q��ArrayList�A�ӥؼ�ArrayList�z�L�غc�l���޼ƨӱa�J�A�U��P�z
            }
        }
        if (menu2 != null) {
            for (int i = 1; i < (Set_Meal.size() / 6); i++) {
                int k = i * 6;
                setType temp2 = new setType(Set_Meal.get(k), Set_Meal.get(k + 1), Set_Meal.get(k + 2), Set_Meal.get(k + 3), Set_Meal.get(k + 4), Set_Meal.get(k + 5));
                menu2.add(temp2);
            }
        }
    }

    public MenuData(ArrayList<singleType> single_menu_ref) { //OverLoading�A���Ǳ��p�u�n���I����ơA�ҥH�g�F�@�Ӧh���ӨϥΦs�J��k
        this(single_menu_ref, null);
    }
}
//--�x����>