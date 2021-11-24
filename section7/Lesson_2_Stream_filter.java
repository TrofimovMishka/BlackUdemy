package org.example.udemy.section7;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Lesson_2_Stream_filter {
    public static void main(String[] args) {

        Student kira = new Student("Kira", 'f', 23, 1, 8.9);
        Student ola = new Student("Ola", 'f', 22, 3, 8.2);
        Student monika = new Student("Monika", 'f', 23, 2, 7.1);
        Student jessi = new Student("Jessi", 'f', 24, 4, 8.7);
        Student john = new Student("John", 'm', 22, 3, 7.7);

        List<Student> students = new ArrayList<>();
        students.add(kira);
        students.add(ola);
        students.add(monika);
        students.add(jessi);
        students.add(john);

//        //Используем метод filter для того чтобы отфильтровать студентов по возрасту и средней оценке:
//        students = students.stream().filter(elem ->
//                elem.getAge() > 22 && elem.getAvgGrade() < 7.2).collect(Collectors.toList()); // фильтруем и студенты которые подойдут по предикату - останутся
//                                                                                                   //в новосозданном потоке метода filter и пререзапишем наш лист со студентами
        // Используем метод sorted для сортировки наших студентов:
        List<Student> students1 = new ArrayList<>();
        // Но для этого в параметр метода вставляем компаратор(по имени например) в виде лямбды:
        students1 = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students1);

        // Создание потока с нуля:
        Stream<Student> myStream = Stream.of(kira, ola, monika, jessi, john); // это уже поток из того что в параметре метода .of
        myStream.filter(elem ->             // так как это уже поток то метод stream  не нужен
                elem.getAge() > 22 && elem.getAvgGrade() < 7.2);

    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }
}