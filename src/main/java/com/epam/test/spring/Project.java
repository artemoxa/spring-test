package com.epam.test.spring;

public class Project {

    String name;

    Manager manager;

    public Project(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }
}
