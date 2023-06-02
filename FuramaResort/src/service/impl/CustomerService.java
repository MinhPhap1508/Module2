package service.impl;

import controller.CustomerManagement;
import model.Person.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;
import utils.Regex;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayAll() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
//        (String code, String name, String date, String gender, String idCard, String numberPhone, String email, String customerSegment, String address)
        String code;
        do {
            System.out.println("Nhập id khách hàng");
            code = scanner.nextLine();
        } while (!Regex.checkCustomer(code));
        String name;
        do {
            System.out.println("Nhập tên khách hàng");
            name = scanner.nextLine();
        } while (!Regex.checkName(name));
        String date = "";
        do {
            try {
                System.out.println("Nhập ngày sinh của khách hàng");
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
                    System.out.println("Khách hàng chưa đủ tuổi");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập ngày sinh theo định dạng DD-MM-YYYY");
            } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                System.out.println("Nhập ngày sinh theo định dạng DD-MM-YYYY");
            }
        } while (true);
//        (String code, String name, String date, String gender, String idCard, String numberPhone, String email, String customerSegment, String address)
        String gender;
        do {
            System.out.println("Nhập giới tính khách hàng");
            gender = scanner.nextLine();
        } while (!Regex.checkGender(gender));
        String idCard;
        do {
            System.out.println("Nhập số CMND của khách hàng");
            idCard = scanner.nextLine();
        } while (!Regex.checkIdCard(idCard));
        String numberPhone;
        do {
            System.out.println("Nhập sdt khách hàng");
            numberPhone = scanner.nextLine();
        } while (!Regex.checkNumberPhone(numberPhone));
        String email;
        do {
            System.out.println("Nhập email khách hàng");
            email = scanner.nextLine();
        } while (!Regex.checkEmail(email));
        String segments;
        do {
            System.out.println("Nhập phân khúc khách hàng");
            System.out.println("Diamond|Platinum|Gold|Silver|Member");
            segments = scanner.nextLine();
        } while (!Regex.checkSegments(segments));

        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        Customer customer = new Customer(code, name, date, gender, idCard, numberPhone, email, segments, address);
        customerRepository.addCustomer(customer);
        System.out.println("Thêm mới thành công");
        CustomerManagement.displayMenu();
    }

    @Override
    public void deleteCustomer() {
        System.out.println("Nhập mã khách hàng bạn muốn xóa");
        String id = scanner.nextLine();
        Customer customer = customerRepository.getById(id);
        if (customer == null) {
            System.out.println("Mã khách hàng không tồn tại");
        } else {
            System.out.println("Bạn có muốn xóa khách hàng " + customer.getName() + " không");
            System.out.println("1. Có chứ");
            System.out.println("2. Thôi khỏi đi");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            }
            if (choice == 1) {
                customerRepository.deleteCustomer(customer);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập mã khách hàng cần chỉnh sửa");
        String id = scanner.nextLine();
        Customer checkCustomer = customerRepository.getById(id);
        if (checkCustomer == null) {
            System.out.println("Mã khách hàng không tồn tại");
        } else {
            System.out.println("Chọn mục cần sửa");
            System.out.println("1. Sửa tên\n" +
                    "2. Sửa ngày sinh\n" +
                    "3. Sửa giới tính\n" +
                    "4. Thay đổi số CMND\n" +
                    "5. Thay đổi sdt khách hàng\n" +
                    "6. Thay đổi email khách hàng\n" +
                    "7. Thay đổi hạng thành viên khách hàng\n" +
                    "8. Thay đổi địa chỉ khách hàng");
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
//                (String code, String name, String date, String gender, String idCard, String numberPhone, String email, String customerSegment, String address)
                case 1:
                    String name;
                    do {
                        System.out.println("Nhập tên mới");
                        name = scanner.nextLine();
                    } while (!Regex.checkName(name));
                    checkCustomer.setName(name);
                    break;
                case 3:
                    String gender;
                    do {
                        System.out.println("Nhập giới tính");
                        gender = scanner.nextLine();
                    } while (!Regex.checkGender(gender));
                    checkCustomer.setGender(gender);
                    break;
                case 4:
                    String idCard;
                    do {
                        System.out.println("Nhập lại số CMND");
                        idCard = scanner.nextLine();
                    } while (!Regex.checkIdCard(idCard));
                    checkCustomer.setIdCard(idCard);
                    break;
                case 5:
                    String numberPhone;
                    do {
                        System.out.println("Nhập sdt mới của khách hàng");
                        numberPhone = scanner.nextLine();
                    } while (!Regex.checkNumberPhone(numberPhone));
                    checkCustomer.setNumberPhone(numberPhone);
                    break;
                case 6:
                    String email;
                    do {
                        System.out.println("Nhập email");
                        email = scanner.nextLine();
                    } while (!Regex.checkEmail(email));
                    checkCustomer.setEmail(email);
                    break;
                case 7:
                    String segments;
                    do {
                        System.out.println("Nhập lại hạng khách hàng");
                        segments = scanner.nextLine();
                    } while (!Regex.checkSegments(segments));
                    checkCustomer.setCustomerSegment(segments);
                    break;
                case 8:
                    String address;
                    System.out.println("Nhập địa chỉ khách hàng");
                    address = scanner.nextLine();
                    checkCustomer.setAddress(address);
                    break;

            }
            customerRepository.editCustomer();
            System.out.println("Chỉnh sửa thành công");
        }
    }

    @Override
    public void searchCustomer() {
        System.out.println("Nhập tên khách hàng cần tìm kiếm");
        String name = scanner.nextLine();
        customerRepository.searchCustomer(name);
    }
}
