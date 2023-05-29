package ss16.bai_tap.copyfile_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile implements Serializable{
    public static List<Integer> readFile(String path){
        List<Integer> integerList=new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int length;
            byte[]buffer= new byte[1024];
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            integerList= (List<Integer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Error");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy class");
        }
return integerList;
    }
    public static void writeFile(List<Integer>integerList,String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(integerList);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
