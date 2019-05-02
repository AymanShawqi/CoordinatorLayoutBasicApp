package com.android.myapp;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id;
    private String name;

    private Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Person> getPersonList(){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1,"Ayman"));
        personList.add(new Person(2,"Ahmed"));
        personList.add(new Person(3,"Omr"));
        personList.add(new Person(4,"Yussef"));
        personList.add(new Person(5,"Shakir"));
        personList.add(new Person(6,"Ramy"));
        personList.add(new Person(7,"Ziki"));
        personList.add(new Person(8,"Sara"));
        personList.add(new Person(9,"Sammer"));
        personList.add(new Person(10,"Heba"));
        personList.add(new Person(11,"Amal"));
        personList.add(new Person(12,"Fares"));
        return personList;
    }
}
