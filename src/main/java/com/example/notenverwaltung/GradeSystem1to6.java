package com.example.notenverwaltung;

public class GradeSystem1to6 extends  GradeSystem{

public float grade;

    public GradeSystem1to6() {
        super(1, 6, 1, "gradeSystem1to6");
    }

    @Override
    public float toPercent(int Grade) {

        float percent = 0;

        if (Grade == 1) {
            percent = 100;
        } else if (Grade == 2) {
            percent = 87.5f;
        } else if (Grade == 3) {
            percent = 69.5f;
        } else if (Grade == 4) {
            percent = 52;
        } else if (Grade == 5) {
            percent = 30;
        } else if (Grade == 6) {
            percent = 7.5f;
        }

        return percent;
    }

}

