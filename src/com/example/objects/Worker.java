package com.example.objects;

public class Worker {
    String name;
    String surname;

    Integer age;
    Integer weight;

    Worker(String name, String surname, Integer age, Integer weight){
        this.name = name;
        this.surname = surname;

        this.age = age;
        this.weight = weight;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


}
