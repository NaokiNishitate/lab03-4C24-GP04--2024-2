package com.tecsup.lab03.controller;

import java.util.ArrayList;
import java.util.List;

public class StudentReport {

    // Clase interna para representar un estudiante
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    // Lista de estudiantes
    List<Student> students = new ArrayList<>();

    // Método para agregar un estudiante
    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    // Método para mostrar el reporte
    public void printReport() {
        System.out.println("===== Reporte de Estudiantes =====");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.grade);
        }
    }

    public static void main(String[] args) {
        StudentReport report = new StudentReport();
        report.addStudent("Juan Pérez", 18.5);
        report.addStudent("Ana Gómez", 19.0);
        report.addStudent("Luis Torres", 17.8);
        report.printReport();
    }
}
