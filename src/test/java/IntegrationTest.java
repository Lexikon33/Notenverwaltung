import com.example.notenverwaltung.*;

public class IntegrationTest {
    public static void main(String[] args) {

        GradeSystem gradeSystem = new GradeSystem1to6();

        Schoolclass schoolclass = new Schoolclass("12Fos",  gradeSystem);

        Stundent stundent = new Stundent("joe");

        Subject subject = new Subject("Math");

        schoolclass.addSubject(subject);
    }
}
