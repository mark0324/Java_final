import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
    //<Hsiang-Ming>
    //�o��class�@��CSV��Ū����
    String filename;//�nŪ���ɮצW��
    ArrayList<String> csvArrayList = new ArrayList<String>();//�ŧi�@��ArrayList�@��Ū�J�ɮת��Ȧs��

    public ReadCSV(String filename) {
        this.filename = filename;

        File csvFile = new File(filename);//new�@���ɮ�object

        try { //��error handling
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));//�z�LFileReader�ǤJBufferedReader�v��Ū�X
            String csvString; //�ŧi�@��string�s�򦬤JBufferedReaderŪ�X��string
            String[] arrayFinish;//�ŧi�@��String�}�C�n�����L��String
            while((csvString = reader.readLine()) != null) {
                arrayFinish = csvString.split(",");//��s��String�̷ӳr�I���}�A�s�JString�}�C
                for (String arrayFinishData : arrayFinish) {
                    csvArrayList.add(arrayFinishData);//��String�}�C���������̧Ǧs�J��}�l�ŧi�n��ArrayList
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();//Error handling
        }
    };
    //<Hsiang-Ming>
}