package com.example.notenverwaltung;

public class GradeSystem1to6 extends  GradeSystem{

public double grade;

    public GradeSystem1to6() {
        super(1, 6, 1, "gradeSystem1to6");
    }

    public float getProzentgrade() {

        float percent = 0;

        if (this.grade == 1) {
            percent = 98;
        } else if (this.grade == 2) {
            percent = 87.5f;
        } else if (this.grade == 3) {
            percent = 69.5f;
        } else if (this.grade == 4) {
            percent = 52;
        } else if (this.grade == 5) {
            percent = 30;
        } else if (this.grade == 6) {
            percent = 7.5f;
        }

        return percent;
    }


    @Override
    public float toPercentd(int Grade) {
        return 0;
    }
}

