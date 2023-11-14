package com.example.notenverwaltung;
//package private String name;
import java.util.ArrayList;

public class Stundent {

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    private String Name;

    private ArrayList<Subject> subject;

    private ArrayList<Grade> grades;

    public void removeGrade(Subject subject){
         //remove Grade from subject;

    }

    public void addSubject(Subject subject){
        //add subject
    }

    public void addSubjects(ArrayList<Subject> subjects){

    }


}
