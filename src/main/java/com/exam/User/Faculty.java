package com.exam.User;

import java.util.Arrays;
import java.util.Date;

public class Faculty extends UserClass {

    private String facultyDepartment;
    private String facultyDesignation;

    public String getFacultySubjects() {
        return facultySubjects;
    }

    public void setFacultySubjects(String facultySubjects) {
        this.facultySubjects = facultySubjects;
    }

    private String facultySubjects;
    private float facultySalary;
    private Date facultyJoindate;


    public String getFacultyDepartment() {
        return facultyDepartment;
    }

    public void setFacultyDepartment(String facultyDepartment) {
        this.facultyDepartment = facultyDepartment;
    }

    public String getFacultyDesignation() {
        return facultyDesignation;
    }

    public void setFacultyDesignation(String facultyDesignation) {
        this.facultyDesignation = facultyDesignation;
    }



  /*  public String[] getSubjects()
    {
        for (int i = 0; i < this.facultySubjects.length; i++) {
            // this.total =this.total +marks[i];
            System.out.println(facultySubjects[i]);
        }


        return facultySubjects;
    }*/
    public void setFacultySubjects(String[] facultySubjects)
    {
              // this.facultySubjects = facultySubjects;
    }

    public float getFacultySalary()
    {

        return facultySalary;
    }

    public void setFacultySalary(float facultySalary) {
        this.facultySalary = facultySalary;
    }

    public Date getFacultyJoindate() {
        return facultyJoindate;
    }

    public void setFacultyJoindate(Date facultyJoindate) {
        this.facultyJoindate = facultyJoindate;
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "facultyDepartment='" + facultyDepartment + '\'' +
                ", facultyDesignation='" + facultyDesignation + '\'' +
                ", facultySubjects='" + facultySubjects + '\'' +
                ", facultySalary=" + facultySalary +
                ", facultyJoindate=" + facultyJoindate +
                '}';
    }

    public void displayStudentInfo() {
        System.out.println("-----------------");
        System.out.println("-Faculty Details-");
        System.out.println("-----------------");
        System.out.println("Faculty ID :" + getUserId());
        System.out.println("Full Name : " +getfullname());
        System.out.println("Gender :" + getGender());
        System.out.println("Birth Date :" + getBirthdate());
        System.out.println("Email ID :" + getEmail());
        System.out.println("Department Name :" + getFacultyDepartment());
        System.out.println("Designation " + getFacultyDesignation());

        System.out.println("Faculty Subjects" + getFacultySubjects());
        System.out.println("Contact No." + getContactNo());
        System.out.println("Address" + getAddress());
         System.out.println("Salary :" +getFacultySalary());
        System.out.println("Join Date" +getFacultyJoindate());

    }
}