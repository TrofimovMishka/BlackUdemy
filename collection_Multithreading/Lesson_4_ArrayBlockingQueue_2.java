package org.example.udemy.collection_Multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class Lesson_4_ArrayBlockingQueue_2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);

        // Производитель
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(i++);
                    System.out.println("Producer add number " + i +" "+ queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer eat number " + j+" "+ queue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
