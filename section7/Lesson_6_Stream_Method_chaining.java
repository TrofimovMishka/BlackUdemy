package org.example.udemy.section7;

import java.util.Arrays;

class Lesson_6_Stream_Method_chaining {
    public static void main(String[] args) {
        // найдем только нечетные числа, потом поделим на 3 только те числа что делятся на 3 без остатка,
        // и найдем сумму оставшихся чисел
        int[] nums = {1, 9, 2, 6, 3, 7, 4, 5, 12, 8};
       int result = Arrays.stream(nums).filter(e -> e % 2 == 1)    //найдем только нечетные числа
                .map(e -> {                            //потом поделим на 3 только те числа что делятся на 3 без остатка
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((acum, ele) -> acum + ele)          //найдем сумму оставшихся чисел
                .getAsInt();                          //вернем все как int

        System.out.println(result);
    }
}

