package bai_tap_them_mvc.repository.impl;

import bai_tap_them_mvc.controller.ReadAndWrite;
import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Students;
import bai_tap_them_mvc.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository implements IRepository {
    private static List<Person> students = new ArrayList<>();
   
    static {
        students.add(new Students("C01", "Tran Minh Phap", "20/12/1012", true, "C0323G1", 10));
        students.add(new Students("C02", "Lâm", "26/04/2001", false, "C0323G1", 100));
    }


    @Override
    public List<Person> getAll() {
        students = ReadAndWrite.readToFileStudent("src/bai_tap_them_mvc/controller/student.csv");
        return students;
    }

    @Override
    public void addPerson(Person person) {
        students=ReadAndWrite.readToFileStudent("src/bai_tap_them_mvc/controller/student.csv");
        students.add(person);
        ReadAndWrite.writeToFileStudent(students,"src/bai_tap_them_mvc/controller/student.csv");
    }

    @Override
    public Person getByCode(String code) {
        students = ReadAndWrite.readToFileStudent("src/bai_tap_them_mvc/controller/student.csv");
        for (Person person : students) {
            if (person.getCode().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        students = ReadAndWrite.readToFileStudent("src/bai_tap_them_mvc/controller/student.csv");
        students.remove(person);
        ReadAndWrite.writeToFileStudent(students,"src/bai_tap_them_mvc/controller/student.csv");
    }
}
