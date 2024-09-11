package com.tecsup.lab03.controller;

import java.util.ArrayList;
import java.util.List;

// Clase que representa el informe de estudiantes
public class StudentReport {

    // Clase interna para representar a un Estudiante
    public static class Student {
        private String name;
        private int age;
        private double grade;

        // Constructor del estudiante
        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Getters para obtener la información del estudiante
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGrade() {
            return grade;
        }
    }

    // Lista para almacenar los estudiantes
    private List<Student> students;

    // Constructor que inicializa la lista de estudiantes
    public StudentReport() {
        students = new ArrayList<>();
    }

    // Método para agregar un estudiante al reporte
    public void addStudent(String name, int age, double grade) {
        Student student = new Student(name, age, grade);
        students.add(student);
    }

    // Método para imprimir el reporte de estudiantes
    public void printReport() {
        System.out.println("===== Reporte de Estudiantes =====");
        for (Student student : students) {
            System.out.println("Nombre: " + student.getName());
            System.out.println("Edad: " + student.getAge());
            System.out.println("Nota: " + student.getGrade());
            System.out.println("---------------------------------");
        }
    }

    // Método principal para ejecutar el reporte como ejemplo
    public static void main(String[] args) {
        StudentReport report = new StudentReport();

        // Agregar algunos estudiantes al reporte
        report.addStudent("Juan Pérez", 20, 18.5);
        report.addStudent("Ana Gómez", 22, 19.0);
        report.addStudent("Luis Torres", 21, 17.8);

        // Imprimir el reporte
        report.printReport();
    }
}
