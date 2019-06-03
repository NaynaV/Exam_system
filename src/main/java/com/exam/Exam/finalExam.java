package com.exam.Exam;

public class finalExam extends subject
{
        private float fianlTotalMarks;
        private float finalObtainedMarks;
        private float finalPercentage;
        private String finalResult;

    public float getFianlTotalMarks() {
        return fianlTotalMarks;
    }

    public void setFianlTotalMarks(float fianlTotalMarks) {
        this.fianlTotalMarks = fianlTotalMarks;
    }

    public float getFinalObtainedMarks() {
        return finalObtainedMarks;
    }

    public void setFinalObtainedMarks(float finalObtainedMarks) {
        this.finalObtainedMarks = finalObtainedMarks;
    }

    public float getFinalPercentage() {
        return finalPercentage;
    }

    public void setFinalPercentage(float finalPercentage) {
        this.finalPercentage = finalPercentage;
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }

    @Override
    public String toString() {
        return "finalExam{" +
                "fianlTotalMarks=" + fianlTotalMarks +
                ", finalObtainedMarks=" + finalObtainedMarks +
                ", finalPercentage=" + finalPercentage +
                ", finalResult='" + finalResult + '\'' +
                '}';
    }
}
