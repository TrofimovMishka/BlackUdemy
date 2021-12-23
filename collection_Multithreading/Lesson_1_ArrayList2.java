package org.example.udemy.collection_Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Lesson_1_ArrayList2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            source.add(i);
        }

        List<Integer> synchroSource = Collections.synchronizedList(source); //
        Runnable runnable = () -> {
            synchronized (synchroSource) {            // Так как Iterator поддвержен сбоям при работе в многопоточности
                                                     // нужно ставить LOCK на всю коллекцию на время работы итератора
                                                      // для этого синхронизиуем его по synchroSource
                Iterator<Integer> iterator = synchroSource.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> {
            synchroSource.remove(10);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchroSource);
    }
}
