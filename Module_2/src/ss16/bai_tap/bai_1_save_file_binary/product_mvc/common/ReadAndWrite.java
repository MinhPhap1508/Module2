package ss16.bai_tap.bai_1_save_file_binary.product_mvc.common;

import ss16.bai_tap.bai_1_save_file_binary.product_mvc.model.Product;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    public static void writeProduct(List<Product> productList, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readProduct(String path) {
        List<Product> productList = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File không tìm thấy");
        } catch (IOException e) {
            System.out.println("not ok");
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        }
        return productList;
    }
}
