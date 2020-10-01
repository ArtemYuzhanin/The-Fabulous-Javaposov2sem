import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poem {
    public static void main(String[] args) {
        String s = new String("Знаю?");
        Pattern pattern = Pattern.compile("!|\\?");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            s = s.substring(0, s.length() - 1);
            System.out.println(s);
        }
    }
}
