package ShuvalovSpring5Hibernate;

import ShuvalovSpring5Hibernate.DAO.Course;
import ShuvalovSpring5Hibernate.DAO.CourseDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CourseDAO courseDAO = context.getBean(CourseDAO.class);
for (Course c: courseDAO.findAll()){
    System.out.println(c);
}




        context.close();
    }
}
