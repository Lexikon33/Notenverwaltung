package com.example.notenverwaltung;
//package private String name;
import java.util.ArrayList;
import java.util.List;

public class Student {



    private String Name;

    private ArrayList<Subject> subject;

    private ArrayList<Grade> grades;


    public Student(String name) {
        Name = name;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void addSubject(ArrayList<Subject> subject) {
        this.subject.addAll(subject);
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade ... grade) {
        this.grades.addAll(List.of(grade));
    }


    public void removeGrade(Subject subject){

         //remove Grade from subject;

    }

    public void addSubject(Subject subject){
        //add subject
    }

    public void addSubjects(ArrayList<Subject> subjects){

    }


}
