package academy.devdojo.javaoneforall.formatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeIT = new Locale("it", "IT");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double value = 100_000_000.2130;

        for (NumberFormat numberformat : nfa) {
            System.out.println(numberformat.format(value));
        }
    }
}
