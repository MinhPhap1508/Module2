package bai_3.controller;

import bai_3.service.IPlayerService;
import bai_3.service.impl.PlayerService;

import java.util.Scanner;

public class PlayerController {
    private static final Scanner scanner = new Scanner(System.in);
    private static IPlayerService playerService = new PlayerService();
    public static void menu(){
        do {
            System.out.println("-------------------\n" +
                    "1. Hiển thị danh sách cầu thủ\n" +
                    "2. Thêm mới cầu thủ\n" +
                    "3. Thực hiện chức năng sút penalty\n" +
                    "0. Thoát\n" +
                    "Mời chọn chức năng: ");
            int choice;
            while (true){
                try {
                    choice=Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Vui lòng nhập số");
                }
            }
            switch (choice){
                case 1:
                    playerService.displayAll();
                    break;
                case 2:
                    playerService.addPlayer();
                    break;
                case 3:
                    playerService.shootPenalty();
                    break;
                case 0:
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn 1 trong những chức năng hiện có");
            }
        }while (true);
    }
}
