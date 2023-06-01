package model.Person;

public class Employee extends Person{
    private String level;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(String code, String name, String date, String gender, String idCard, String numberPhone, String email, String level, String position, float salary) {
        super(code, name, date, gender, idCard, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
