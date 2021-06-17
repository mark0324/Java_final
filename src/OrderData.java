public class OrderData {
//<�x����--
    //�o��class���ت��O�s�ڭ̭q�檺�U�ظ��
    static int[] Singlecount = new int[10];// ���I�U�\�I�ƶq�p�ƾ��A���I���̺�
    static int[] Setcount = new int[9];// �M�\�U�\�I�ƶq�p�ƾ��A�M�\�T�� x �T�إD�\
    static String CouponCode = "";//�s�ȤH�ϥιL���u�f�X
    static String RemarksContent;//�s�ȤH���Ƶ�
    static int forhereCount = 1;//���I���q��s��
    static int togoCount = 1;//�~�a���q��s��
    
    public static void Reset(){ //���m�I��Ȧs��
        for(int i=0; i < 10 ; i++) {
            Singlecount[i] = 0;
        }
        for(int i=0; i < 9 ; i++) {
            Setcount[i] = 0;
        }
        CouponCode = "";
        RemarksContent = "";
        ShoppingCart.TotalContent = "";
    }
    public static int calculateTotal(){ //�w�]�`���׳��I�[�W�M�\
        return calculateSingle() + calculateSet();
    }
    public static int calculateSingle(){ //���I����[�`
        int SingleTotal = 0;
        for(int i=0; i < 10 ; i++) { //�̺س��I�A�HFor�j�鰵�[�`
            if(Singlecount[i] > 0){ //�ˬd�Ӷ��O�_���\�I
                SingleTotal += ShoppingCart.Single_Menu.get(i).getPrice() * Singlecount[i];//���I������ x �ƶq
            }
        }
        return SingleTotal; //�^�ǳ��I�`��
    }
    public static int calculateSet(){ //�M�\����[�`
        int SetTotal = 0;
        int onlyPrice = 0; //�M�\�`�������a�����I�D�\�����B�A�]��CSV��Ƥ����M�\�O�u�����\����
        for(int i = 0; i < 9 ; i++) { // �T�D�\ x �T�M�\
            if(Setcount[i] > 0) { // �ˬd�Ӷ��O�_���\�I
                if(i <= 2){ // 0,1,2 �� ������ ABC�\�A�H�U����
                    onlyPrice = ShoppingCart.Single_Menu.get(1).getPrice();
                } else if (i <= 5) {
                    onlyPrice = ShoppingCart.Single_Menu.get(6).getPrice();
                } else {
                    onlyPrice = ShoppingCart.Single_Menu.get(8).getPrice();
                }
                SetTotal += (onlyPrice + ShoppingCart.Set_Menu.get(i%3).getPrice()) * Setcount[i];//����[�`�O���I�M�\�D�\�[�W�M�\���\
            }
        }
        return SetTotal;//�^�ǮM�\�`��
    }
//<�x����
}

