package academy.devdojo.javaoneforall.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = All the digits
        // \D = All that's not digit
        // \s = Blank spaces \t \n \f \r
        // \S = All the characters excluding blank spaces
        // \w = a-zA-Z, digits, _
        // \W = Everything that is not included in \w
        // [] = Search for everything you put there
        // ? Zero or one quantifiers
        // * Zero or more
        // + One or more
        // {n,m} from n to m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . = 1.3 => 1@3, 123, 133...

        String regex = "0[xX]([0-9a-fA-F])+\\s|$";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:   " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Positions found: ");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numex = 0x109;
        System.out.println("numex: " + numex);
    }
}
