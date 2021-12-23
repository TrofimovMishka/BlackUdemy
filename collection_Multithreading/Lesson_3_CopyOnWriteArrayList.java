package org.example.udemy.collection_Multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Lesson_3_CopyOnWriteArrayList {
    public static void main(String[] args) throws InterruptedException {

//        ArrayList<String> strings = new ArrayList<>(); // ConcurrentModificationException

        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();

        strings.add("Monika");
        strings.add("Kira");
        strings.add("Liza");
        strings.add("Elza");
        System.out.println(strings);

        Runnable runnable = () ->{
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            strings.remove(2);
            strings.add("Lora");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(strings);

    }

}
