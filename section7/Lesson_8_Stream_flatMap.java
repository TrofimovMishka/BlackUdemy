package org.example.udemy.section7;

import java.util.ArrayList;
import java.util.List;

class Lesson_8_Stream_flatMap {
    public static void main(String[] args) {
        Student kira = new Student("Kira", 'f', 23, 1, 8.9);
        Student ola = new Student("Ola", 'f', 22, 3, 8.2);
        Student monika = new Student("Monika", 'f', 23, 2, 7.1);
        Student jessi = new Student("Jessi", 'f', 24, 4, 8.7);
        Student john = new Student("John", 'm', 22, 3, 7.7);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");
        f1.addStudToFaculty(kira);
        f1.addStudToFaculty(ola);
        f1.addStudToFaculty(monika);
        f2.addStudToFaculty(jessi);
        f2.addStudToFaculty(john);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);
        // для операций над элементами элементов этого листа будем исп. метод flatMap:
        //в метод flatMap - засовываем List faculties и вызываем из него лист со студентами
        //используя метод getStudentOnFaculty и преобразуем уже этот лист в stream
        // уже к этому stream пользуем метод forEach для вывода имён всех студентов используя метод getName.
        faculties.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream()).forEach( elem -> System.out.println(elem.getName()));


    }
}
class Faculty{
    String name;
    List<Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public void addStudToFaculty(Student stud){
        studentOnFaculty.add(stud);
    }
}
