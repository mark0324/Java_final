import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
//<�x����--
    //�o��class�Ψӧ@csv��Ū����
    String filename;//�ŧi�nŪ���ɮצW
    ArrayList<String> csvArrayList = new ArrayList<String>();//�ΨӼȦsŪ�J��csv��ArrayList

    public ReadCSV(String filename) {
        this.filename = filename;

        File csvFile = new File(filename);//new�@��file���ɮ�Ū�icsvFile

        try { //error handling
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));//new�@��FileReader�z�LBufferedReaderŪ�Jreader
            String csvString; //�ŧistring�ȦsBufferedReader���ͪ��s��string
            String[] arrayFinish;//�ΨӦs���Ϋ᪺String
            while((csvString = reader.readLine()) != null) {
                arrayFinish = csvString.split(",");//�NŪ�J���s��string�z�L�r�I����
                for (String arrayFinishData : arrayFinish) {
                    csvArrayList.add(arrayFinishData);//�z�Lfor�j�鱱��N���Ϋ᪺String�̧ǥ[�J�Ȧs��ArrayList
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();//Error handling
        }
    };
//--�x����>
}