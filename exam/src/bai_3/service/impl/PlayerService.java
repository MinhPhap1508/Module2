package bai_3.service.impl;

import bai_3.exception.NotFoundException;
import bai_3.model.Player;
import bai_3.repository.IPlayerRepository;
import bai_3.repository.impl.PlayerRepository;
import bai_3.service.IPlayerService;

import java.util.List;
import java.util.Scanner;

public class PlayerService implements IPlayerService {
    private static final Scanner scanner = new Scanner(System.in);
    private static IPlayerRepository playerRepository = new PlayerRepository();

    @Override
    public void displayAll() {
        List<Player> playerList = playerRepository.getAll();
        for (Player str : playerList) {
            System.out.println(str);
        }
    }

    @Override
    public void addPlayer() {
        System.out.println("Nhập mã cầu thủ");
        String id = scanner.nextLine();
        System.out.println("Nhập họ và tên của cầu thủ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của cầu thủ");
        String date = scanner.nextLine();
        System.out.println("Nhập địa chỉ của cầu thủ");
        String address = scanner.nextLine();
        System.out.println("Nhập đội tuyển của cầu thủ");
        String team = scanner.next();
        Player player = new Player(id, name, date, address, team);
        playerRepository.addPlayer(player);
        System.out.println("Thêm mới cầu thủ thành công");
    }

    @Override
    public void shootPenalty() {
        System.out.println("Nhập mã cầu thủ để sút penalty");
        String id = scanner.nextLine();
        Player player = playerRepository.getById(id);
        if (player == null) {
//            throw NotFoundException;
            System.out.println("id không tồn tại");
        } else {
            System.out.println("Nhập góc sút từ 1 đến 6");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice < 6) {
                        break;
                    }else {
                        System.out.println("vui lòng nhập lại góc từ 1 đến 6");
                    }
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            }
        }
    }
}
