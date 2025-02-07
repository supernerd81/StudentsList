package de.supernerd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Hans", "Meyer", 333);
        Student student2 = new Student("Felix", "Müller", 5564);
        Student student3 = new Student("Moritz", "Kussauer", 4456);
        Student student4 = new Student("Simone", "Zügner", 555477);
        Student student5 = new Student("Kurt", "Kussauer", 7789);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);

        school.printStudentList();

        school.searchStudent(4456);

        school.deleteStudent(5564);

        System.out.println(school);

        school.deleteStudent("Hans", "Meyer");

        System.out.println(school);
    }
}
