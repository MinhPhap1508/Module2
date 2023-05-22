package bai_tap_them_mvc.service.impl;

import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Teacher;
import bai_tap_them_mvc.repository.IRepository;
import bai_tap_them_mvc.repository.impl.TeacherRepository;
import bai_tap_them_mvc.service.ImanageService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ImanageService {
    private static IRepository teacherRepository = new TeacherRepository();
    Scanner scanner = new Scanner(System.in);
    boolean check = true;

    @Override
    public void getAll() {
        List<Person> teacherList = teacherRepository.getAll();
        for (Person list : teacherList) {
            System.out.println(list);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("Nhập mã Giảng viên");
        String code = scanner.nextLine();
        System.out.println("Nhap tên Giảng viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính");
        System.out.println("1.Nam");
        System.out.println("2. Nữ");
        int gender = Integer.parseInt(scanner.nextLine());
        if (gender == 2) {
            check = false;
        }
        System.out.println("Nhập chuyên môn");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(code, name, date, check, specialize);
        teacherRepository.addPerson(teacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removePerson() {
        System.out.println("Nhập mã giảng viên bạn muốn xóa");
        String code = scanner.nextLine();
        Person person = teacherRepository.getByCode(code);
        if (person == null) {
            System.out.println("Mã giảng viên không tồn tại");
        } else {
            System.out.println("Bạn có chắc muốn xóa giảng viên này không");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                teacherRepository.removePerson(person);
                System.out.println("Xóa thành công");
            }
        }
    }
}
