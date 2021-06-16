package day6;

public class Car {
    private int yearOfProduction;
    private String model;
    private String color;

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYear(int yearOfProduction) {
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

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {

        System.out.println("Год выпуска автомобиля " + yearOfProduction + ", год для сравнения " + inputYear);
        return inputYear - yearOfProduction;


    }
}