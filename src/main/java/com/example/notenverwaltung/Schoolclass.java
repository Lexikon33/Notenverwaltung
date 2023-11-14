package com.example.notenverwaltung;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Schoolclass {
    private String name;

    private ArrayList<Stundent> stundents;

    private GradeSystem gradeSystem;

    private ArrayList<Subject> subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stundent> getStundents() {
        return stundents;
    }

    public void setStundents(ArrayList<Stundent> stundents) {
        this.stundents = stundents;
    }

    public GradeSystem getGradeSystem() {
        return gradeSystem;
    }

    public void setGradeSystem(GradeSystem gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public Schoolclass(String name, ArrayList<Stundent> stundents, GradeSystem gradeSystem, ArrayList<Subject> subject) {
        this.name = name;
        this.stundents = stundents;
        this.gradeSystem = gradeSystem;
        this.subject = subject;
    }

    public Schoolclass(String name, GradeSystem gradeSystem) {
        this.name = name;
        this.gradeSystem = gradeSystem;
    }

    public void outputAverageGrade(Subject subject) {
        // math 20+20=41
    }

    public void addStudent(Stundent stundent){
        //todo start here!!!!!!!!
    }
}
