package bai_tap_them_mvc.repository;

import bai_tap_them_mvc.model.Person;

import java.util.List;

public interface IRepository {
    List<Person> getAll();

    void addPerson(Person person);

    Person getByCode(String code);

    void removePerson(Person person);

}
