package repository;

import model.Person.Employee;
import model.Person.Person;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();

    void addEmployee(Employee employee);

    Employee getById(String id);

    void editEmployee(Employee employee);

    void removeEmployed(Employee employee);

    List<Employee> searchEmployee(String name);
}
