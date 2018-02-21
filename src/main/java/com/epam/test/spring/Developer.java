package com.epam.test.spring;

public class Developer {

    String name;
    String skill;
    String workPlace;
    boolean likeCoffee;

    public Developer() {
    }

    public Developer(String name, String skill, String workPlace, boolean likeCoffee) {
        this.name = name;
        this.skill = skill;
        this.workPlace = workPlace;
        this.likeCoffee = likeCoffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public boolean isLikeCoffee() {
        return likeCoffee;
    }

    public void setLikeCoffee(boolean likeCoffee) {
        this.likeCoffee = likeCoffee;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", likeCoffee=" + likeCoffee +
                '}';
    }
}
