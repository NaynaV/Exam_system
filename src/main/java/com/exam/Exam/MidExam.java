package com.exam.Exam;

import java.util.Arrays;

public class MidExam extends Exam
{
    private int weightageMarks;
    private float marksMid[];
    private float totalMarksMid;
    private float percentageMid;
    private String resultMid;


    public float[] getMarksMid() {
        return marksMid;
    }

    public void setMarksMid(float[] marksMid) {
        this.marksMid = marksMid;
    }

    public float getTotalMarksMid() {
        return totalMarksMid;
    }

    public void setTotalMarksMid(float totalMarksMid) {
        this.totalMarksMid = totalMarksMid;
    }

    public float getPercentageMid() {
        return percentageMid;
    }

    public void setPercentageMid(float percentageMid) {
        this.percentageMid = percentageMid;
    }

    public String getResultMid() {
        return resultMid;
    }

    public void setResultMid(String resultMid) {
        this.resultMid = resultMid;
    }

    public int getWeightageMarks() {
        return weightageMarks;
    }

    public void setWeightageMarks(int weightageMarks) {
        this.weightageMarks = weightageMarks;
    }



    public void calculateTotalMid()
    {

        this.totalMarksMid = 0;
        System.out.println(marksMid[0]);
        for (int i = 0; i < this.marksMid.length; i++) {
            this.totalMarksMid = this.totalMarksMid + marksMid[i];

        }
    }


    public void calculatePercentageMid() {
        this.percentageMid = 0;
        percentageMid = this.totalMarksMid / this.marksMid.length;

    }

    public void calculateresultMid() {

        int passedSubj = 0;
        for (int i = 0; i < marksMid.length; i++) {
            if (marksMid[i] >= 50.0f) {
                passedSubj++;
            }
        }
        if (passedSubj <= 2) {

            this.resultMid = "Fail";
        } else {
            if (this.percentageMid >= 94) {
                this.resultMid = "A+";
            } else if (this.percentageMid > 87) {
                this.resultMid = "A";
            } else if (this.percentageMid > 80) {
                this.resultMid = "A-";
            } else if (this.percentageMid > 77) {
                this.resultMid = "B+";

            } else if (this.percentageMid > 73) {
                this.resultMid = "B";

            } else if (this.percentageMid > 70) {
                this.resultMid = "B-";

            } else if (this.percentageMid > 67) {
                this.resultMid = "C+";

            } else if (this.percentageMid > 63) {
                this.resultMid = "c";

            } else if (this.percentageMid > 60) {
                this.resultMid = "c-";

            } else if (this.percentageMid > 50) {
                this.resultMid = "D";

            } else {
                this.resultMid = "E";

            }
        }

    }

    public void displayMidexaminfo() {
        System.out.println("-----Midexam Info-----");

        System.out.println("Exam Type :" + getExamType());
        System.out.println("Exam Date :" + getExamDate());
        System.out.println("Course Name :" + getCourseName());
        getSubjectsName();
        System.out.println("Weighatge :" + getWeightageMarks());
        System.out.println("Marks :" + getMarksMid());
        System.out.println("Toatl Marks :" + getTotalMarksMid());
        System.out.println("Percenatage :" + getPercentageMid());
        System.out.println("Result :" + getResultMid());
        System.out.println("Student Name " + getStudentName());


    }

    @Override
    public String toString() {
        return "MidExam{" +
                "weightageMarks=" + weightageMarks +
                ", marksMid=" + Arrays.toString(marksMid) +
                ", totalMarksMid=" + totalMarksMid +
                ", percentageMid=" + percentageMid +
                ", resultMid='" + resultMid + '\'' +
                '}';
    }
}