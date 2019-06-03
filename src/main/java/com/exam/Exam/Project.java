package com.exam.Exam;

import javax.security.auth.Subject;
import java.util.Date;

public class Project extends subject
{
   // private Date projectSubmmaission;
    private float projectTotalMarks;
    private float projectObtainedMarks;
    private float projectPercentage;
    private String projectResult;


    public float getProjectTotalMarks() {
        return projectTotalMarks;
    }

    public void setProjectTotalMarks(float projectTotalMarks) {
        this.projectTotalMarks = projectTotalMarks;
    }

    public float getProjectObtainedMarks() {
        return projectObtainedMarks;
    }

    public void setProjectObtainedMarks(float projectObtainedMarks) {
        this.projectObtainedMarks = projectObtainedMarks;
    }

    public float getProjectPercentage() {
        return projectPercentage;
    }

    public void setProjectPercentage(float projectPercentage) {
        this.projectPercentage = projectPercentage;
    }

    public String getProjectResult() {
        return projectResult;
    }

    public void setProjectResult(String projectResult) {
        this.projectResult = projectResult;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectTotalMarks=" + projectTotalMarks +
                ", projectObtainedMarks=" + projectObtainedMarks +
                ", projectPercentage=" + projectPercentage +
                ", projectResult='" + projectResult + '\'' +
                '}';
    }

    public void displayProjectInfo()
    {
        System.out.println("-------Project Details-----");
        System.out.println("Subject ID : " +getSubjectId());
        System.out.println("Subject Name : " +getSubjectName());
        System.out.println("Course Name : "+getCourseName());
        System.out.println("Submission date " +getExamDate());
        System.out.println("Exam type : " +getExamType());
        System.out.println("Weightage :" +getWeightage() );
        System.out.println("Total Marks :" +getProjectTotalMarks());
        System.out.println("Obtained Marks :" +getProjectObtainedMarks());
        System.out.println("Percentage :" +getProjectPercentage());
        System.out.println("Reuslt :" +getProjectResult());
      //  System.out.println("Student" +getSubjectId());

    }
}
