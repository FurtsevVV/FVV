package UdemySpring2.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("person", Person.class);
person.callYourPet();
        System.out.println();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
