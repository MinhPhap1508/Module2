package ss5.bai_tap.student;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {

    }

     void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
