package second.service;

import second.model.Student;
import second.repository.IRepositoryStudent;
import second.repository.RepositoryStudent;

import java.util.List;
import java.util.Scanner;

public class ServiceStudent implements IServiceStudent {
    private static final Scanner scanner = new Scanner(System.in);
    private static IRepositoryStudent repositoryStudent = new RepositoryStudent();

    @Override
    public void displayStudent() {
        List<Student> studentList = repositoryStudent.getAll();
        for (Student str : studentList) {
            System.out.println(str);
        }
    }

    @Override
    public void addStudent() {
        System.out.println("Nhap id");
        String id = scanner.nextLine();
        System.out.println("ten");
        String name = scanner.nextLine();
        System.out.println("gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("date");
        String date = scanner.nextLine();
        System.out.println("lop");
        int classes = Integer.parseInt(scanner.nextLine());
        Student student=new Student(id,name,gender,date,classes);
        repositoryStudent.addStudent(student);
        System.out.println("ok");
    }

    @Override
    public void deleteStudent() {
        System.out.println("nhạp id cần xóa");
        String id=scanner.nextLine();
        Student student = repositoryStudent.getById(id);
        if(student==null){
            System.out.println("ko ton tai");
        }else {
            System.out.println("yes or no");
            System.out.println("1. yes");
            System.out.println("2. no");
            int choice=Integer.parseInt(scanner.nextLine());
            if(choice==1){
                repositoryStudent.deleteStudent(student);
                System.out.println("xóa ok");
            }
        }
    }

    @Override
    public void searchStudent() {
        System.out.println("nhap ten tim");
        String name=scanner.nextLine();
        repositoryStudent.searchStudent(name);
    }
}
