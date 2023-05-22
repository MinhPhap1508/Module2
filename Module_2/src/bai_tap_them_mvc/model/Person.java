package bai_tap_them_mvc.model;

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
}


