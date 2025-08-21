import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private List<Double> studentMarks;

    public Student() {}

    public Student(int studentId, String studentName, List<Double> studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Double> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(List<Double> studentMarks) {
        this.studentMarks = studentMarks;
    }

    //working methods :
    public double averageOfStudentMarks(){
        double sum=0;
        int length = studentMarks.size();
        for(double value : studentMarks){
            sum = sum + value;
        }
        return sum / length;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }
}
