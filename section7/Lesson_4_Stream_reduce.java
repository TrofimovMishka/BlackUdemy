package org.example.udemy.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Lesson_4_Stream_reduce {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(8);
        integers.add(9);
        integers.add(2);
        integers.add(6);

        //метод reduce возвращает обьект Optional и чтобы получить из него значение используем метод .get()
       int result = integers.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);

        //Чтобы не получилось ситуации что мы int-у передаем null - для начала проверим Optional на наличие
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> opti = list100.stream().reduce((accumulator, element) -> accumulator*element); // return object Optional
        //Проверим объертку нет ли там null:
        if(opti.isPresent()){
            System.out.println(opti.get()); //  Если нет null - то вернем значение
        }
        else {
            System.out.println("Not present");
        }

        //Метод 2 для метода reduce:
        int result2 = integers.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println(result2);

        //Произведем конкатинацию(сумму) всех строк из Листа:
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("John");
        list.add("Lucia");

        String summaryString = list.stream().reduce("", (accum, elem) -> accum+" "+elem);
        System.out.println(summaryString);
    }
}
