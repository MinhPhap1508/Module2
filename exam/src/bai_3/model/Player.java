package bai_3.model;

import java.util.Objects;

public class Player {
    private String id;
    private String name;
    private String date;
    private String address;
    private String team;

    public Player() {
    }

    public Player(String id, String name, String date, String address, String team) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id.equals(player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player---" +
                "mã cầu thủ='" + id + '\'' +
                ", tên cầu thủ='" + name + '\'' +
                ", ngày sinh='" + date + '\'' +
                ", địa chỉ='" + address + '\'' +
                ", đội tuyển='" + team;
    }
}
