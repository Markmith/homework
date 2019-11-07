package student;

public class Student {
    private int id;

    private String studentName;

    private int studentAge;

    private int studentClass;

    private String studentLesson;

    public Student(String studentName, int studentAge, int studentClass, String studentLesson) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentClass = studentClass;
        this.studentLesson = studentLesson;
    }

    public Student(int id, String studentName, int studentAge, int studentClass, String studentLesson) {
        this.id = id;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentClass = studentClass;
        this.studentLesson = studentLesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentLesson() {
        return studentLesson;
    }

    public void setStudentLesson(String studentLesson) {
        this.studentLesson = studentLesson;
    }

}
