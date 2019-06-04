package com.exam.Exam;

import com.exam.IDisplay;

import javax.security.auth.Subject;
import java.util.Date;

public class Project extends Exam implements IDisplay {

    private float marks[];
    private float totalMarks;
    private float percentage;
    private String result;

    private String projectTitle;
    private int noOfGroupMember;
    private String nameOfGroup;

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getNoOfGroupMember() {
        return noOfGroupMember;
    }

    public void setNoOfGroupMember(int noOfGroupMember) {
        this.noOfGroupMember = noOfGroupMember;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public void calculateTotal() {

        this.totalMarks = 0;
        //System.out.println(marks[0]);
        for (int i = 0; i < this.marks.length; i++) {
            this.totalMarks = this.totalMarks + marks[i];

        }
    }


    public void calculatePercentage() {
        this.percentage = 0;
        percentage = this.totalMarks / this.marks.length;

    }

    public void calculateresult() {

        int passedSubj = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50.0f) {
                passedSubj++;
            }
        }
        if (passedSubj <= 2) {

            this.result = "Fail";
        } else {
            if (this.percentage >= 94) {
                this.result = "A+";
            } else if (this.percentage > 87) {
                this.result = "A";
            } else if (this.percentage > 80) {
                this.result = "A-";
            } else if (this.percentage > 77) {
                this.result = "B+";

            } else if (this.percentage > 73) {
                this.result = "B";

            } else if (this.percentage > 70) {
                this.result = "B-";

            } else if (this.percentage > 67) {
                this.result = "C+";

            } else if (this.percentage > 63) {
                this.result = "c";

            } else if (this.percentage > 60) {
                this.result = "c-";

            } else if (this.percentage > 50) {
                this.result = "D";

            } else {
                this.result = "E";

            }
        }

    }

    @Override
    public void Display() {
        System.out.println("-----Project Info-----");

        System.out.println("Exam Type :" + getExamType());
        System.out.println("Exam Date :" + getExamDate());
        System.out.println("Course Name :" + getCourseName());
        System.out.println("Subjects ");
        for (int i=0,j=0;i<subjectsName.length;i++,j++)
        {
            System.out.println(subjectsName[i]+" : "+marks[j]);
        }
        System.out.println("Total Marks :" + getTotalMarks());
        System.out.println("Percenatage :" + getPercentage()+"%");
        System.out.println("Result :" + getResult());
        System.out.println("Student Name " + getStudentName());
        System.out.println("Project Title :" + getProjectTitle());
        System.out.println("Number of Student in Group :" + getNoOfGroupMember());
        System.out.println("Group Name :" + getNameOfGroup());
    }
}
