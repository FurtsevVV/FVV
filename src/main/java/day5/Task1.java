package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
car1.setColor("Нежно-баклажановый");
car1.setModel("Mercedes");
car1.setYearOfProduction(2000);
        System.out.println("Автомобиль цвета " + car1.getColor() + " марки " + car1.getModel() + ", " + car1.getYearOfProduction() + " года выпуска");
    }
}
class Car {
    private int yearOfProduction;
    private String model;
    private String color;

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}