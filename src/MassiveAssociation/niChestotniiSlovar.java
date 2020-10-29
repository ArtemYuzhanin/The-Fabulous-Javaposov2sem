package MassiveAssociation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class niChestotniiSlovar {
    public static void Slovar(String p, Map<String, Integer> slvr) throws FileNotFoundException {
        File f = new File(p); //"src\\CollectionOfTasks\\text.txt"
        Scanner in = new Scanner(f, "utf-8").useDelimiter(", |\\. |: |! |\\? |\\s");

        while (in.hasNext()) {
            String s = in.next();
            s = s.toLowerCase();
            if (slvr.containsKey(s)) {
                slvr.put(s, slvr.get(s) + 1);
            }
            else {
                slvr.put(s, 1);
            }
        }
    }
}

