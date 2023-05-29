package bai_tap_them_mvc.controller;

import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeToFileStudent(List<Person> personList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < personList.size(); i++) {
                bufferedWriter.write(personList.get(i).getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Person> readToFileStudent(String path) {
        List<Person> personList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] personArr = line.split(",");
//                public Students(String code, String name, String date, boolean gender, String classes, int scores)
                Person person = new Students(personArr[0], personArr[1], personArr[2], Boolean.parseBoolean(personArr[3]), personArr[4], Integer.parseInt(personArr[5]));
                personList.add(person);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }
}
