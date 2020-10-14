package MassiveAssociation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class niChestotniiSlovar {
    public static HashMap Slovar(String s) throws FileNotFoundException {
        File f = new File("src\\CollectionOfTasks\\text.txt");
        Pattern pattern = Pattern.compile(",|\\.|:|!|\\?");
        Scanner in = new Scanner(f, "utf-8");

        HashMap<Character, Integer> spisok = new HashMap();
        for (int i = 0; i<s.length(); i++) {
            if (spisok.containsKey(s.charAt(i))) {
                spisok.put(s.charAt(i), spisok.get(s.charAt(i)) + 1);
            }
            else {
                spisok.put(s.charAt(i), 1);
            }
        }
        return spisok;
    }
}
