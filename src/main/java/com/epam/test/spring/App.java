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
        System.out.printf(javaDev.toString());
    }
}
