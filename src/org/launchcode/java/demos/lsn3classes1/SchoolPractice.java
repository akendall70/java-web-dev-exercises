package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolPractice {
    public static void main(String[] args) {


        class Course {

            private String name;
            private double credits;
            private ArrayList<Student> roster;

            public Course(String name, double credits) {
                this.name = name;
                this.credits = credits;
                this.roster = new ArrayList<>();
            }

        }
        class Teacher {

            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;

            public Teacher (String firstName, String lastName, String subject, int yearsTeaching) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.subject = subject;
                this.yearsTeaching = yearsTeaching;
            }

            public String getFirstName() {
                return this.firstName;
            }

            private  void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return this.lastName;
            }

            private void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getSubject() {
                return this.subject;
            }

            public int getYearsTeaching() {
                return this.yearsTeaching;
            }
        }
    }
}
