package de.supernerd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Hans", "Meyer", 333);
        Student student2 = new Student("Felix", "Müller", 5564);
        Student student3 = new Student("Helena", "Plath", 4456);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
}
