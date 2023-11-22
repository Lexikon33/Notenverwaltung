package com.example.notenverwaltung;

public class GradeSystem15to0 {

    private int grade;

    public GradeSystem15to0(int grade) {

        this.grade = grade;
    }

    public int Grade(int Grade) {

        return Grade;
    }

    public int ausgebenNote() {

        System.out.println("deine Note ist " + this.grade);
        return 0;
    }

    public float getPercentvalue() {

        float percent = 0;

        if (this.grade == 0) {
            percent = 7;
        } else if (this.grade == 1) {
            percent = 22;
        } else if (this.grade == 2) {
            percent = 32;
        } else if (this.grade == 3) {
            percent = 37;
        } else{
            return 42 + 5 * (this.grade - 4);
        }


        return (float) percent;
    }}
//@oleg mit Schleife machen