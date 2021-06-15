package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher (String name, String discipline){
        this.name = name;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void evaluate (Student s) {
        int value = (int) (((Math.random() * 4) + 1) + 1);
String valueStr;
switch (value){
    case 2: valueStr = "Неудовлетворительно";
    break;
    case 3: valueStr = "Удовлетворительно";
    break;
    case 4: valueStr = "Хорошо";
    break;
    case 5: valueStr = "Отлично";
    break;
    default:
        throw new IllegalStateException("Unexpected value: " + value);
}

        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + s.getName() + " по предмету " + discipline + " на оценку " + valueStr);
    }
    }


