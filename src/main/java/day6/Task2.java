package day6;

public class Task2 {
    public static void main(String[] args) {
Airplane ap1 = new Airplane("Boeing", 2005, 35, 20000);
ap1.setYear(2010);
ap1.setLength(37);
ap1.fillUp(350);
ap1.fillUp(200);
        ap1.info();
    }
}
