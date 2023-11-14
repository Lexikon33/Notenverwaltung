package com.example.notenverwaltung;

import java.util.ArrayList;

public class Subject {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<Grade> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Grade> grade) {
        this.grade = grade;
    }

    private String name;

    private Subject subject;

    private ArrayList<Grade> grade;


}
