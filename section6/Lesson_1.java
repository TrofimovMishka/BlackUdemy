package org.example.udemy.section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Lesson_1 {
    public static void main(String[] args) {

        Student kira = new Student("Kira", 'f', 23, 1, 8.9);
        Student ola = new Student("Ola", 'f', 22, 3, 8.2);
        Student monika = new Student("Monika", 'f', 23, 2, 7.9);
        Student jessi = new Student("Jessi", 'f', 24, 4, 8.7);
        Student john = new Student("John", 'm', 22, 3, 7.7);

        ArrayList<Student> students = new ArrayList<>();
        students.add(kira);
        students.add(ola);
        students.add(monika);
        students.add(jessi);
        students.add(john);

        Lesson_1 useMethod = new Lesson_1();

//        Collections.sort(students, new Comparator<Student>() {       // use anonymous class for comparator(not create comparator)
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course - o2.course;
//            }
//        });

        Collections.sort(students, (s1, s2) -> s1.course - s2.course);  // use lambda for comparator


        System.out.println(students);
//        useMethod.testStudents(students, new checkOvergrade());                                      //пример 2: не очень хорошее решение
//        System.out.println("_______________________________________________________________");
//        useMethod.testStudents(students, new StudentsCheck() {                                        // пример 3: использование анонимного класа - но и его можно заменить лямбдой
//            @Override
//            public boolean check(Student s) {                                                         // пример 3:
//                return s.age < 30;
//            }
//        });
        System.out.println("_______________________________________________________________");

        useMethod.testStudents(students, (Student s) -> {                              // пример использования лямбда выражения
            return s.age < 26;                                                         // пример использования лямбда выражения
        });
        System.out.println("_______________________________________________________________");

        useMethod.testStudents(students, (Student s) -> {                              // пример использования лямбда выражения
            return s.avgGrade > 8;                                                     // пример использования лямбда выражения
        });
        System.out.println("_______________________________________________________________");

        useMethod.testStudents(students, (Student s) -> {                              // пример использования лямбда выражения
            return s.age > 22 && s.avgGrade > 8 && s.sex == 'f';                       // пример использования лямбда выражения
        });
        System.out.println("_______________________________________________________________");

        useMethod.testStudents(students, s -> s.age < 23);           //short view - лямбда выражения
        // пример использования лямбда выражения


//        Lesson_1 useMethod = new Lesson_1();                                                       // это пример №1
//        useMethod.printStudentsOverGrade(students, 8.2);
//        System.out.println("_______________________________________________________________");
//        useMethod.printStudentsOverAge(students, 23);
//        System.out.println("_______________________________________________________________");
//        useMethod.printStudentsMixCondition(students, 9, 21, 'm');
//        System.out.println("_______________________________________________________________");       // это пример №1


    }

    void testStudents(ArrayList<Student> studen, StudentsCheck sc) {           //пример 2: не очень хорошее решение
        for (Student s : studen) {                                              //пример 2: не очень хорошее решение
            if (sc.check(s)) {                                                   //пример 2: не очень хорошее решение
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> studen, double grade){           // это пример №1
//        for (Student s: studen){
//            if(s.avgGrade < grade){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentsOverAge(ArrayList<Student> studen, int age){                  // это пример №1
//        for (Student s: studen){
//            if(s.age < age){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentsMixCondition(ArrayList<Student> studen, double grade, int age, char sex){     // это пример №1
//        for (Student s: studen){
//            if(s.age > age && s.avgGrade < grade && s.sex == sex ){
//                System.out.println(s);
//            }
//        }
//
//    }


}

class Student {
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

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

}

interface StudentsCheck {
    boolean check(Student s);  // abstrackt method
}

class checkOvergrade implements StudentsCheck {                                   //пример 2: не очень хорошее решение - можно заменить анонимным класом
    @Override                                                                     //пример 2: не очень хорошее решение
    public boolean check(Student s) {
        return s.avgGrade > 8;                                                     //пример 2: не очень хорошее решение
    }
}
