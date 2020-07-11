package BackToFuture;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDateFormat {

    public static void main(String[] args){

        Calendar me = Calendar.getInstance();
        System.out.println( me.after(-1) );

        Date agora = new Date();
        SimpleDateFormat yu = new SimpleDateFormat("dd/mm/yyyy");
        String foo = yu.format(agora);
        System.out.println(agora);
    }
}
