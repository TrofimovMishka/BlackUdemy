package org.example.udemy.section4;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Lesson_12 {
    public static void main(String[] args) {
//        Set<Integer> integerSet = new TreeSet<>();
//        integerSet.add(3);
//        integerSet.add(34);
//        integerSet.add(4);
//        integerSet.add(1);
//        System.out.println(integerSet);
        TreeSet<Student4> treeSet = new TreeSet<>();

        Student4 monika = new Student4("Monika", 3);
        Student4 kira = new Student4("Kira", 4);
        Student4 kristina = new Student4("Kristina", 2);
        Student4 jira = new Student4("Jira", 1);

        treeSet.add(monika);
        treeSet.add(kira);
        treeSet.add(kristina);
        treeSet.add(jira);


        System.out.println(treeSet);

    }
}

class Student4 implements Comparable<Student4> {
    String name;
    int cours;

    @Override
    public String toString() {
        return "Student4{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }

    public Student4(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student4 = (Student4) o;
        return cours == student4.cours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cours);
    }

    @Override
    public int compareTo(Student4 o) {
        return this.cours - o.cours;
    }
}
