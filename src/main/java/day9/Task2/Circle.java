package day9.Task2;

public class Circle extends Figure {
    private double rCircle;

    public Circle(double rCircle, String color) {
        super(color);
        this.rCircle = rCircle;
    }

    public double area() {
        return (rCircle * rCircle * Math.PI);
    }

    public double perimeter() {
        return (2 * Math.PI * rCircle);
    }


}
