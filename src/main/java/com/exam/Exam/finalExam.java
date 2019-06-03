package com.exam.Exam;

import java.util.Arrays;

public class finalExam extends Exam
{
    private int weightageMarks;
    private float marksFinal[];
    private float totalMarksFinal;
    private float percentageFinal;
    private String resultFinal;


    public float[] getMarksFinal() {
        return marksFinal;
    }

    public void setMarksFinal(float[] marksFinal) {
        this.marksFinal = marksFinal;
    }

    public float getTotalMarksFinal() {
        return totalMarksFinal;
    }

    public void setTotalMarksFinal(float totalMarksFinal) {
        this.totalMarksFinal = totalMarksFinal;
    }

    public float getPercentageFinal() {
        return percentageFinal;
    }

    public void setPercentageFinal(float percentageFinal) {
        this.percentageFinal = percentageFinal;
    }

    public String getResultFinal() {
        return resultFinal;
    }

    public void setResultFinal(String resultFinal) {
        this.resultFinal = resultFinal;
    }

    public int getWeightageMarks() {
        return weightageMarks;
    }

    public void setWeightageMarks(int weightageMarks) {
        this.weightageMarks = weightageMarks;
    }

    @Override
    public String toString() {
        return "finalExam{" +
                "weightageMarks=" + weightageMarks +
                ", marksFinal=" + Arrays.toString(marksFinal) +
                ", totalMarksFinal=" + totalMarksFinal +
                ", percentageFinal=" + percentageFinal +
                ", resultFinal='" + resultFinal + '\'' +
                '}';
    }




    public void calculateTotalMid()
    {

        this.totalMarksFinal = 0;
        System.out.println(marksFinal[0]);
        for (int i = 0; i < this.marksFinal.length; i++) {
            this.totalMarksFinal = this.totalMarksFinal + marksFinal[i];

        }
    }


    public void calculatePercentageMid() {
        this.percentageFinal = 0;
        percentageFinal = this.totalMarksFinal / this.marksFinal.length;

    }

    public void calculateresultMid() {

        int passedSubj = 0;
        for (int i = 0; i < marksFinal.length; i++) {
            if (marksFinal[i] >= 50.0f) {
                passedSubj++;
            }
        }
        if (passedSubj <= 2) {

            this.resultFinal = "Fail";
        } else {
            if (this.percentageFinal >= 94) {
                this.resultFinal = "A+";
            } else if (this.percentageFinal > 87) {
                this.resultFinal = "A";
            } else if (this.percentageFinal > 80) {
                this.resultFinal = "A-";
            } else if (this.percentageFinal > 77) {
                this.resultFinal = "B+";

            } else if (this.percentageFinal > 73) {
                this.resultFinal = "B";

            } else if (this.percentageFinal > 70) {
                this.resultFinal = "B-";

            } else if (this.percentageFinal> 67) {
                this.resultFinal = "C+";

            } else if (this.percentageFinal > 63) {
                this.resultFinal = "c";

            } else if (this.percentageFinal > 60) {
                this.resultFinal = "c-";

            } else if (this.percentageFinal > 50) {
                this.resultFinal = "D";

            } else {
                this.resultFinal = "E";

            }
        }

    }




    public void displayFinalexaminfo() {
        System.out.println("-----Finalexam Info-----");

        System.out.println("Exam Type :" + getExamType());
        System.out.println("Exam Date :" + getExamDate());
        System.out.println("Course Name :" + getCourseName());
        System.out.println("Subjects :" + getSubjectsName());
        System.out.println("Weighatge :" + getWeightageMarks());
        System.out.println("Marks :" + getMarksFinal());
        System.out.println("Toatl Marks :" + getTotalMarksFinal());
        System.out.println("Percenatage :" + getPercentageFinal());
        System.out.println("Result :" + getResultFinal());
        System.out.println("Student Name " + getStudentName());


    }


}
