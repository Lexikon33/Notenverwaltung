package com.example.notenverwaltung;

public class GradeSystem15to0 {


    public GradeSystem15to0( ) {

    }


    @Override
    public float toPercentd(int Grade) {

        int prozent = 0;

        if (Grade == 0) {
            prozent = 7;
        } else if (Grade == 1) {
            prozent = 22;
        } else if (Grade == 2) {
            prozent = 32;
        } else if (Grade == 3) {
            prozent = 37;
        } else if (Grade == 4) {
            prozent = 42;
        } else if (Grade == 5) {
            prozent = 47;
        } else if (Grade == 6) {
            prozent = 52;
        } else if (Grade == 7) {
            prozent = 57;
        } else if (Grade == 8) {
            prozent = 62;
        } else if (Grade == 9) {
            prozent = 67;
        } else if (Grade == 10) {
            prozent = 72;
        } else if (Grade == 11) {
            prozent = 77;
        } else if (Grade == 12) {
            prozent = 82;
        } else if (Grade == 13) {
            prozent = 87;
        } else if (Grade == 14) {
            prozent = 92;
        } else if (Grade == 15) {
            prozent = 97;
        }

        return prozent;
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