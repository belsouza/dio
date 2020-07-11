package BackToFuture;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeDateFormatTwo {

    public static void main(String[] args ){
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
        String dataformatada = formatter.format(agora);
        System.out.println(dataformatada);
    }
}
