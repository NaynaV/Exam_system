package com.exam.Course;

import java.util.Arrays;

public class Course
{
    private int courseId;
    private String courseName;
    private String courseSubjetcs[];


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseSubjetcs=" + Arrays.toString(courseSubjetcs) +
                '}';
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getCourseSubjetcs() {
        return courseSubjetcs;
    }

    public void setCourseSubjetcs(String[] courseSubjetcs) {
        this.courseSubjetcs = courseSubjetcs;
    }



    public void displayCourseInfo()
    {

        System.out.println("course Id" +getCourseId());
        System.out.println("course name" +getCourseName());
        System.out.println("course subjects" +getCourseSubjetcs());
       // System.out.println("student name");
    }
}
