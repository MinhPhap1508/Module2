package bai_tap_them_mvc.controller;

import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteTeacher {
    public static void writeToFileTeacher(List<Person> personList, String path){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < personList.size(); i++) {
                bufferedWriter.write(personList.get(i).toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Person> readToFileTeacher(String path){
        List<Person> personList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line=null;
            while ((line = bufferedReader.readLine())!=null){
                String[] teacherArr =line.split(",");
//               public Teacher(String code, String name, String date, boolean gender, String specialize)
                Person person = new Teacher(teacherArr[0],teacherArr[1],teacherArr[2],Boolean.parseBoolean(teacherArr[3]),teacherArr[4]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }
}
