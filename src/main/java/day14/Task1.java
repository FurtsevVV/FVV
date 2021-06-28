package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("C:/JavaMarathon2021/JavaMarathon2021/TextFile.txt");
        try {
            printSumDigits(file1);
        } catch (Exception e) {
            throw new Exception("Файл не найден");
        }


    }

    public static void printSumDigits(File file) throws Exception {
        int summa = 0;
        Scanner scanner = new Scanner(file);
        List<Integer> list = new ArrayList<>();


        while (scanner.hasNextLine()) {
            list.add(scanner.nextInt());
        }
        if (list.size() != 10) throw new Exception("Некорректный входной файл");
        for (int i = 0; i < list.size(); i++) {
            summa += list.get(i);
        }
        System.out.println(summa);

    }

}
