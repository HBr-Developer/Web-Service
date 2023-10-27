package org.example;

import soaptp.Student;
import soaptp.StudentService;
import soaptp.StudentServiceService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        //test the first methode
      StudentService studentService = new StudentServiceService().getStudentServicePort();
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Full Name: " + student.getName());
            System.out.println("CIN: " + student.getCin());
            System.out.println("Date of Birth: " + student.getBirth());
            System.out.println("Major: " + student.getFiliere());
            System.out.println();
        }
    }
    */



        StudentService studentService2 = new StudentServiceService().getStudentServicePort();
        List<Student> students1 = studentService2.getLimitedStudents(2);
        for (Student student : students1) {
            System.out.println("ID: " + student.getId());
            System.out.println("Full Name: " + student.getName());
            System.out.println("CIN: " + student.getCin());
            System.out.println("Date of Birth: " + student.getBirth());
            System.out.println("Major: " + student.getFiliere());
            System.out.println();
        }
    }

 /*
    StudentService studentService2 = new StudentServiceService().getStudentServicePort();
    Student student = studentService2.getStudentByCIN("AB12345");
   if (student != null) {
        System.out.println("ID: " + student.getId());
        System.out.println("Full Name: " + student.getName());
        System.out.println("CIN: " + student.getCin());
        System.out.println("Date of Birth: " + student.getBirth());
        System.out.println("Major: " + student.getFiliere());
    } else {
        System.out.println("Student not found.");
    }
}*/
}






