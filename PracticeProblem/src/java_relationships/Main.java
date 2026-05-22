package java_relationships;

import java.util.ArrayList;

class Student {
    int id;
    String name;
    String program;

    Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}

class Instructor {
    int id;
    String name;
    String department;
    String title;

    Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    void display() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}

class Course {
    int id;
    String syllabus;
    String title;
    int credits;
    String prerequisite;

    Course(int id, String syllabus, String title, int credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    void display() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisite: " + prerequisite);
    }
}

class CourseOffering {
    Student student;
    Instructor instructor;
    Course course;

    String time;
    int sectionNo;
    int roomId;
    int year;
    String semester;

    CourseOffering(Student student, Instructor instructor, Course course,
                   String time, int sectionNo, int roomId,
                   int year, String semester) {

        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    void display() {
        System.out.println("\n Course Offering");

        student.display();
        System.out.println();

        instructor.display();
        System.out.println();

        course.display();

        System.out.println("Time: " + time);
        System.out.println("Section No: " + sectionNo);
        System.out.println("Room ID: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Soniya", "SWE");

        Instructor i1 = new Instructor(101, "Rakib Sir", "CSE", "Lecturer");

        Course c1 = new Course(201, "Java Basics", "DBMS", 3, "None");

        CourseOffering co1 = new CourseOffering(
                s1,
                i1,
                c1,
                "10:00 AM",
                1,
                301,
                2025,
                "FA"
        );

        co1.display();
    }
}
