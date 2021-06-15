package day6;


import java.util.Map;

public class Motorbike {
    private int yearOfProduction;
    private String model;
    private String color;

    public Motorbike(int yearOfProduction, String model, String color){
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

    public void info () {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if (inputYear > yearOfProduction)
        return (inputYear - yearOfProduction);
        else
            System.out.println("Год выпуска мотоцикла " + yearOfProduction + ", год для сравнения " + inputYear);
        return Math.abs(inputYear - yearOfProduction);
    }
}