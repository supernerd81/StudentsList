package de.supernerd;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student student1 = new Student("Hans", "Meyer", 333);
        Student student2 = new Student("Felix", "Müller", 5564);
        Student student3 = new Student("Moritz", "Kussauer", 4456);
        Student student4 = new Student("Simone", "Zügner", 555477);
        Student student5 = new Student("Kurt", "Kussauer", 7789);

        students.put("333", student1);
        students.put("5564", student2);
        students.put("4456", student3);
        students.put("555477", student4);
        students.put("7789", student5);

        School school = new School();
        school.addStudent("333", student1);
        school.addStudent("5564", student2);
        school.addStudent("4456", student3);
        school.addStudent("555477", student4);
        school.addStudent("7709", student5);

        school.printStudentList();

        school.searchStudent("4456");

        school.deleteStudent("5564");

        System.out.println(school);

       // school.deleteStudent("Hans", "Meyer");

        System.out.println(school);
    }
}
