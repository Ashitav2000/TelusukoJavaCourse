import java.time.*;
public class DateTime2 {
    public static void main(String[] args)
    {
        // here new cannot be used
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dayofMonth = date.getDayOfMonth();
        System.out.println(dayofMonth);


        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
