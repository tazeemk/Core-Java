package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDateTime
{
    void meth1(){
for (String s: ZoneId.getAvailableZoneIds()){
    System.out.println(s);

}
        System.out.println("===>"+ZoneId.getAvailableZoneIds().size());

    }

    public static void main(String[] args)
    {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        new NewDateTime().meth1();
    }
}
