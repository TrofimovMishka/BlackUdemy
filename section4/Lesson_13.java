package org.example.udemy.section4;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

class Lesson_13 {
    public static void main(String[] args) {
//        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
//    integers.add(9);
//    integers.add(7);
//    integers.add(4);
//        System.out.println(integers);

        Queue<String> strings = new LinkedList<>();
        strings.add("Hello");
        strings.add("Boo");
        strings.add("Food");
        strings.offer("robot");
        strings.remove();

        System.out.println(strings);


    }
}
