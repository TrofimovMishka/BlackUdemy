package org.example.udemy.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

class Lesson_10_Stream_some_methods {
                                           //findFirst, min, max, limit, skip, mapToInt(sum, average, min, max), boxed
    public static void main(String[] args) {
        Student kira = new Student("Kira", 'f', 23, 1, 8.9);
        Student ola = new Student("Ola", 'f', 22, 2, 8.2);
        Student monika = new Student("Monika", 'f', 23, 3, 7.1);
        Student jessi = new Student("Jessi", 'f', 24, 4, 8.7);
        Student john = new Student("John", 'm', 25, 2, 7.7);

        List<Student> students = new ArrayList<>();
        students.add(kira);
        students.add(ola);
        students.add(monika);
        students.add(jessi);
        students.add(john);

//        Student first = students.stream().map(ele ->
//        {
//            ele.setName(ele.getName().toUpperCase());
//            return ele;
//        })
//                .filter(ele -> ele.getSex()=='f')
//                .sorted((x, y) -> x.getAge() - y.getAge())
//                .findFirst().get();                             // Вывод первого елемента из потока выбранных елементов
//        System.out.println(first);

        // Find min student
//        Student min = students.stream().min((x, y)-> x.getAge() - y.getAge()).get();
//        System.out.println(min);

//         //Find max student
//        Student max = students.stream().max((x, y)-> x.getAge() - y.getAge()).get();
//        System.out.println(max);

//        // Use method limit and skip:
//        students.stream().filter(ele -> ele.getAge()>22).forEach(System.out::println);
//        System.out.println("------------------------------------------------------------------------");
//        students.stream().filter(ele -> ele.getAge()>22).limit(2).forEach(System.out::println); //выводим 2х первых после метода filter
//        System.out.println("------------------------------------------------------------------------");
//        students.stream().filter(ele -> ele.getAge()>22).skip(2).forEach(System.out::println); //выводим 2х оставшихся после метода filter

        // Use method mapToInt:
        List<Integer> list = students.stream().mapToInt(elem -> elem.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(list);
        int sum = students.stream().mapToInt(ele -> ele.getCourse()).sum(); // return int
        double average = students.stream().mapToInt(ele -> ele.getCourse()).average().getAsDouble(); // return double
        int min = students.stream().mapToInt(ele -> ele.getCourse()).min().getAsInt(); // min return Optional int
        int max = students.stream().mapToInt(ele -> ele.getCourse()).max().getAsInt(); // max return Optional int


    }
}
