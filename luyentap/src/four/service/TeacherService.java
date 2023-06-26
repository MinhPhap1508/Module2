package four.service;

import four.model.Teacher;
import four.repository.ITeacherRepo;
import four.repository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final Scanner scanner = new Scanner(System.in);
    private static ITeacherRepo teacherRepo = new TeacherRepository();

    @Override
    public void displayAll() {
        List<Teacher> teacherList = teacherRepo.getAll();
        for (Teacher str : teacherList) {
            System.out.println(str);
        }
    }

    @Override
    public void addTeacher() {
        System.out.println("id");
        String id = scanner.nextLine();
        System.out.println("ten");
        String name = scanner.nextLine();
        System.out.println("Nhập tuỏi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("level");
        String level = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, age, level);
        teacherRepo.addTeacher(teacher);
        System.out.println("ok");
    }

    @Override
    public void deleteTeacher() {
        System.out.println("nập id");
        String id = scanner.nextLine();
        Teacher teacher = teacherRepo.getById(id);
        if(teacher==null){
            System.out.println("id ko có");
        }else {
            System.out.println("có hay ko\n" +
                    "1.cosos\n" +
                    "2. ko");
            teacherRepo.deleteTeacher(teacher);
            System.out.println("ok");
        }
    }

    @Override
    public void searchTeacher() {
        System.out.println("Nhập tên");
        String name=scanner.nextLine();
        teacherRepo.searchTeacher(name);
    }
}
