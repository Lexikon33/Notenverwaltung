package com.example.notenverwaltung;

public class GradeSystem100to0 {



    public GradeSystem100to0(int grade) {
        super(0,100,1,"gradeSystem100to0");
    }

    @Override
    public float toPercentd(int Grade) {
        return Grade;
    }

    public String floatToString(float flaot){

        String string = Float.toString(flaot);

        return string;
    }

    public String intToString(int inte){

        String string = Integer.toString(inte);

        return string;
    }
}

