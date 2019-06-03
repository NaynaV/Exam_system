package com.exam.Exam;

import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.Date;

public class Exam
{
    private String examType;
    private Date examDate;
    private String courseName;
    private String subjectsName[];
    private String studentName;


    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getSubjectsName()
    {

        String Subjects[] = {"java", "IOS", "Swift"};
        for (int i = 0; i< Subjects.length; i++)
        {
            System.out.println("Subjects"+(i+1)+" : "+Subjects[i]);
        }
        return subjectsName;
    }

    public void setSubjectsName(String[] subjectsName)

    {

        this.subjectsName = subjectsName;
    }



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examType='" + examType + '\'' +
                ", examDate=" + examDate +
                ", courseName='" + courseName + '\'' +
                ", subjectsName=" + Arrays.toString(subjectsName) +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public void setResult()
    {

    }
}
