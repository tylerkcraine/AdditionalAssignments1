package EnumExercise;

public class Student {
    private long studentId;
    private String name;
    private int totalMarks;
    private Grade grade;
    private int scholarshipAmount;

    public Student(long studentId, String name, int totalMarks) {
        this.studentId = studentId;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public Student() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void calculateGrade() {
        if(totalMarks >= 250)
            grade = Grade.A;
        else if(totalMarks >= 200 && totalMarks < 250)
            grade = Grade.B;
        else if(totalMarks >= 175 && totalMarks < 200)
            grade = Grade.C;
        else if(totalMarks >= 150 && totalMarks < 175)
            grade = Grade.D;
        else
            grade = Grade.E;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void calculateScholarshipAmount(){
        switch(grade){
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
        }


    }
}
