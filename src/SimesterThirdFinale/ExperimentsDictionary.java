package SimesterThirdFinale;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ExperimentsDictionary {
    public static void main(String[] args) throws Exception{
        File f = new File("src\\SimesterThirdFinale\\strict-queries.txt");
        DictionarySearch search = new DictionarySearch();
        search.filler(f);
    }
}
