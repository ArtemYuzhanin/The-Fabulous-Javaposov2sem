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
            if (mesta.containsKey(s.charAt(i))) {
                List l = mesta.get(s.charAt(i));
                l.add(i+1);
                mesta.put(s.charAt(i), l);
            }
            else {
                List m = new ArrayList();
               m.add(i+1);
                mesta.put(s.charAt(i), m);
            }
        }
        return mesta;
    }
}
