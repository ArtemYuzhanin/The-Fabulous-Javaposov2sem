package MassiveAssociation;

import java.util.HashMap;
import java.util.Map;

public class Pereschet {

    public static HashMap Schet(String s) {
        HashMap<Character, Integer> spisok = new HashMap();
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (spisok.containsKey(c)) {
                spisok.put(c, spisok.get(c) + 1);
            }
            else {
                spisok.put(c, 1);
            }
        }
        return spisok;
    }
}
