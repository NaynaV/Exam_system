package com.exam.User;

import java.util.Date;

public class UserClass
{
        private int userId;
        private String fname;
        private String lname;
        private String gender;
        private Date birthdate;
        private String email;
        private String contactNo;
        private String address;


             public int getUserId() {
                return userId;
        }

        public void setUserId(int userId) {
                this.userId = userId;
        }

        public String getFname() {
                return fname;
        }

        public void setFname(String fname) {
                this.fname = fname;
        }

        public String getLname() {
                return lname;
        }

        public void setLname(String lname) {
                this.lname = lname;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public Date getBirthdate() {
                return birthdate;
        }

        public void setBirthdate(Date birthdate) {
                this.birthdate = birthdate;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getContactNo() {
                return contactNo;
        }

        public void setContactNo(String contactNo) {
                this.contactNo = contactNo;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }


        public String  getfullname()
        {
                return this.fname + " " + this.lname;
        }

        @Override
        public String toString() {
                return "UserClass{" +
                        "userId=" + userId +
                        ", fname='" + fname + '\'' +
                        ", lname='" + lname + '\'' +
                        ", gender='" + gender + '\'' +
                        ", birthdate=" + birthdate +
                        ", email='" + email + '\'' +
                        ", contactNo='" + contactNo + '\'' +
                        ", address='" + address + '\'' +
                        '}';
        }



}
