package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Sukhoi", 2000, 5, 20000);
        Airplane air2 = new Airplane("MIG", 2016, 5, 12000);
        Airplane.compareAirplanes(air1, air2);
    }
}