package bai_3.repository;

import bai_3.model.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> getAll();

    void addPlayer(Player player);

    Player getById(String id);

    void shootPenalty(Player player);
}
