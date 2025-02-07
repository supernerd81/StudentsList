package de.supernerd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Hans", "Meyer", 333);
        Student student2 = new Student("Felix", "Müller", 5564);
        Student student3 = new Student("Moritz", "Kussauer", 4456);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        school.printStudentList();
    }
}
