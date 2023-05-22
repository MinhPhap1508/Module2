package bai_tap_them_mvc.model.model_person;

import bai_tap_them_mvc.model.Person;

public class Students extends Person {
    private String classes;
    private int scores;

    public Students() {
    }

    public Students(String code, String name, String date, boolean gender, String classes, int scores) {
        super(code, name, date, gender);
        this.classes = classes;
        this.scores = scores;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
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
                super.toString() +
                " Lớp='" + classes + '\'' +
                ", Điểm số=" + scores +
                '}';
    }
}
