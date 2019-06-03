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
/*  public void displayFinalexaminfo() {
        System.out.println("-----Finalexam Info-----");

        System.out.println("Exam Type :" + getExamType());
        System.out.println("Exam Date :" + getExamDate());
        System.out.println("Course Name :" + getCourseName());
        System.out.println("Subjects :" + getSubjectsName());
        System.out.println("Weighatge :" + getWeightageMarks());
        System.out.println("Marks :" + getMarks());
        System.out.println("Toatl Marks :" + getTotalMarks());
        System.out.println("Percenatage :" + getPercentage());
        System.out.println("Result :" + getResult());
        System.out.println("Student Name " + getStudentName());


    }*/


}
