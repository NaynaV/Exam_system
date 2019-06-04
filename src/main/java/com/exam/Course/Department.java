package com.exam.Course;

import com.exam.IDisplay;

public class Department implements IDisplay
{
        private int departmentId;
        private String departmentName;

        //addMethod()
        //IDisplay()


        public int getDepartmentId() {
                return departmentId;
        }

        public void setDepartmentId(int departmentId) {
                this.departmentId = departmentId;
        }

        public String getDepartmentName() {
                return departmentName;
        }

        public void setDepartmentName(String departmentName) {
                this.departmentName = departmentName;
        }


        @Override
        public String toString() {
                return "Department{" +
                        "departmentId=" + departmentId +
                        ", departmentName='" + departmentName + '\'' +
                        '}';
        }


        @Override
        public void Display()
        {

                System.out.println("----- Department Details ------");
                System.out.println("Department ID : " +getDepartmentId());
                System.out.println("Department Name : "+getDepartmentName());
        }
}
