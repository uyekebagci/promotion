package umut.banking.demo.utils;

public class StringUtils {

    public static final String EMPTY = "";

    public static boolean isNull (String str) {
        return (str == null);
    }

    public static boolean isNotNull (String str) {
        return !isNull(str);
    }

    public static boolean isNotBlank(String obj){
        return !isBlank(obj);
    }

    public static boolean isBlank(String obj){
        return obj == null || obj.isEmpty();
    }

    public static boolean isNotEmpty(String date) {
        return !isEmpty(date);
    }

    public static boolean isEmpty (String date) {
        if(isNull(date))
            return true;
        return isBlank(date);
    }

    public static boolean defaultIfEmpty(String cityCode, String empty) {
        if (isNull(cityCode))
            cityCode = empty;
        return isNull(cityCode);
    }
}
