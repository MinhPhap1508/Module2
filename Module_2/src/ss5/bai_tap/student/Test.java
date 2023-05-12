package ss5.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Beckham");
        student.setClasses("C03");
        Student student1 = new Student();
        student1.setName("David");
        student1.setClasses("C01");
        Student student2 = new Student();
        Student student3 = new Student();
        student3.setName("William");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
