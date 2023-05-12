package ss5.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Beckham");
        student.setClasses("C03");
        Student student1 = new Student();
        student1.setName("David");
        student1.setClasses("C01");
        System.out.println(student.toString());
        System.out.println(student1);
    }
}
