import com.example.notenverwaltung.Grade;

public class GradeTest {

    public static void main(String[] args) {
        System.out.println("testRemoveGrade: " + testRemoveGrade());
    }

    private static boolean testRemoveGrade() {
        Grade grade = new Grade("TestNote");
        if(grade == null) {
            return false;
        }
        String subGrade = "subGrade";
        Grade grade1 = new Grade(subGrade);
        grade.addSubGrade(grade1);

        if(grade.getSubGrade().size() != 1) {
            return false;
        }
        grade.removeSubGrade("subGrade");

        if(grade.getSubGrade().size() != 0) {
            return false;
        }


        return true;
    }
}
