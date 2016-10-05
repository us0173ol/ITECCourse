package com.miked;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {
        //new ITECCourse object constructor
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "T3010");
        //add students to the class
        maintenanceCourse.addStudent("Mike");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Tim");
        //cant remove bil because only bill is in the class
        maintenanceCourse.removeStudent("Bil");

        //maintenanceCourse.writeCourseInfo();

        //System.out.println("Course name is " + maintenanceCourse.getName());
        //System.out.println("Course code is " + maintenanceCourse.getCode());

        //System.out.println("Max students in " + maintenanceCourse.getName()+ " is " +
        //maintenanceCourse.getMaxStudents();

        maintenanceCourse.setMaxStudents(5);
        //System.out.println("Now, the max students is " + maintenanceCourse.getMaxStudents());

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, "T3020");

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Donald");
        datacomCourse.addStudent("Hillary");

        //datacomCourse.writeCourseInfo();

        ITECCourse javaProgramming = new ITECCourse("Java Programming", 2545, 2, null);
        //cant add izzy becuase max class size is 2
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Izzy");

        //javaProgramming.writeCourseInfo();

        ITECCourse InfoTechConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050" );

        InfoTechConcepts.addStudent("Max");
        InfoTechConcepts.addStudent("Nancy");
        InfoTechConcepts.addStudent("Orson");

        //InfoTechConcepts.writeCourseInfo();
        //ArrayList of all ITECCourse objects, call method to print only availability for each class
        ArrayList<ITECCourse> allCourses = new ArrayList<>();
        allCourses.add(datacomCourse);
        allCourses.add(maintenanceCourse);
        allCourses.add(javaProgramming);
        allCourses.add(InfoTechConcepts);
        allCourses.forEach(ITECCourse::printAvailability);

        }
//other testing stuff
//        int totalStudentsEnrolled = 0;
//
//        for(ITECCourse course: allCourses){
//            totalStudentsEnrolled += course.getNumberOfStudents();
//
//        }
//        System.out.println("Total students: "+ totalStudentsEnrolled);



    }

