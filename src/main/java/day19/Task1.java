package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("C:/JavaMarathon2021/JavaMarathon2021/src/main/resources/dushi.txt");
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(text).useDelimiter("[.,:;()?!\"\\s–]+"); // в text находится файл dushi.txt

        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        scanner.close();

        for (String string : list) {
            if (map.keySet().contains(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map.get("Чичиков")); // Чичиков - 601
        List<Integer> listWords = new ArrayList<>(map.values());
        Collections.sort(listWords, Collections.reverseOrder());

        for (Map.Entry entry : map.entrySet()) {
            for (int i = 0; i < 100; i++) {
                if (entry.getValue() == listWords.get(i)) {

                    System.out.println(entry);

                }


            }
        }
    }
}