package model.Person;

public abstract class Person {
private String code;
private String name;
private String date;
private String gender;
private int idCard;
private int numberPhone;
private String email;

    public Person() {
    }

    public Person(String code, String name, String date, String gender, int idCard, int numberPhone, String email) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
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

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
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
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard=" + idCard +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
