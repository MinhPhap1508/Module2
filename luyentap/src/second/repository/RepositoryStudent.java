package second.repository;

import second.common.ReadAndWrite;
import second.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositoryStudent implements IRepositoryStudent {
    private static final String PATH_STUDENT = "src/second/data/student.csv";
    private static List<Student> studentList = new ArrayList<>();

    @Override
    public List<Student> getAll() {
        List<String> stringList = ReadAndWrite.readFile(PATH_STUDENT);
        studentList.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            studentList.add(new Student(info[0], info[1], info[2], info[3], Integer.parseInt(info[4])));
        }
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getId() + "," + student.getName() + "," + student.getGender() + "," + student.getDate() + "," + student.getClasses());
        ReadAndWrite.writeFile(stringList, PATH_STUDENT, true);
    }

    @Override
    public void deleteStudent(Student student) {
        studentList = getAll();
        studentList.remove(student);
        List<String> stringList = new ArrayList<>();
        for (Student temp : studentList) {
            stringList.add(temp.getId() + "," + temp.getName() + "," + temp.getGender() + "," + temp.getDate() + "," + temp.getClasses());
        }
        ReadAndWrite.writeFile(stringList, PATH_STUDENT, false);
    }

    @Override
    public void searchStudent(String name) {
        studentList = getAll();
        for (Student str : studentList) {
            if (str.getName().contains(name)) {
                System.out.println(str);
            }
        }
    }

    @Override
    public Student getById(String id) {
        studentList = getAll();
        for (Student str : studentList) {
            if (str.getId().equals(id)) {
                return str;
            }
        }
        return null;
    }
}
