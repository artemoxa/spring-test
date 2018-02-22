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

        Manager manager2 = context.getBean("manager2", Manager.class);
        System.out.println(manager2.toString());

        Singleton singleton = context.getBean("singleton", Manager.class);
        System.out.println(singleton.toString());

    }
}
