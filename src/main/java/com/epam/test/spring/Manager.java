package com.epam.test.spring;

import java.util.List;

public class Manager {

    String name;

    List<String> emailAdresses;

    public List<String> getEmailAdresses() {
        return emailAdresses;
    }

    public void setEmailAdresses(List<String> emailAdresses) {
        this.emailAdresses = emailAdresses;
    }

    public Manager(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", emailAdresses=" + emailAdresses +
                '}';
    }
}
