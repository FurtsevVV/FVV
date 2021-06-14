package day5;


public class Task2 {
    public static void main(String[] args) {
Motorbike bike1 = new Motorbike(2000, "Honda Shadow Classic", "Silver");
        System.out.println("Model: " + bike1.getModel());
        System.out.println("Color: " + bike1.getColor());
        System.out.println("Year of Production: " + bike1.getYearOfProduction());
    }
}
class Motorbike {
    private int yearOfProduction;
    private String model;
    private String color;

    public Motorbike (int yearOfProduction, String model, String color){
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}