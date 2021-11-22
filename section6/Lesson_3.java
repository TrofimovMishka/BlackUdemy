package org.example.udemy.section6;

import java.util.ArrayList;
import java.util.function.Predicate;

class Lesson_3 {
    public static void main(String[] args) {

        Student2 kira = new Student2("Kira", 'f', 23, 1, 8.9);
        Student2 ola = new Student2("Ola", 'f', 22, 3, 8.2);
        Student2 monika = new Student2("Monika", 'f', 23, 2, 7.9);
        Student2 jessi = new Student2("Jessi", 'f', 24, 4, 8.7);
        Student2 john = new Student2("John", 'm', 22, 3, 7.7);

        ArrayList<Student2> students = new ArrayList<>();
        students.add(kira);
        students.add(ola);
        students.add(monika);
        students.add(jessi);
        students.add(john);

        StudentsInfo useMethod = new StudentsInfo();

        useMethod.testStudents(students, (Student2 s) -> {                              // пример использования лямбда выражения - Predicate
            return s.age < 26;                                                         // пример использования лямбда выражения
        });
        System.out.println("_______________________________________________________________");

        Predicate<Student2> p1 = stud -> stud.avgGrade < 7.8;
        Predicate<Student2> p2 = stud -> stud.sex == 'm';

        useMethod.testStudents(students, p2.and(p1));  //объеденить два предиката с помощью and
        System.out.println("_______________________________________________________________");



    }
}


class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}


class StudentsInfo {
    void testStudents(ArrayList<Student2> studen, Predicate<Student2> pred) {   // use Predicate
        for (Student2 s : studen) {
            if (pred.test(s)) {
                System.out.println(s);
            }
        }
    }
}
