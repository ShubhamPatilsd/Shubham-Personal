import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class time {
    public static void main(String[] args){
        LocalTime clock= LocalTime.now();
        LocalDate clocknew=LocalDate.now();
        LocalDateTime clock3=LocalDateTime.now();
        String s=clock.toString();
        String i=clocknew.toString();

        System.out.println(i+" "+s);


    }
}
