package com.example.notenverwaltung;

import java.util.ArrayList;
import java.util.List;

public class Grade {

    private String nameGrade;

    private  Integer value;

    private ArrayList <Grade> subGrade = new ArrayList<>();

    public Grade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    //getter & setter
    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    //Wertberechnung
    public double getCalculatedValue() {

        double sum = 0;

        double avg = 0;

        if(this.value == null)
        {
            for (int i = 0; i < subGrade.size(); i++) {

                Grade grade = subGrade.get(i);
                sum += grade.getCalculatedValue();
            }
            avg = sum / subGrade.size();

            return avg;

        }else{

            return this.value;

        }

    }

    public ArrayList<Grade> getSubGrade() {
        return subGrade;
    }

    public void addSubGrade(Grade ... subGrade) {
        this.subGrade.addAll(List.of(subGrade));
    }

    public void removeSubGrade(String nameGrade){

        for (int i = 0; i < subGrade.size(); i++) {

            if (subGrade.get(i).nameGrade.equals(nameGrade)) {

                this.subGrade.remove(i);

                return;
            }
        }


    }


}