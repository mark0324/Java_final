//<Ĭ��@--
import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTime{
    public static boolean CompareTime(){
        //�ɶ��榡�ƿ�X�AHH��24�p�ɨ�
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        //LocalTime ��ܤ��t������ɶ��A Date()����:�ϥΤ��󪺤������P��k���o�ާ@�ɪ�����ɶ�
        //LocalTime.parse() ->  parse �r�ꦨ LocalTime
        LocalTime timeNow = LocalTime.parse(time.format(new Date()));
  
        //���\�I���ɶ�10:30
        LocalTime changeTime = LocalTime.parse("10:30:00");
  
        //��isBefore()�P�_�{�b�ɶ��O���O�b���\�I���ɶ��e�A�^��boolean��
        return timeNow.isBefore(changeTime);
    }
}   
//--Ĭ��@>