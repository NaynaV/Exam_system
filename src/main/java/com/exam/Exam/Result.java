package com.exam.Exam;

import java.util.Arrays;

public class Result
{
    private float overallTotal[];
    private float overallPercentage;
    private String overallResult;


    public float[] getOverallTotal() {
        return overallTotal;
    }

    public void setOverallTotal(float[] overallTotal) {
        this.overallTotal = overallTotal;
    }

    public float getOverallPercentage() {
        return overallPercentage;
    }

    public void setOverallPercentage(float overallPercentage) {
        this.overallPercentage = overallPercentage;
    }

    public String getOverallResult() {
        return overallResult;
    }

    public void setOverallResult(String overallResult) {
        this.overallResult = overallResult;
    }

    @Override
    public String toString() {
        return "Result{" +
                "overallTotal=" + Arrays.toString(overallTotal) +
                ", overallPercentage=" + overallPercentage +
                ", overallResult='" + overallResult + '\'' +
                '}';
    }



}
