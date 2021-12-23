package org.example.udemy.collection_Multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

class Lesson_2_ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
//        HashMap<Integer, String> map = new HashMap<>(); // Создали мар - при не многопоточной МАР получим - ConcurrentModificationException
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(); // Создали ConcurrentHashMap
        map.put(1, "Kira");
        map.put(2, "Monika");    // заполнили
        map.put(3, "Liza");
        map.put(4, "Elza");
        map.put(5, "Ola");
        System.out.println(map);  // Вывели на екран

        Runnable runnable = () -> {      // Создаем для потока раоту: пройдеся по мар и выведем все ключ знчения
            Iterator<Integer> iterator = map.keySet().iterator(); // ОБРАТИ ВНИМАНИЕ - у мар нет метода iterator
                                                                  // но он есть у SET клюей!!!!!!!
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();    // Получаем ключ
                System.out.println(i + " : " + map.get(i));  // выводим его и его значение map.get(i)
            }
        };

        Runnable runnable2 = () -> { // Работа для второго потока - поспать 300 милис и добавить в мар  новый <K, V>
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Lena");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);

    }

}
