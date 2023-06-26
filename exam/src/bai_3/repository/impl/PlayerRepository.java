package bai_3.repository.impl;

import bai_3.common.ReadAndWrite;
import bai_3.model.Player;
import bai_3.repository.IPlayerRepository;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements IPlayerRepository {
    private static final String PATH_PLAYER = "src/bai_3/data/cau_thu.csv";
    private static List<Player> playerList = new ArrayList<>();

    @Override
    public List<Player> getAll() {
        List<String> stringList = ReadAndWrite.readFile(PATH_PLAYER);
        playerList.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            playerList.add(new Player(info[0], info[1], info[2], info[3], info[4]));
        }
        return playerList;
    }

    @Override
    public void addPlayer(Player player) {
        List<String> stringList = new ArrayList<>();
        stringList.add(player.getId() + "," + player.getName() + "," + player.getDate() + "," + player.getAddress() + "," + player.getTeam());
        ReadAndWrite.writeFile(stringList, PATH_PLAYER, true);
    }

    @Override
    public Player getById(String id) {
        playerList = getAll();
        for (Player str : playerList) {
            if (str.getId().equals(id)) {
                return str;
            }
        }
        return null;
    }

    @Override
    public void shootPenalty(Player player) {
        playerList = getAll();
        int random;
        for (Player str:playerList) {

        }
    }
}
