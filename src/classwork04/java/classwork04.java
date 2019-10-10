import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class classwork04 {
    public static void main(String[] args) {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        System.out.println(date);

    }
}
