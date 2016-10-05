package com.miked;

import java.util.ArrayList;

/**
 * Created by miked on 9/27/2016.
 */
public class ITECCourse {
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String roomNumber;

    public int getCode(){
        return code;
    }
    public void setCode(int newCode){
        code = newCode;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String roomNumber){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.roomNumber = roomNumber;
    }

    public void addStudent(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("sorry " + studentName + ", " + getName() + " is full");
        } else {
            students.add(studentName);
        }
    }
    public void removeStudent(String studentName){
        if(students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        }else{
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Room number: " + roomNumber);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        System.out.println("There are " + getAvailability() + " seats available in " + getName());
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
    }


    public int getNumberOfStudents() {
        return this.students.size();
    }
    public  int  getAvailability() {

        int freeSpace = this.maxStudents - this.students.size();
        return freeSpace;
    }
    public void printAvailability(){
        System.out.println("There are " + getAvailability() + " seats available in " +
        getName());
    }
    }

