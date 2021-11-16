package org.example.udemy.section1_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Lesson_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bonia");
        list.add("Maria");
        list.add("Ania");
        list.add("Inna");
        System.out.println("Before sorting:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After sorting:");
        System.out.println(list);

    }
}
