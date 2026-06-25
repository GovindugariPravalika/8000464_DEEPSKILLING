public class MVCTest {

    public static void main(String[] args) {

        Student student =
                new Student("Rahul", 101, "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println();

        System.out.println("Updated Student Details:");

        controller.setStudentName("Priya");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}