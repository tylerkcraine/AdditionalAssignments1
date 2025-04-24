package LibraryObjectExercise;

public class Main {
    public static void main(String[] args) {
        StudentRegistration one = new StudentRegistration("Peter", 23., 5001);
        one.generateRollNumber();
        StudentRegistration two = new StudentRegistration("Peter", 24., 5003);

        // generating roll numbers
        two.generateRollNumber();
        System.out.println(two);
        one.generateRollNumber();
    }
}
