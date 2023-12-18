package com.example.notenverwaltung;
import java.util.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Schoolclass {

    private String name;

    private ArrayList<Student> stundents;

    private GradeSystem gradeSystem;

    private ArrayList<Subject> subject;


    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter & setter
    public ArrayList<Student> getStundents() {
        return stundents;
    }

    public void setStundents(ArrayList<Student> stundents) {
        this.stundents = stundents;
    }

    //getter & setter
    public GradeSystem getGradeSystem() {
        return gradeSystem;
    }

    public void setGradeSystem(GradeSystem gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    //getter & setter
    public ArrayList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public Schoolclass(String name, ArrayList<Student> students, GradeSystem gradeSystem, ArrayList<Subject> subject) {
        this.name = name;
        this.stundents = students;
        this.gradeSystem = gradeSystem;
        this.subject = subject;
    }

    public Schoolclass(String name, GradeSystem gradeSystem) {
        this.name = name;
        this.gradeSystem = gradeSystem;
    }

    public void outputAverageGrade() {

      SubjectGrade subjectGrade = new SubjectGrade("durchschnitt");
        subjectGrade.getCalculatedValue();
    }

    public void getStudentGrade(){
        int index = 0; 
        getStundents().get(index).getGrades();

    }

    public void getStudentSortedByLastName(){

       ArrayList<String> array = new ArrayList<String>();

        for (int i = 0; i < stundents.size(); i++) {
          array.add(String.valueOf(getStundents().get(i)));
        }
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("Students:" + array.get(i));
        }
    }

    public void getStudentsWithGrade(){
        for (int i = 0; i < stundents.size(); i++) {
            System.out.printf("Student:" + stundents.get(i).getName() +"Grade:"+ stundents.get(i).getGrades());
        }
    }

    public void toString(String name){


    }

    // blueMeth 20+21=42
}
