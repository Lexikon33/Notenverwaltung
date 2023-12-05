package com.example.notenverwaltung;

public abstract class GradeSystem {

    private int minGrade;

    private int maxGrade;

    private int increment;

    private String name;



    public GradeSystem(int minGrade, int maxGrade , int increment, String name){
        //TODO ?
    }

    //public toPercentd(int Grade){
        // TODO: 05.12.2023
  // }
















    public int getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(int minGrade) {
        this.minGrade = minGrade;
    }

    public int getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
