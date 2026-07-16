package easy2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Clock {

    public void showTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        System.out.println(formatter.format(LocalDateTime.now(ZoneId.of("Europe/Moscow"))));
    }
}
