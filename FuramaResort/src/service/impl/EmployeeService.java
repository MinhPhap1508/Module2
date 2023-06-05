package service.impl;

import controller.EmployeesManagement;
import model.person.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;
import utils.Regex;


import java.time.LocalDate;
import java.time.Period;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayAll() {
        List<Employee> employees = employeeRepository.getAll();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
//         public Employee(String code, String name, String date, String gender, int idCard, int numberPhone, String email, String level, String position, float salary)
        String code;
        do {
            System.out.println("Nhập mã nhân viên theo định dạng NV-YYYY");
            code = scanner.nextLine();
        } while (!Regex.checkId(code));
        String name;
        do {
            System.out.println("Nhập tên nhân viên");
            name = scanner.nextLine();
        } while (!Regex.checkName(name));

        String date = "";
        do {
            try {
                System.out.println("Nhập ngày sinh của nhân viên");
                date = scanner.nextLine();
                int day = Integer.parseInt("" + date.charAt(0) + date.charAt(1));
                int month = Integer.parseInt("" + date.charAt(3) + date.charAt(4));
                int year = Integer.parseInt("" + date.charAt(6) + date.charAt(7) + date.charAt(8) + date.charAt(9));
                LocalDate birthday = LocalDate.of(year, month, day);
                LocalDate today = LocalDate.now();
                int age = Period.between(birthday, today).getYears();
                if (Regex.checkDate(date) && age >= 18) {
                    break;
                } else {
                    System.out.println("Nhân viên chưa đủ tuổi");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập ngày sinh theo định dạng DD-MM-YYYY");
            } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                System.out.println("Nhập ngày sinh theo định dạng DD-MM-YYYY");
            }
        } while (true);

        String gender;
        do {
            System.out.println("Nhập giới tính");
            System.out.println("Nam|Nữ");
            gender = scanner.nextLine();
        } while (!Regex.checkGender(gender));

        String idCard;
        do {
            System.out.println("Nhập số CMND nhân viên (9 số hoặc 12 số)");
            idCard = scanner.nextLine();
        } while (!Regex.checkIdCard(idCard));


        String numberPhone;
        do {
            System.out.println("Nhập số điện thoại");
            numberPhone = scanner.nextLine();
        } while (!Regex.checkNumberPhone(numberPhone));
        String email;
        do {
            System.out.println("Nhập email nhân viên");
            email = scanner.nextLine();
        } while (!Regex.checkEmail(email));
        String level;
        do {
            System.out.println("Nhập trình độ nhân viên");
            System.out.println("Trung cấp|Cao đẳng|Đại học và Sau đại học");
            level = scanner.nextLine();
        } while (!Regex.checkLevel(level));
        String position;
        do {
            System.out.println("Nhập chức vụ");
            System.out.println("lễ tân|phục vụ|chuyên viên|giám sát|quản lý|giám đốc");
            position = scanner.nextLine();
        } while (!Regex.checkPosition(position));
        float salary;
        while (true) {
            try {
                System.out.println("Nhập mức lương cho nhân viên");
                salary = Integer.parseInt(scanner.nextLine());
                if (salary > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }
        Employee employee = new Employee(code, name, date, gender, idCard, numberPhone, email, level, position, salary);
        employeeRepository.addEmployee(employee);
        System.out.println("Thêm mới thành công");
        EmployeesManagement.displayMenu();
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập id nhân viên cần chỉnh sửa thông tin");
        String id = scanner.nextLine();
        Employee checkEmployee = employeeRepository.getById(id);
        if (checkEmployee == null) {
            System.out.println("Id này không tồn tại");
        } else {
            System.out.println("Chọn mục cần sửa");
//             public Employee(String code, String name, String date, String gender, int idCard, int numberPhone, String email, String level, String position, float salary)
            System.out.println("1. Sửa tên nhân viên");
            System.out.println("2. Sửa ngày sinh");
            System.out.println("3. Sửa giới tính");
            System.out.println("4. Thay đổi số CMND");
            System.out.println("5. Thay đổi sdt");
            System.out.println("6. Thay đổi Email");
            System.out.println("7. Trình độ");
            System.out.println("8. Chức vụ");
            System.out.println("9. Mức lương");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    checkEmployee.setName(name);
                    break;
                case 2:
                    System.out.println("Nhập ngày sinh");
                    String date = scanner.nextLine();
                    checkEmployee.setDate(date);
                    break;
                case 3:
                    System.out.println("Nhập giới tính");
                    String gender = scanner.nextLine();
                    checkEmployee.setGender(gender);
                    break;
                case 4:
                    String idCard;
                    do {
                        System.out.println("Nhập số CMND");
                        idCard = scanner.nextLine();
                    } while (!Regex.checkIdCard(idCard));
                    checkEmployee.setIdCard(idCard);
                    break;
                case 5:
                    String numPhone;
                    do {
                        System.out.println("Nhập sdt");
                        numPhone = scanner.nextLine();
                    } while (!Regex.checkNumberPhone(numPhone));
                    checkEmployee.setNumberPhone(numPhone);
                    break;
                case 6:
                    String email;
                    do {
                        System.out.println("Nhập email");
                        email = scanner.nextLine();
                    } while (!Regex.checkEmail(email));
                    checkEmployee.setEmail(email);
                    break;
                case 7:
                    System.out.println("Nhập trình độ");
                    String level = scanner.nextLine();
                    checkEmployee.setLevel(level);
                    break;
                case 8:
                    System.out.println("Nhập chức vụ");
                    String position = scanner.nextLine();
                    checkEmployee.setPosition(position);
                    break;
                case 9:
                    System.out.println("Nhập mức lương");
                    float salary;
                    while (true) {
                        try {
                            salary = Float.parseFloat(scanner.nextLine());
                            break;
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập đúng định dạng");
                        }
                    }
                    checkEmployee.setSalary(salary);

            }
            System.out.println("Chỉnh sửa thành công");
        }
        employeeRepository.editEmployee();

    }

    @Override
    public void removeEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn xóa");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getById(id);
        if (employee == null) {
            System.out.println("Id không tồn tại, mời nhập lại");
        } else {
            System.out.println("Bạn có thật sự muốn xóa nhân viên " + employee.getName() + " ra khỏi danh sách không");
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập đúng định dạng");
                }
            }
            if (choice == 1) {
                employeeRepository.removeEmployed(employee);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void searchEmployee() {
        System.out.println("Nhập tên nhân viên cần tìm kếm");
        String name = scanner.nextLine();
        employeeRepository.searchEmployee(name);
    }
}
