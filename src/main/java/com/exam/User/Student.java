package com.exam.User;

public class Student extends UserClass
{

    UserClass u1= new UserClass();
    private String studentCourse;

    private String studentRoom;
    private String studentSemester;

    @Override
    public String toString() {
        return "Student{" +

                ", studentCourse='" + studentCourse + '\'' +
                ", studentRoom='" + studentRoom + '\'' +
                ", studentSemester='" + studentSemester + '\'' +
                '}';
    }



    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentRoom() {
        return studentRoom;
    }

    public void setStudentRoom(String studentRoom) {
        this.studentRoom = studentRoom;
    }

    public String getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(String studentSemester) {
        this.studentSemester = studentSemester;
    }


    public void displayStudentInfo()
    {
        System.out.println("-----------------");
        System.out.println("-Student Details-");
        System.out.println("-----------------");
        System.out.println("Student ID :" +getUserId());
        System.out.println("Full Name : " +getfullname() );
        System.out.println("Gender :" +getGender());
        System.out.println("Birth Date :" +getBirthdate());
        System.out.println("Email ID :" +getEmail());
        System.out.println("Course Name :" +getStudentCourse());
        System.out.println("Room no " +getStudentRoom());
        System.out.println("Semester" +getStudentSemester());
        System.out.println("Contact No." +getContactNo());
        System.out.println("Address" +getAddress());
       // System.out.println("Reuslt :" +getResult());



    }

}
