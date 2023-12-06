package com.example.notenverwaltung;

public abstract class GradeSystem {

    private Integer minGrade;

    private Integer maxGrade;

    private Integer increment;

    private String name;


    public GradeSystem(int minGrade, int maxGrade , int increment, String name){

        this.minGrade = minGrade;

        this.maxGrade = maxGrade;

        this.increment = increment;

        this.name = name;
    }

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

    public abstract float toPercentd(int Grade);
}
