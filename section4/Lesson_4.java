package org.example.udemy.section4;

import java.util.LinkedList;

class Lesson_4 {           // LinkedList
    public static void main(String[] args) {
        Student2 student1 = new Student2("Monika", 3);
        Student2 student2 = new Student2("Nika", 3);
        Student2 student3 = new Student2("Sonia", 2);
        Student2 student4 = new Student2("Ania", 2);
        Student2 student5 = new Student2("Kira", 4);

        LinkedList<Student2> student2s = new LinkedList<>();
        student2s.add(student1);
        student2s.add(student2);
        student2s.add(student3);
        student2s.add(student4);
        student2s.add(student5);

        System.out.println(student2s);

        System.out.println(student2s.get(2));  // output 2 index element

        Student2 student6 = new Student2("Lina", 4);
        Student2 student7 = new Student2("Margo", 3);

        student2s.add(student6); // add to the end linkedList
        student2s.add(1, student7); // add to the 1 index, elements 0 and 2 index - refresh link to elements

    }

}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
