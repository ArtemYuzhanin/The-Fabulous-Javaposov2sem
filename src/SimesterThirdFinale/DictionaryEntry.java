package SimesterThirdFinale;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DictionaryEntry {
    private String word;
    private String translation;
    public DictionaryEntry(String word,String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return  translation;
    }


}
