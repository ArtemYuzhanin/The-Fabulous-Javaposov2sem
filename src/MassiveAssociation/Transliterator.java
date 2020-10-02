package MassiveAssociation;

import java.util.HashMap;
import java.util.Map;

public class Transliterator {

    public static String Trans(String s) {
        String b = "";
        Map<Character, String> tr = new HashMap<>();
        tr.put('а',"a");
        tr.put('б',"b");
        tr.put('в',"v");
        tr.put('г',"g");
        tr.put('д',"d");
        tr.put('е',"e");
        tr.put('ё',"yo");
        tr.put('ж',"zh");
        tr.put('з',"z");
        tr.put('и',"i");
        tr.put('й',"i");
        tr.put('к',"k");
        tr.put('л',"l");
        tr.put('м',"m");
        tr.put('н',"n");
        tr.put('о',"o");
        tr.put('п',"p");
        tr.put('р',"r");
        tr.put('с',"s");
        tr.put('т',"t");
        tr.put('у',"u");
        tr.put('ф',"f");
        tr.put('х',"h");
        tr.put('ц',"c");
        tr.put('ч',"ch");
        tr.put('ш',"sh");
        tr.put('щ',"shch");
        tr.put('ъ',"i");
        tr.put('ы',"i");
        tr.put('ь',"");
        tr.put('э',"e");
        tr.put('ю',"iu");
        tr.put('я',"ia");
        for (int i = 0; i < s.length(); i++) b = b + tr.get(s.charAt(i));

        return b;
    }


}
