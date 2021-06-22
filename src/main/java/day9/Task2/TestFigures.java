package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimetr = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sumPerimetr += figures[i].perimeter();
            }
        }
        return sumPerimetr;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sumArea += figures[i].area();
            }
        }
        return sumArea;
    }


}
