package SimesterThirdFinale;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryText {
    public List<String> search(String letters) throws Exception{
        File dictionary = new File("src\\SimesterThirdFinale\\dictionary.txt");
        Scanner reader = new Scanner(dictionary,"utf8");
        String line = "";
        List<String> translation = new ArrayList<>();
        do {
            try {
                line = reader.nextLine();
                if (line.matches("[а-я]*"+letters.toUpperCase()+"[а-я]*")) {
                    translation.add(line.replaceAll("[а-я]*"+letters.toUpperCase()+"[а-я]*",""));
                }
            }
            catch (Exception ex) {
                System.out.println("Проблема при чтении файла!");
                break;
            }
        } while (reader.hasNextLine());

        reader.close();
        return translation;
    }
}
