package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("VAZ");
        auto.add("GAZ");
        auto.add("Aurus");
        auto.add("ZIL");
        auto.add("KAMAZ");
        System.out.println(auto);
        auto.add(2, "Tesla");
        auto.remove(0);
        System.out.println(auto);
    }
}
