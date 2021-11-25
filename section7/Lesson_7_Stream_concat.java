package org.example.udemy.section7;

import java.util.stream.Stream;

class Lesson_7_Stream_concat {                                     // concat, distinct, peek
    public static void main(String[] args) {
        Stream<Integer>  stream1 = Stream.of(9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9);
        Stream<Integer>  stream2 = Stream.of(9,8,7,6,7,8,9);
        Stream<Integer>  stream3 = Stream.of(4,3,2,1,8,9);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3); // объеденим 2 потока в один
//        stream4.forEach(System.out::println);                      // и выведем его

//        stream1.distinct().forEach(System.out::println); // создадим поток уникальных элементов из др.потока и выведем его

//!!!!!!!!!!! так как мы уже использовали stream1 строкой выше б мы не можем использовать его повторно еще раз.!!!!!!

//        System.out.println(stream1.count()); // подсчитаем кол-во элементов
//        System.out.print(stream1.distinct().count()); // подсчитаем кол-во уникальных элементов

        //Используем peak для подсмотра что стало после метода distinct
        System.out.print(stream1.distinct().peek(System.out::println).count());


    }
}
