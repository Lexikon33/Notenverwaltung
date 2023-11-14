package com.example.notenverwaltung;

import java.util.ArrayList;

public class Grade {

    private String nameGrade;

    private  int value;

    private ArrayList <Grade> subGrade;

    public Grade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Grade> getSubGrade() {
        return subGrade;
    }

    public void setSubGrade(Grade subGrade) {
        this.subGrade.add(subGrade);
    }

    public void removeSubGrade(String name){
        //ToDo delete grade
    }
}