package org.example.udemy.section4;

import java.util.ArrayList;
import java.util.Objects;

class Lesson_1 {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>(200);
//        list1.add("Mika");
//        list1.add("Nika");
//        list1.add("Monika");
//        System.out.println(list1);
//        ArrayList<String> list2 = new ArrayList<>(list1);
//        System.out.println(list2);
//        System.out.println(list1==list2);
//        list1.add(1, "Kira");
//        System.out.println(list1.get(3));
//        list1.set(0, " Lucia");
//        System.out.println(list1);

        Student student1 = new Student("Monika", 'f', 21, 3, 8.5);
        Student student2 = new Student("Nika", 'f', 22, 3, 7.5);
        Student student3 = new Student("Sonia", 'f', 20, 2, 9.5);
        Student student4 = new Student("Ania", 'f', 21, 2, 6.5);
        Student student5 = new Student("Kira", 'f', 23, 4, 9.5);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        System.out.println(arrayList);
        Student student6 = new Student("Kira", 'f', 23, 4, 9.5);
       // arrayList.remove(student6);    // not remove this object because this object is not in arraylist(use equals method).
                                         // override this method if we wonna delet some object--***--
                                         // after override method equals - object hoo has some parametr, was delete.
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(student6));  // after override method equals -> 4, before -> -1
        System.out.println(arrayList.contains("Ania"));

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override                                   // create this method use hotkey Alt+Insert
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

   }


