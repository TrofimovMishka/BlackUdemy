package org.example.udemy.section7;

import java.util.*;
import java.util.stream.Collectors;

class Lesson_1_Stream_map {          //Stream example
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Bye");
        strings.add("Nats");

        //Заменим слова в листе на длину этих слова .
        // метод_1 - используюя классический loop for:
//        for (int i = 0; i < strings.size(); i++) {
//            strings.set(i, String.valueOf(strings.get(i).length()));  // заменяем
//
//        }

        // метод_2 - используюя Stream  и метод map. Метод collect - преобразовывает поток -Stream, после метода map  в List - collect(Collectors.toList())
        List<Integer> list = strings.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list);

        // Метод мар для массива:

        int[] array = {2, 9, 4, 6, 1, 5};
        array = Arrays.stream(array).map(element ->      // stream для масива вызывается следующим образом
        {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();    // преобразовать поток в массив

        System.out.println(Arrays.toString(array));  // Метод toString для масива


        // Метод мар для множества - set:

        Set<String> sets = new TreeSet<>(); // Множество отсортированное по умолчанию, поэтому длины в новом set2 будут тоже отсортированы.
        sets.add("Hello");
        sets.add("Bye");
        sets.add("Nats");

        Set<Integer> set2 = sets.stream().map(ele -> ele.length()).collect(Collectors.toSet()); // после мар преобразовываем поток в то что нам неоходимо
        List<Integer> list2 = sets.stream().map(ele -> ele.length()).collect(Collectors.toList()); // например в лист, неотсортированый лист
        System.out.println(set2);


    }
}
