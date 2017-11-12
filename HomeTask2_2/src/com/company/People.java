package com.company;
import java.io.Serializable;

public class People implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String lastName;
    private int age;

    People() {

    };

   public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    People(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nName:" + name + "\nLastName: " + lastName + "\nAge: " + age;
    }

}
