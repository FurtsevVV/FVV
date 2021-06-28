package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file) throws Exception {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        List<Person> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String ls = scanner.nextLine();
            String[] str = ls.split(" ");
            int age = Integer.parseInt(str[1]);
            if (age < 0) {
                System.out.println("Некорректный входной файл");
                throw new Exception();
            }
            Person person = new Person(str[0], age);

            list.add(person);
        }
        return list;
    }
}
