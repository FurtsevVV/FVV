package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/JavaMarathon2021/JavaMarathon2021/people.txt");

        if (parseFileToStringList(file) == null)
            throw new Exception();
        System.out.println(parseFileToStringList(file));


    }

    public static List<String> parseFileToStringList(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        List<String> stringList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String ls = scanner.nextLine();
            stringList.add(ls);


            String[] str = ls.split(" ");


            if ((Integer.parseInt(str[1])) < 0) {
                System.out.println("Некорректный входной файл");
                return null;
            }
        }
        return stringList;
    }
}
