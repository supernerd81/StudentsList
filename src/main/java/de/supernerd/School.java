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

    public void searchStudent(int studentId){

        boolean found = false;

        for(Student obj : students) {
            if(obj.getStudentId() == studentId) {
                System.out.println("Student wurde gefunden!");
                System.out.println(obj);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student nicht gefunden!");
        }
    }

    public void deleteStudent(int studentId) {

        Student deletedStudent = null;

        for(Student obj : students) {
            if(obj.getStudentId() == studentId) {
                students.remove(obj);
                deletedStudent = obj;
                break;
            }
        }

        if(deletedStudent == null) {
            System.out.println("Student wurde nicht gelöscht, weil nicht vorhanden!");
        } else {
            System.out.println("Student " + deletedStudent.getFirstName() + " " + deletedStudent.getLastName() + "  wurde gelöscht!");
        }
    }

    public void deleteStudent(String firstName, String lastName) {
        boolean found = false;

        for(Student obj : students) {
            if(obj.getFirstName().equals(firstName) && obj.getLastName().equals(lastName)) {
                deleteStudent(obj.getStudentId());
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student wurde nicht gelöscht, weil nicht vorhanden!");
        }
    }


    public void printStudentList() {
        System.out.println(students);
    }

    public School(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
