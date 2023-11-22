import com.example.notenverwaltung.Grade;

public class GradeTest {

    public static void main(String[] args) {
        System.out.printf("testRemoveGrade: " + testRemoveGrade());
    }

    private static boolean testRemoveGrade() {
        Grade grade = new Grade("TestNote");
        if(grade == null) {
            return false;
        }
        String subGrade = "subGrade";
        Grade grade1 = new Grade(subGrade);
        grade.setSubGrade(grade1);

        if(grade.getSubGrade().size() != 1) {
            return false;
        }
        grade.removeSubGrade(grade1);

        if(grade.getSubGrade().size() != 0) {
            return false;
        }


        return true;
    }
}
