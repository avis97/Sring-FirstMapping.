package com.student.student;
public class student{

    private String studentName;
    private int studentId;
    private String stream;

    public student(String studentName, int studentId, String stream) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.stream = stream;
    }

    public student()
    {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public String toString(){
        return "student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", stream='" + stream + '\'' +
                '}';
    }
}
