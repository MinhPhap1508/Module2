package ss15.thuc_hanh.demo;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private int id;
    private String name;
    private int scores;

    public Students(int id, String name, int scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }
    public String getInfoToCSV(){
        return this.id+", "+this.name+", "+this.scores;
    }
}
