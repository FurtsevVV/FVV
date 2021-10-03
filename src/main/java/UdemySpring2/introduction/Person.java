package UdemySpring2.introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;


    public Person() {
        this.pet = pet;
    }

    //
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void callYourPet() {
        System.out.println("Suda idi");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.printf("Set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
