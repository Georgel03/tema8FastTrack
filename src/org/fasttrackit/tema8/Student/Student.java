package org.fasttrackit.tema8.Student;

public class Student {

    private String name;

    private int grade;

    static int sumOfGrades = 0;

    static int numOfStud = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        sumOfGrades += grade;
        numOfStud++;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public static double avgStudents() {
        return sumOfGrades / numOfStud;
    }
}
