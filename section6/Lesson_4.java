package org.example.udemy.section6;

import java.util.ArrayList;

class Lesson_4 {                              // Predicate
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("bye");
        strings.add("Mon");
        strings.removeIf(elem -> elem.length()<4);  // use Predicate and lambda
        System.out.println(strings);
    }
}
