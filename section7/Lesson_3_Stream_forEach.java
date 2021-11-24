package org.example.udemy.section7;

import java.util.Arrays;

class Lesson_3_Stream_forEach {
    public static void main(String[] args) {
        // Использование метода forEach для прохождению по массиве и какието действия с каждыи из элементов
        int[] array = {2, 9, 4, 6, 1, 5};
        Arrays.stream(array).forEach(elem -> {
            elem *= 2;
            System.out.print(elem+" ");
        });
        System.out.println("");

        //Использование метода для просто вывода:
        Arrays.stream(array).forEach(elem -> System.out.print(elem+"'"));

        //Использование метода для просто вывода:
        Arrays.stream(array).forEach(System.out::println);

        //Использование метода для использования метода из класса Utils:
        Arrays.stream(array).forEach(Utils::myMethod);

    }
}
class Utils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element = "+a);
    }
}
