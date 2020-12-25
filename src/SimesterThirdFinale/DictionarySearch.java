package SimesterThirdFinale;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionarySearch {
    public String search(String word) throws Exception{
        File dictionary = new File("src\\SimesterThirdFinale\\dictionary.txt");
        Scanner reader = new Scanner(dictionary,"utf8");
        String line = "";
        String translation = "";
        while (translation.equals("")) {
            try {
                line = reader.nextLine();
                if (line.matches(word.toUpperCase()+"\\s.+")) {
                    translation = line.replaceAll(word.toUpperCase()+"\\s","");
                }
            }
            catch (Exception ex) {
                System.out.println("Проблема при чтении файла!");
                break;
            }
        }
        reader.close();
        return translation;
    }

    public void filler(File f) throws Exception{
        Scanner scan = new Scanner(f,"utf8");
        File output = new File("src\\SimesterThirdFinale\\output.txt");
        PrintStream ps = new PrintStream(output, "utf8");
        List<DictionaryEntry> entry = new ArrayList<>();
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            entry.add(new DictionaryEntry(input,search(input)));
        }
        scan.close();
        for (DictionaryEntry diction : entry) {
            ps.println("запрос: "+diction.getWord());
            ps.println("найдено: "+diction.getTranslation());
        }
        ps.close();
    }
}
