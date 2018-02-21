package com.epam.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context2 =
                new ClassPathXmlApplicationContext("beans.xml");

        Human citizen = context.getBean("citizen", Citizen.class);
        citizen.speak();

        Human superman = context.getBean("superman", SuperMan.class);
        superman.speak();

        Developer javaDev = context.getBean("javadev", Developer.class);
        System.out.println(javaDev.toString());

        Developer javaDev1 = context.getBean("javadev1", Developer.class);
        System.out.println(javaDev1.toString());

        Project project = context.getBean("project", Project.class);
        System.out.println(project.toString());

        Project project2 = context.getBean("project", Project.class);
        System.out.println(project2.toString());

        project2.name = "kek";
        System.out.println(project2.toString());
        System.out.println(project == project2);


    }
}
