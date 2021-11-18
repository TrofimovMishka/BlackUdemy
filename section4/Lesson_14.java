package org.example.udemy.section4;

import java.util.Objects;
import java.util.PriorityQueue;

class Lesson_14 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(8);
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(43);

//        System.out.println(priorityQueue.peek());
        Student5 student1 = new Student5("Monika", 5);
        Student5 student2 = new Student5("Nika", 4);
        Student5 student3 = new Student5("Sonia", 3);
        Student5 student4 = new Student5("Ania", 2);
        Student5 student5 = new Student5("Kira", 1);

        PriorityQueue<Student5> studQueue = new PriorityQueue<>();
        studQueue.add(student1);
        studQueue.add(student2);
        studQueue.add(student3);
        studQueue.add(student4);
        studQueue.add(student5);
        System.out.println(studQueue);
        System.out.println(priorityQueue.poll());


    }
}

class Student5 implements Comparable <Student5>{
    String name;
    int course;

    public Student5(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student5 student5 = (Student5) o;
        return course == student5.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student5 o) {
        return this.course - o.course;
    }
}
