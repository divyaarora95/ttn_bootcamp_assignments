import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DifferentCountryFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
//        Chennai
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Chennai"));
        System.out.println("Time According to Chennai(Asia) "+simpleDateFormat.format(calendar.getTime()));
//        Chicago
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
        System.out.println("Time According to Chicago(America "+simpleDateFormat.format(calendar.getTime()));
    
    }
}
