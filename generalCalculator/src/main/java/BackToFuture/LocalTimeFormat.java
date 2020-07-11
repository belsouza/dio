package BackToFuture;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeFormat {

    public static void main (String[] args ){

        LocalTime x = LocalTime.now();
        System.out.println(x);

        LocalTime y = x.plusHours(2);
        System.out.println(y);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate tomorrow =  today.minusDays(9);
        System.out.println(tomorrow);

        LocalDateTime i = LocalDateTime.now();
        System.out.println(i);

        LocalDateTime j = i.plusHours(2).plusMinutes(50).plusSeconds(10).plusMonths(3).plusDays(5).plusYears(15);
        System.out.println(j);




    }
}
