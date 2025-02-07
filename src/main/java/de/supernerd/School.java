package de.supernerd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class School {
    Map<String, Student> students;

    public School() {
        students  = new HashMap<>();
    }

    public void addStudent(String key, Student student) {
        students.put(key, student);
    }

//    public void searchStudent(int studentId){
//
//        boolean found = false;
//
//        for(Student obj : students) {
//            if(obj.getStudentId() == studentId) {
//                System.out.println("Student wurde gefunden!");
//                System.out.println(obj);
//                found = true;
//                break;
//            }
//        }
//
//        if(!found) {
//            System.out.println("Student nicht gefunden!");
//        }
//    }


    public void searchStudent(String studentId) {
        if(students.containsKey(studentId)) {
            System.out.println(students.get(studentId));
        }
    }

    public void deleteStudent(String studentId) {
        if(students.containsKey(studentId)) {
            students.remove(studentId);
            System.out.println("Student wurde gelöscht!");
        } else {
            System.out.println("Student wurde nicht gefunden!");
        }
    }

//    public void deleteStudent(int studentId) {
//
//        Student deletedStudent = null;
//
//        for(Student obj : students) {
//            if(obj.getStudentId() == studentId) {
//                students.remove(obj);
//                deletedStudent = obj;
//                break;
//            }
//        }
//
//        if(deletedStudent == null) {
//            System.out.println("Student wurde nicht gelöscht, weil nicht vorhanden!");
//        } else {
//            System.out.println("Student " + deletedStudent.getFirstName() + " " + deletedStudent.getLastName() + "  wurde gelöscht!");
//        }
//    }



//    public void deleteStudent(String firstName, String lastName) {
//        boolean found = false;
//
//        for(Student obj : students) {
//            if(obj.getFirstName().equals(firstName) && obj.getLastName().equals(lastName)) {
//                deleteStudent(obj.getStudentId());
//                found = true;
//                break;
//            }
//        }
//
//        if(!found) {
//            System.out.println("Student wurde nicht gelöscht, weil nicht vorhanden!");
//        }
//    }


    public void printStudentList() {
        System.out.println(students);
    }

    public School(Map<String, Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(students);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
