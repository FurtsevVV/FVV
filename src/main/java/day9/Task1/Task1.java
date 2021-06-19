package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Semen", "EM-402");
        Teacher t1 = new Teacher("Sergey", "OBJ");
        System.out.println(s1.getGroupName());
        System.out.println(t1.getSubjectName());
        s1.printInfo();
        t1.printInfo();
    }
}
