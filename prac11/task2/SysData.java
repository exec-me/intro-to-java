package prac11.task2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SysData {
    public static Calendar sysFunc(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE,d MMMM, yyyy");
        System.out.println("System time:" + sdf.format(now));
        Calendar sisNow = Calendar.getInstance();
        sisNow.setTime(now);
        return sisNow;
    }
}
