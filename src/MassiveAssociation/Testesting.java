package MassiveAssociation;

import CollectionOfTasks.FirstList;

import java.io.FileNotFoundException;
import java.util.*;

public class Testesting {
    public static void main(String[] args) throws FileNotFoundException {
        Transliterator tr = new Transliterator();
        String s = "перепосылающий";
        System.out.println(tr.Trans(s));
        String txt = "распокупочка";
        System.out.println(tr.Trans(txt));
        Pereschet pr = new Pereschet();
        System.out.println(pr.Schet(s));
        Position ps = new Position();
        System.out.println(ps.Pose(s));

        niChestotniiSlovar chs = new niChestotniiSlovar();
        String p = "src\\CollectionOfTasks\\text.txt";
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        chs.Slovar(p, hashMap);
        chs.Slovar(p, linkedHashMap);
        chs.Slovar(p, treeMap);

        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);
    }
}
