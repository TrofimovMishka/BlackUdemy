package org.example.udemy.section6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Lesson_7 {                             // Use Function interface
    public static void main(String[] args) {

        Student3 kira = new Student3("Kira", 'f', 23, 1, 8.9);
        Student3 ola = new Student3("Ola", 'f', 22, 3, 8.2);
        Student3 monika = new Student3("Monika", 'f', 23, 2, 7.9);
        Student3 jessi = new Student3("Jessi", 'f', 24, 4, 8.7);
        Student3 john = new Student3("John", 'm', 22, 3, 7.7);

        ArrayList<Student3> students = new ArrayList<>();
        students.add(kira);
        students.add(ola);
        students.add(monika);
        students.add(jessi);
        students.add(john);

        StudentsInfo2 useMethod = new StudentsInfo2();

        Function<Student3, Double> f = student3 -> student3.avgGrade;   // Example use Function interface with lambda
        // use method avgOfSmth
        double res = avgOfSmth(students, stud -> stud.avgGrade); // second parametr it is lambda which describes the behavior of the method apply
        System.out.println(res);


    }
    // create method for find  average grade from all students
    private static double avgOfSmth(List<Student3> list, Function<Student3, Double> f){  // use Function interface
        double result = 0;
        for(Student3 st: list){
            result += f.apply(st); // in Function interface in method apply put our student and get his average with double type
        }
        return result/ list.size();
    }
}


class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

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

    public Student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

}

class StudentsInfo2 {
    void testStudents(ArrayList<Student3> studen, Predicate<Student3> pred) {   // use Predicate
        for (Student3 s : studen) {
            if (pred.test(s)) {
                System.out.println(s);
            }
        }
    }
}
