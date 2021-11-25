package org.example.udemy.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

class Lesson_9_Stream_collect {
    public static void main(String[] args) {

        Student kira = new Student("Kira", 'f', 23, 3, 8.9);
        Student ola = new Student("Ola", 'f', 22, 2, 8.2);
        Student monika = new Student("Monika", 'f', 23, 2, 6.1);
        Student jessi = new Student("Jessi", 'f', 24, 4, 8.7);
        Student john = new Student("John", 'm', 22, 3, 6.7);

        List<Student> students = new ArrayList<>();
        students.add(kira);
        students.add(ola);
        students.add(monika);
        students.add(jessi);
        students.add(john);

//        //Задача1:
//        // Изменим студентам имена на заглавные буквы и отсортируем их по курсам. т.е.для каждого курса свой лист со студентов
//
//        // Помещаем students в стрим, получаем имена и с помощью map setName устанавливаем имена в toUpperCase и возвращаем студентов
//        // с помощью collect(Collectors.groupingBy  - групируем студентов по курсу в отдельные листы.
//        // collect возвращает нам Мар кот.содержит Integer - как ключ(номер курса), и значение - лист студентов.
//       Map<Integer, List<Student>> map =  students.stream().map(ele -> {
//            ele.setName(ele.getName().toUpperCase());
//            return ele;
//        }).collect(Collectors.groupingBy(ele -> ele.getCourse()));

//        //Выведем из Задачи1 в консоль все с этого Мар:
//        for(Map.Entry<Integer, List<Student> > entry: map.entrySet()){
//            System.out.println("Course: "+entry.getKey()+ ": "+entry.getValue().toString());
//        }



        //Задача2:
        //Разделим студентов на 2 группы: те кто получает высокие оценки и те кто получает низкие оценки
        // И на выходе получаем Мар где ключи это true и false. А значения - это студенты которые соответствуют предикату(true) или нет (false)

        Map<Boolean, List<Student>> map = students.stream().collect(Collectors.partitioningBy(ele -> ele.getAvgGrade()>7));

        //Выведем из Задачи2 в консоль все с этого Мар:
        for(Map.Entry<Boolean, List<Student> > entry: map.entrySet()){
            System.out.println("Grade  "+entry.getKey()+ ": "+entry.getValue().toString());
        }


    }
}
