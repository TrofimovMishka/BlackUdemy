package org.example.udemy.section7;

import java.util.ArrayList;
import java.util.List;

class Lesson_11_Stream_Parallel_stream {
    public static void main(String[] args) {
        // Example:
        // We have a stream with numbers: 1, 2, 3, 4, 5 ....100000000, find multiply(*) all elements
        // need use Parallel stream:
        //Then 1 core - multiply from 1 to 25000000
        // 2 core - multiply from 25000000 to 50000000
        // 3 core - multiply from 50000000 to 75000000
        // 4 core - multiply from 75000000 to 100000000
        List<Double> doubles = new ArrayList<>();
        doubles.add(10.0);
        doubles.add(5.0);
        doubles.add(1.0);
        doubles.add(0.25);
            // результат одинаков
//        double sum = doubles.parallelStream().reduce((acum, ele)-> acum+ele).get();
//        System.out.println(sum);
//        double sum = doubles.stream().reduce((acum, ele)-> acum+ele).get();
//        System.out.println(sum);

        // Результат деления в parallelStream и stream
//        double division = doubles.stream().reduce((acum, ele)-> acum/ele).get();
//        System.out.println(division);  // --> return 8.0
        double division = doubles.parallelStream().reduce((acum, ele)-> acum/ele).get();
        System.out.println(division);    // --> return 0.5


    }
}
