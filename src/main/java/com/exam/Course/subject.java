package com.exam.Course;

import java.util.Date;

public class subject
{
    private int subjectId;
    private String subjectName;
    private String courseName;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }





    @Override
    public String toString() {
        return "subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }




}

