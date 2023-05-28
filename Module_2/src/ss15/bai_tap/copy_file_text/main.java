package ss15.bai_tap.copy_file_text;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<Character> characterList = new ArrayList<>();
        characterList = copyFileText.readFile("src/ss15/bai_tap/copy_file_text/source.txt");
        copyFileText.writeFile("src/ss15/bai_tap/copy_file_text\\target.txt", characterList);
    }
}
