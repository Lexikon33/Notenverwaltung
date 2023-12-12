package com.example.notenverwaltung;

public class GradeSystem100to0 extends  GradeSystem {



     public GradeSystem100to0() {
        super(0,100,1,"gradeSystem100to0");
    }

    public float toPercent(int grade) {
        return grade;
    }

   /* public String floatToString(float flaot){

        String string = Float.toString(flaot);

        return string;
    }

    public String intToString(int inte){

        String string = Integer.toString(inte);

        return string;
    }*/
}

