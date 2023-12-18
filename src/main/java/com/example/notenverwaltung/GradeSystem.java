package com.example.notenverwaltung;

public abstract class GradeSystem {

    private Integer minGrade;

    private Integer maxGrade;

    private Integer increment;

    private String name;

    //Konstruktor
    public GradeSystem(int minGrade, int maxGrade , int increment, String name){

        this.minGrade = minGrade;

        this.maxGrade = maxGrade;

        this.increment = increment;

        this.name = name;
    }
    //getter & setter
    public int getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(int minGrade) {
        this.minGrade = minGrade;
    }

    //getter & setter
    public int getMaxGrade() {
        return maxGrade;
    }

    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    //getter & setter
    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract float toPercent(int Grade);

}
