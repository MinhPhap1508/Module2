package ss2.thuc_hanh;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] students ={"Christian","Micheal","Camila","Senna","Tanya","Connor","Beckham","Zoe","Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name students: ");
        String input_name = scanner.nextLine();
        boolean isExits =false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của sinh vien "+input_name+" trong list là "+i);
                isExits =true;
                break;
            }
        }
        if (!isExits){
            System.out.println("Không tìm tháy tên học sinh trong danh sach");
        }
    }
}
