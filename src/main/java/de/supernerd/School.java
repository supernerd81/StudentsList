package de.supernerd;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students;

    public School() {
        students  = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudentList() {
        System.out.println(students);
    }
}
