package day14;

import java.io.File;

public class Task3 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("C:/JavaMarathon2021/JavaMarathon2021/people.txt");

        System.out.println(Person.parseFileToObjList(file1));
    }
}
