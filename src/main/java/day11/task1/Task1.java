package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        Picker p1 = new Picker(0, false, wh);
        Courier c1 = new Courier(0, false, wh);
        businessProcess(p1);
        businessProcess(c1);
        System.out.println(wh.toString());
        System.out.println("Зарплата сборщика: " + p1.getSalary() + ", \nЗарплата курьера: " + c1.getSalary());

        Warehouse wh1 = new Warehouse();
        Picker p1wh1 = new Picker(0, false, wh1);
        Courier c1wh1 = new Courier(0, false, wh1);
        p1wh1.doWork();
        c1wh1.doWork();
        System.out.println(wh1.toString());
        System.out.println("Зарплата сборщика склада wh1: " + p1wh1.getSalary() + ", \nЗарплата курьера склада wh1: " + c1wh1.getSalary());


    }


    static void businessProcess(Worker worker) {

        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();

    }
}
