package org.example.udemy.section6;


import java.util.ArrayList;
import java.util.List;

class Lesson_6 { //Method foreach
    public static void main(String[] args) {
        List<String> list = List.of("hello", "How are you", "Good", "Bye");

        // for print all elements use normal loop for - Method 1
        for(String s: list){
            System.out.print(s+ " ");
        }
        System.out.println("");

        // for print all elements use forEach with interface Consumer - Method 2
        // method forEach do some after "->" for all elements in list
        list.forEach(str -> System.out.print(str+ " "));
        System.out.println("");

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        integers.forEach(someInt -> {
            System.out.print(someInt+ " ");
            someInt *=2;
            System.out.print(someInt + " ");
            System.out.println(" ");
        });

    }

}
