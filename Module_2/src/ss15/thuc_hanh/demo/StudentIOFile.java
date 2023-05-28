package ss15.thuc_hanh.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOFile {
    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();
        Students students1 = new Students(1, "AA", 99);
        Students students2 = new Students(2, "BB", 98);
        Students students3 = new Students(3, "CC", 75);
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(students3);
        writeStudentsList(studentsList, "src/ss15/thuc_hanh/demo/student.csv");
        List<Students> studentsListFromFile= readStudentsList("src/ss15/thuc_hanh/demo/student.csv");
        for (Students s:studentsListFromFile) {
            System.out.println(s);
        }

    }

    static void writeStudentsList(List<Students> students, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Students s : students) {
                bufferedWriter.write(s.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static List<Students> readStudentsList(String path) {
        List<Students> studentsList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] studentsArr = line.split(",");
//                public Students(int id, String name, int scores)
                Students students = new Students(Integer.parseInt(studentsArr[0]), studentsArr[1], Integer.parseInt(studentsArr[2]));
                studentsList.add(students);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentsList;
    }
}
