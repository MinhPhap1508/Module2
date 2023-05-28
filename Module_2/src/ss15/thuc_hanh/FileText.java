package ss15.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class FileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập path");
        String file=scanner.nextLine();
        FileText fileText = new FileText();
    }
    public static void readFileText(String path) {
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                System.out.println("file ko ton tai");
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) ;
            {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
