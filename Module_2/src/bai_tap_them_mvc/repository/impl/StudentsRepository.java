package bai_tap_them_mvc.repository.impl;

import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Students;
import bai_tap_them_mvc.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository implements IRepository {
    private static List<Person> students = new ArrayList<>();

    static {
        students.add(new Students("C01", "Tran Minh Phap", "20/12/1012", true, "C0323G1", 10));
        students.add(new Students("C02", "Tran", "26/04/2001", false, "C0323G1", 100));
    }


    @Override
    public List<Person> getAll() {
        return students;
    }

    @Override
    public void addPerson(Person person) {
        students.add(person);
    }

    @Override
    public Person getByCode(String code) {
        for (Person person : students) {
            if (person.getCode().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        students.remove(person);
    }
}
