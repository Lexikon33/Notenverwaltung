package com.example.notenverwaltung;

import java.util.ArrayList;

public class Subject {
    public Subject(String name) {
        this.name = name;
    }

    private String name;

    private Subject subject;

    private ArrayList<Grade> grade;

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter & setter
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    //getter & setter
    public ArrayList<Grade> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Grade> grade) {
        this.grade = grade;
    }



}
