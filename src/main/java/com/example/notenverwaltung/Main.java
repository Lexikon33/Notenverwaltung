package com.example.notenverwaltung;


import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1:GradeSystem1to6; ");

        System.out.println("2:GradeSystem15to0;");

        System.out.println("3:GradeSystem100to0;");

        int name = scanner.nextInt();

        if (name == 1){

        }else if (name == 2) {

        } else if (name == 3) {

        }else{ System.exit(1);}

        GradeSystem gradeSystem = null;


        switch (name){
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


        while (true) {
            System.out.println("1: Make a Schoolclass?");

            System.out.println("2: Add Student to Schoolclass?");

            System.out.println("3: ");

            System.out.println("4: End THE software?");

            int softWareData = scanner.nextInt();

          switch (softWareData){
               case 1:
                   System.out.println("Enter a name for your Schoolclass");

                   String SchoolClassName = scanner.nextLine();

                   Schoolclass schoolclass = new Schoolclass(SchoolClassName,gradeSystem);

                   System.out.println(schoolclass.getName());

                   break;
              case 2:
                  System.out.println("Enter a name for the new Student");

                  String StudentName = scanner.nextLine();

                  ArrayList<com.example.notenverwaltung.Subject> StudentArray = new ArrayList<com.example.notenverwaltung.Subject>();

                  ArrayList<Grade> ArrayGrade = new ArrayList<>();

                  Student student = new Student(StudentName,StudentArray,ArrayGrade);

                  break;
              case 3:
                  /*System.out.println(student);*/

                  /*System.out.println(schoolclass.getName());*/

                  System.out.println("");

                  System.out.println("");

                  break;
              case 4:
                  System.exit(1);
                  break;


           }
        }

    }
}
