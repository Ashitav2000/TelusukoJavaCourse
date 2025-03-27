import java.util.*;
public class DateTime {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        java.sql.Date sdate = new java.sql.Date(time);
        System.out.println(sdate);
    }
}
