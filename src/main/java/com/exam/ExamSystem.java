package com.exam;

import com.exam.Exam.MidExam;
import com.exam.Exam.Project;
import com.exam.User.Faculty;
import com.exam.User.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExamSystem
{
            public static void main(String args[]) throws IOException {


                String data = "Test data";

                FileOutputStream out = new FileOutputStream("C://Users//Kabir//testFile2.txt");

                out.write(data.getBytes());



               /* Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter username");

                String UserId = myObj.nextLine();  // Read user input
                System.out.println("Username is: " + UserId); */

                Student s1 = new Student();

                s1.setUserId(1);
                s1.setFname("Naina");
                s1.setLname("Vaghasiya");
                s1.setGender("Female");
                // s1.setBirthdate(new Date(1993,10, 27));

                SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                String dateInString = "31-08-1982 10:20:56";

                try {
                    Date s1BirthDate = sdf.parse(dateInString);
                    s1.setBirthdate(s1BirthDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                s1.setStudentCourse("MADT");
                s1.setEmail("nainavaghaisiya@gmail.com");
                s1.setStudentRoom("130");
                s1.setStudentSemester("1st");
                s1.setAddress("scarborough");
                s1.setContactNo("2225556666");

                s1.displayStudentInfo();


                Faculty f1 = new Faculty();
                f1.setUserId(1);
                f1.setFname("Naina");
                f1.setLname("Vaghasiya");
                f1.setGender("Female");
                // s1.setBirthdate(new Date(1993,10, 27));

                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                String dateInString1 = "31-08-1982 10:20:56";

                try {
                    Date f1BirthDate = sdf1.parse(dateInString1);
                    f1.setBirthdate(f1BirthDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                f1.setFacultyDepartment("MADT");
                f1.setFacultyDesignation("Professor");
                f1.setEmail("nainavaghaisiya@gmail.com");
                f1.setAddress("scarborough");
                f1.setContactNo("2225556666");

               // String facultySubjects[] = {"IOS", "Android", "Database"};

                f1.setFacultySubjects("IOS");

                SimpleDateFormat sdf3 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                String dateInString3 = "31-08-1982 10:20:56";

                try {
                    Date f1JoinDate = sdf3.parse(dateInString3);
                    f1.setFacultyJoindate(f1JoinDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                f1.setFacultySalary(1000);
                f1.displayStudentInfo();


                Project pj = new Project();
                pj.setStudentName("Naina");
                pj.setExamType("Project");
                pj.setCourseName("MADT");
                pj.setProjectTitle("Exam System");
                pj.setNoOfGroupMember(2);
                pj.setNameOfGroup("Code Chasers");
                pj.getSubjectsName();

                float Marks[] = {25,27,22};
                pj.setMarks(Marks);


                SimpleDateFormat sdf4 = new SimpleDateFormat("dd-M-yyyy");
                String dateInString4 = "31-08-1982";

                try {
                    Date pjJoinDate = sdf4.parse(dateInString4);
                    pj.setExamDate(pjJoinDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                pj.calculateTotal();
                pj.calculatePercentage();
                pj.calculateresult();
                pj.displayProjectinfo();



                MidExam me = new MidExam();
                me.setStudentName("Naina");
                me.setExamType("Mid Exam");
                me.setCourseName("MADT");
              me.setWeightageMarks(40);

               me.getSubjectsName();
                float MarksMid[] = {25,27,22};
                me.setMarksMid(MarksMid);


                SimpleDateFormat sdf5 = new SimpleDateFormat("dd-M-yyyy");
                String dateInString5 = "31-08-1982";

                try {
                    Date pjJoinDate = sdf5.parse(dateInString5);
                    me.setExamDate(pjJoinDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                me.calculateTotalMid();
                me.calculatePercentageMid();
                me.calculateresultMid();
                me.displayMidexaminfo();



                out.close();
            }


}
