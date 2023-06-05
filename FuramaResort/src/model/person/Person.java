package model.person;

import java.util.Objects;

public abstract class Person {
private String code;
private String name;
private String date;
private String gender;
private String idCard;
private String numberPhone;
private String email;

    public Person() {
    }

    public Person(String code, String name, String date, String gender, String idCard, String numberPhone, String email) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "'id='" + code + '\'' +
                ", Tên='" + name + '\'' +
                ", ngày sinh='" + date + '\'' +
                ", giới tính='" + gender + '\'' +
                ", Số CMND=" + idCard +
                ", số điện thoại=" + numberPhone +
                ", email='" + email;
    }
}
