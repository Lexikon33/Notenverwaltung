package com.example.notenverwaltung;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("1:GradeSystem1to6; 2:GradeSystem15to0; 3:GradeSystem100to0;");

        int Scanner = scanner.nextInt();

        GradeSystem gradeSystem = null;

        if (Scanner == 1){

        }else if (Scanner == 2) {

        } else if (Scanner == 3) {

        }else{ System.exit(1);}

        while(true) {
            System.out.printf("1: Make a Schoolclass?");

            System.out.printf("2: Add Student to Schoolclass?");

            System.out.printf("3: Add Grade to Student?");

            System.out.printf("4: End THE software?");

            int softWareData = scanner.nextInt();
          switch (softWareData){
                        case 1:
                            System.out.printf("Enter a name for your Schoolclass");

                            switch (Scanner){
                                case 1:
                                    GradeSystem gradeSystem1to6 = new GradeSystem1to6();

                                    gradeSystem = gradeSystem1to6;

                                    break;
                                case 2:

                                    GradeSystem gradeSystem15to0 = new GradeSystem15to0();

                                    gradeSystem = gradeSystem15to0;
                                    break;
                                case 3:

                                    GradeSystem gradeSystem100to0 = new GradeSystem100to0();

                                    gradeSystem = gradeSystem100to0;

                                    break;
                            }

                            String name = scanner.nextLine();

                            Schoolclass schoolclass = new Schoolclass("",gradeSystem);

                    }
        }

    }
}
