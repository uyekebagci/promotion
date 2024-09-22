package umut.banking.demo.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by INNGKISAKOL on 9/21/2017.
 */
public class CalendarUtils
{
    private final static Logger LOG = LogManager.getLogger(CalendarUtils.class);

    private static final DateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm");

    public static Timestamp getCurrentTimeStamp()
    {
        return new Timestamp(new Date().getTime());
    }

    public static Date stringToDate(String date, String pattern)
    {
        return stringToDateUsingDateFormat(date, pattern);
    }

    public static Date stringToDateUsingDateFormat(String date, String pattern)
    {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date d = null;
        try
        {
            d = dateFormat.parse(date);
        }
        catch (ParseException e)
        {
            System.out.println("TODO");
        }
        return d;
    }

    public static Date stringToDateUsingDateFormat(String date)
    {
        return stringToDateUsingDateFormat(date, "dd/MM/yyyy");
    }

    public static String dateToString(Date date, DateFormat dateFormat)
    {
        try
        {
            return dateFormat.format(date);
        }
        catch (Exception e)
        {
            return StringUtils.EMPTY;
        }
    }

    public static String dateToString(Date date, String pattern) {
        try {
            SimpleDateFormat simpleformat = new SimpleDateFormat(pattern);
            return simpleformat.format(date);
        } catch (Exception e) {
            return StringUtils.EMPTY;
        }
    }

    public static boolean compareHourMinute(String startTime, String endTime)
    {
        /*DateTimeFormatter df = DateTimeFormat.forPattern("HH:mm");
        LocalTime start = df.parseLocalTime(startTime);
        LocalTime end = df.parseLocalTime(endTime);
        return start.isBefore(end);*/
        return true;
    }

    public static Date saatBilgisiniSifirla(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getDayWithMaxHour(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.getActualMaximum(Calendar.HOUR),
                calendar.getActualMaximum(Calendar.MINUTE),
                calendar.getActualMaximum(Calendar.SECOND)
        );
        calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
        return calendar.getTime();
    }
}
