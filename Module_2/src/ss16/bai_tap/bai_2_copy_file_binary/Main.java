package ss16.bai_tap.bai_2_copy_file_binary;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file source");
        String source = scanner.nextLine();
        System.out.println("Nhập file target");
        String target = scanner.next();
        File file = new File(target);

        byte[] arr = readFile(source);
        writeFile(target, arr);
        System.out.println("Copy thành công");
        System.out.println("Số byte trong tệp là: " + file.length());
    }

    public static void writeFile(String path, byte[] arr) {
        File file = new File("src/ss16/bai_tap/bai_2_copy_file_binary/source.txt");
        try {
            OutputStream outputStream = new FileOutputStream(path);
            for (int i = 0; i < file.length(); i++) {
                byte b = arr[i];
                outputStream.write(b);
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static byte[] readFile(String path) {
        try {
            InputStream inputStream = new FileInputStream(path);
            byte[] arr = new byte[1024];
            inputStream.read(arr);
            inputStream.close();
            return arr;
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Error");
        }
        return null;
    }
}
