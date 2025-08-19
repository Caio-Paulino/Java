package academy.devdojo.javaoneforall.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // ISO 639, ISO 3166
        // pt-BR, pt-PT
        Locale localeUS = new Locale("en", "US");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeUS));
        System.out.println(localeItaly.getDisplayLanguage(localeUS));
    }
}
