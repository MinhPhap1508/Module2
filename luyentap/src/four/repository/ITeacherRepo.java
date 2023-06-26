package four.repository;

import four.model.Teacher;

import java.util.List;

public interface ITeacherRepo {
    List<Teacher> getAll();
    void addTeacher (Teacher teacher);
    void deleteTeacher(Teacher teacher);
    void searchTeacher(String name);
    Teacher getById(String id);
}
