package org.example.udemy.section4;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

class Lesson_9 {
    public static void main(String[] args) {
        TreeMap<Double, Student3> studentMap = new TreeMap<>();
        Student3 student1 = new Student3("Kira", "Frolova", 3);
        Student3 student2 = new Student3("Nika", "Alota", 4);
        Student3 student3 = new Student3("Ola", "Ogtond", 3);
        Student3 student4 = new Student3("Kira", "Frolova", 3);
        Student3 student5 = new Student3("Mika", "Rota", 5);
        Student3 student6 = new Student3("Liza", "Geld", 4);
        Student3 student7 = new Student3("Monika", "Gebler", 3);
//        Student3 student8 = new Student3("Monika", "Gebler", 3);


        studentMap.put(6.9, student6);
        studentMap.put(8.2, student3);
        studentMap.put(7.4, student7);
        studentMap.put(7.5, student4);
        studentMap.put(6.3, student2);
        studentMap.put(9.5, student5);
        studentMap.put(5.6, student1);
//        studentMap.put(5.9, student8);


        System.out.println(studentMap);
        System.out.println(studentMap.descendingMap());

//        TreeMap<Student3, Double> studentMap = new TreeMap<>();  // If class Student3 implements interface Comparable
//        TreeMap<Student3, Double> studentMap2 = new TreeMap<>(new Comparator<Student3>() {  // If class Student3 not implements interface Comparable
//            @Override
//            public int compare(Student3 o1, Student3 o2) {
//                return 0; // some code for compare to Students
//            }
//        });

//        Student3 student1 = new Student3("Kira", "Frolova", 3);
//        Student3 student2 = new Student3("Nika", "Alota", 4);
//        Student3 student3 = new Student3("Ola", "Ogtond", 3);
//        Student3 student4 = new Student3("Kira", "Frolova", 3);
//        Student3 student5 = new Student3("Mika", "Rota", 5);
//        Student3 student6 = new Student3("Liza", "Geld", 4);
//        Student3 student7 = new Student3("Monika", "Gebler", 3);
//        Student3 student8 = new Student3("Monika", "Gebler", 3);
//
//
//
//        studentMap.put(student6, 6.9);
//        studentMap.put(student3, 8.2);
//        studentMap.put(student7, 7.4);
//        studentMap.put(student4, 7.5);
//        studentMap.put(student2, 6.3);
//        studentMap.put(student5, 9.5);
//        studentMap.put(student1, 5.6);
//        System.out.println(studentMap);
//        System.out.println(studentMap.containsKey(student8));


    }
}

class Student3 implements  Comparable<Student3> {
    String name;
    String surname;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course && Objects.equals(name, student3.name) && Objects.equals(surname, student3.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public Student3(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public int compareTo(Student3 o) {
        return this.name.compareTo(o.name);
    }

}
