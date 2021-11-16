package org.example.udemy.section3;

import java.util.ArrayList;    //!!!!!!!!Generics!!!!!!!!!!!!!
import java.util.List;

class Lesson_1 {
    public static void main(String[] args) {
//        List list = new ArrayList<>();         // not use rotype !!!!!!!
//        list.add("Ok");
//        list.add(6);

        List <String> list = new ArrayList<>();        // Use generics. <> - diamond symbol
        list.add("Hello");
        list.add("Suit");
//        list.add(5); you can't add type not String.
    }

}
