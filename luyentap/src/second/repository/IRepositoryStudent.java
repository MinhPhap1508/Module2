package second.repository;

import second.model.Student;

import java.util.List;

public interface IRepositoryStudent {
    List<Student> getAll();
    void addStudent(Student student);
    void deleteStudent(Student student);
    void searchStudent(String name);
    Student getById(String id);

}
