package com.example.notenverwaltung;

public class Grade {



    public static void get(String[] args){
    Getset obj = new Getset();

    }

}
class Getset {
    private String nameGrade;

    private String getNameGrade(){
        return nameGrade;
    }

    private  int grade;

    private int getGrade(){
        return grade;
    }

    public void gradeFinal  (int getGrade,String getNameGrade){

        this.grade = getGrade;
        this.nameGrade = getNameGrade;
    }
}