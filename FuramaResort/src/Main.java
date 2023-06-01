import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long age;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập ngày sinh");
            int days=Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tháng");
            int month=Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập năm");
            int year=Integer.parseInt(scanner.nextLine());
            LocalDate now=LocalDate.now();
            LocalDate birthday=LocalDate.of(year,month,days);
             age= ChronoUnit.YEARS.between(birthday,now);
            System.out.println(age);
        }while (age<18);
    }
}