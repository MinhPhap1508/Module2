package bai_tap_them_mvc.model.model_person;

import bai_tap_them_mvc.model.Person;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(String code, String name, String date, boolean gender, String specialize) {
        super(code, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                " Chuyên môn='" + specialize + '\'' +
                '}';
    }
}
