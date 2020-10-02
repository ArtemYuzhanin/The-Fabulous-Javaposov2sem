package MassiveAssociation;

import java.util.HashMap;
import java.util.Map;

public class Pereschet {

    public static HashMap Schet(String s) {
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
