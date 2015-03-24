package ru.kpfu.itis.group408.sabirov.queue;

/**
 * Created by Тимур on 23.03.2015.
 */
public class Faculty {
    Student[] students;

    public Faculty(int size){
        students = new Student[size];
    }

    private class Student{

        private String name;
        private int age;
        private int grade;

        Student(String name){
            this.name = name;
            this.age = (int) ((Math.random() * 6) + 18);
            this.grade = (int) (Math.random() * 100);
        }

    }

}
