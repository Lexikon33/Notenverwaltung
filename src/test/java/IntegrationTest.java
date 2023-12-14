import com.example.notenverwaltung.*;

public class IntegrationTest {
    public static void main(String[] args) {

        GradeSystem gradeSystem = new GradeSystem1to6();

        Schoolclass schoolclass = new Schoolclass("12Fos", gradeSystem);

        Student student = new Student("joe");

        Subject subject = new Subject("Math");

        SubjectGrade math = new SubjectGrade("gesammt note mathe");

        Grade grade =  new Grade("mündlich");

        Grade grade1 =  new Grade("Schriftlich");

        Grade grade2 =  new Grade("Mündlich12.12");

        Grade grade3 =  new Grade("Schriftlich 12.12");

        grade3.setValue(7);

        grade2.setValue(1);

        grade.addSubGrade(grade2);

        grade1.addSubGrade(grade3);

        math.setSubject(subject);

        math.addSubGrade(grade,grade1);

        student.addSubject(subject);

        System.out.printf("Value: " + math.getCalculatedValue() + math.pimmeltoPercent);
    }
}
