package MassiveAssociation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Position {
    public static void main(String[] args) {
        String b = "banana";
        System.out.println(Pose(b));
    }

    public static HashMap Pose(String s) {
        HashMap<Character, List<Integer>> mesta = new HashMap();
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (mesta.containsKey(c)) {
                List l = mesta.get(c);
                l.add(i+1);
                mesta.put(c, l);
            }
            else {
                List m = new ArrayList();
               m.add(i+1);
                mesta.put(c, m);
            }
        }
        return mesta;
    }
}
