package bai_tap_them_mvc.model;

import java.util.Objects;

public class Person {
    private String code;
    private String name;
    private String date;
    private boolean gender;


    public Person() {

    }

    public Person(String code, String name, String date, boolean gender) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return code.equals(person.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Id='" + code + '\'' +
                        ", Tên='" + name + '\'' +
                        ", ngày sinh='" + date + '\'' +
                        ", giới tính=" + gender;
    }

    public String getInfoToCSV() {
        return this.code + "," + this.name + "," + this.date + "," +(this.gender?"Nam":"Nữ");
    }
}


