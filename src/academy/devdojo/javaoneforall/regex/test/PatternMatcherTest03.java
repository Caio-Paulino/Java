package academy.devdojo.javaoneforall.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = All the digits
        // \D = All that's not digit
        // \s = Blank spaces \t \n \f \r
        // \S = All the characters excluding blank spaces
        // \w = a-zA-Z, digits, _
        // \W = Everything that is not included in \w
        String regex = "\\W";
//        String text = "abaaba";
        String text = "@#hhj212gv h_21kh2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:   " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Positions found: ");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
