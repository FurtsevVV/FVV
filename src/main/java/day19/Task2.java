package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/JavaMarathon2021/JavaMarathon2021/src/main/resources/numbers19.txt");
        Scanner scanner = new Scanner(file);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arraylist = new ArrayList<>();
        int counter = 0;
        long start = System.currentTimeMillis();
        while (scanner.hasNextLine()) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x > 500000000 && x <= 600000000) {
                map.put(counter, x);
                counter++;
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms");
        System.out.println(map.size());

//        long start1 = System.currentTimeMillis();
//        while (scanner.hasNextLine()){
//            int x = Integer.parseInt(scanner.nextLine());
//            if (x > 500000000 && x<= 600000000) {
//                arraylist.add(x);
//            }
//        }
//        long finish2 = System.currentTimeMillis();
//        System.out.println(finish2 - start1 + " ms");
//        System.out.println(arraylist.size());
    }
}

