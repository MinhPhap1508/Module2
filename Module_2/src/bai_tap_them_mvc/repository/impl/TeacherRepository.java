package bai_tap_them_mvc.repository.impl;

import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Teacher;
import bai_tap_them_mvc.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements IRepository {
    private static List<Person> teacher = new ArrayList<>();

    static {
        teacher.add(new Teacher("T01", "Nguyễn Văn A", "12/12/1998", true, "Best"));
        teacher.add(new Teacher("T02", "Trần Văn B", "01/05/1992", false, "Very Good"));
    }

    @Override
    public List<Person> getAll() {
        return teacher;
    }

    @Override
    public void addPerson(Person person) {
        teacher.add(person);
    }

    @Override
    public Person getByCode(String code) {
        for (Person person : teacher) {
            if (person.getCode().equals(code)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePerson(Person person) {
        teacher.remove(person);
    }
}
