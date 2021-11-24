package org.example.udemy.section7;

import java.util.Arrays;

class Lesson_5_Stream_sorted {
    public static void main(String[] args) {
        //Use method sorted in stream:
        int [] array = {9, 3, 7, 1, 5, 12, 2};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

    }
}
