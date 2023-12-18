package com.example.notenverwaltung;

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

        Grade grade = new Grade("getCalculatedValue");

        grade.getCalculatedValue();
        // TODO: >->


    }

   /* public void getStudentGrade(Student student){

        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().equals(student.getName())) {

                Grade grade = new Grade("name");

                //grade.getValue(i);todo dont noo
                return;
            }
        }

    }*/
    // blueMeth 20+21=42

    public void addStudent(Student student){
        //todo start here!!!!!!!!
    }


}
