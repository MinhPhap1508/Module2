package bai_tap_them_mvc.service.impl;

import bai_tap_them_mvc.model.Person;
import bai_tap_them_mvc.model.model_person.Students;
import bai_tap_them_mvc.repository.IRepository;
import bai_tap_them_mvc.repository.impl.StudentsRepository;
import bai_tap_them_mvc.service.ImanageService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements ImanageService {
    private static Scanner scanner = new Scanner(System.in);

    private static IRepository studentsRepository = new StudentsRepository();
    private boolean flag = true;

    @Override
    public void getAll() {
        List<Person> studentList = studentsRepository.getAll();
        for (Person p : studentList) {
            System.out.println(p);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("Nhập mã sinh viên");
        String code = scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính");
        System.out.println("1.Nam");
        System.out.println("2. Nữ");
        int gender = Integer.parseInt(scanner.nextLine());
        if (gender == 2) {
            flag = false;
        }
        System.out.println("Nhập lớp");
        String classes = scanner.nextLine();
        int scores = 0;
        while (true) {
            try {
                System.out.println("Nhập điểm");
                scores = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Vui lòng nhập lại");
            }
        }
        Students students = new Students(code, name, date, flag, classes, scores);
        studentsRepository.addPerson(students);
        System.out.println("Thêm mới thành công");
    }


    @Override
    public void removePerson() {
        System.out.println("Nhập mã sinh viên bạn muốn xóa");
        String code = scanner.nextLine();
        Person person = studentsRepository.getByCode(code);
        if (person == null) {
            System.out.println("Mã sinh viên này không tồn tại");
        } else {
            System.out.println("Bạn có chắc muốn xóa sinh viên này không");
            System.out.println("1. Yes");
            System.out.println("2. No");
            while (true){
                try {
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1) {
                        studentsRepository.removePerson(person);
                        System.out.println("Xóa thành công");
                        break;
                }else if (choice==2) {
                        break;
                    }else {
                        throw new CheckEx("Vui lòng chọn 1 hoặc 2");
                    }
            }catch (NumberFormatException | CheckEx numberFormatException){
                    System.out.println("Vui lòng nhập số");
                }

            }
        }
    }
}