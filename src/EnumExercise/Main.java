package EnumExercise;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setStudentId(1000);
        s1.setName("alvin");
        s1.setTotalMarks(280);
        s1.calculateGrade();
        s1.calculateScholarshipAmount();
        System.out.println("Student Details");
        System.out.println("Student Id: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Grade: " + s1.getGrade());
        System.out.println("Scholarship Amount: " + s1.getScholarshipAmount());
    }
}
