package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2000);

        car1.info();
        System.out.println(car1.yearDifference(2010));
        System.out.println(car1.yearDifference(1995));

        Motorbike moto1 = new Motorbike(2008, "Yamaha", "Black");
        moto1.info();
        System.out.println(moto1.yearDifference(1987));
        System.out.println(moto1.yearDifference(2016));

    }
}
