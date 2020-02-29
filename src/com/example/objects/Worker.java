package com.example.objects;

public class Worker {
    String name;
    String surname;

    Worker(String name, String surname){
        this.name = name;
        this.surname = surname;
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
