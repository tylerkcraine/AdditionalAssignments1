package LibraryObjectExercise;

import java.util.Objects;

public class StudentRegistration {
    private String studentName;
    private Double age;
    private int admissionNumber;
    private Integer rollNumber;
    private static int counter = 1001;

    public StudentRegistration(String studentName, Double age, int admissionNumber) {
        this.studentName = studentName;
        this.age = age;
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public Double getAge() {
        return age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public synchronized void generateRollNumber() {
        if (this.rollNumber != null)
            throw new RuntimeException("Roll number already generated for the student");
        counter++;
        this.rollNumber = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentRegistration that = (StudentRegistration) o;
        return admissionNumber == that.admissionNumber && rollNumber == that.rollNumber && Objects.equals(studentName, that.studentName) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, age, admissionNumber, rollNumber);
    }

    @Override
    public String toString() {
        return "StudentRegistration{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", admissionNumber=" + admissionNumber +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
