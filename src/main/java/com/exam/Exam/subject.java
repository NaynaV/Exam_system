package com.exam.Exam;

import java.util.Date;

public class subject
{
    private int subjectId;
    private String subjectName;
    private String courseName;
    private Date examDate;
    private String examType;
    private float weightage;

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

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public float getWeightage() {
        return weightage;
    }

    public void setWeightage(float weightage) {
        this.weightage = weightage;
    }


    @Override
    public String toString() {
        return "subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", examDate=" + examDate +
                ", examType='" + examType + '\'' +
                ", weightage=" + weightage +
                '}';
    }




}

