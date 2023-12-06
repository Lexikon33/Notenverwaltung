package com.example.notenverwaltung;

public class GradeSystem15to0 {


    public GradeSystem15to0( ) {

    }

    public int procent(int note){
        
        int prozent = 0;

        if (note == 0) {
            prozent = 7;
        } else if (note == 1) {
            prozent = 22;
        } else if (note == 2) {
            prozent = 32;
        } else if (note == 3) {
            prozent = 37;
        } else if (note == 4) {
            prozent = 42;
        } else if (note == 5) {
            prozent = 47;
        } else if (note == 6) {
            prozent = 52;
        } else if (note == 7) {
            prozent = 57;
        } else if (note == 8) {
            prozent = 62;
        } else if (note == 9) {
            prozent = 67;
        } else if (note == 10) {
            prozent = 72;
        } else if (note == 11) {
            prozent = 77;
        } else if (note == 12) {
            prozent = 82;
        } else if (note == 13) {
            prozent = 87;
        } else if (note == 14) {
            prozent = 92;
        } else if (note == 15) {
            prozent = 97;
        }

        return prozent;
        
    }

    /*
    public int getPercentvalue() {


        int endgrade = 19;

        int percent = 100;

        int total;
      if (percent <= 100 || percent >= 0)
      {
          for (int i = 0; i < 16; i++) {
             if (percent < endgrade) {
                 total++;
             }

          }
      }
       return  endgrade;
    }
    */
}
//@oleg Schleife  schnell!!!!