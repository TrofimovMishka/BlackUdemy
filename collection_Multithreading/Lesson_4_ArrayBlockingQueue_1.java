package org.example.udemy.collection_Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
/*
Пусть будет очередь из 4 еле. Есть производитель - он производит числа - добавлять в конец очереди каждую 1сек
и есть потребитель - забирает из начала очереди каждые 3сек (FIFO)
 */

class Lesson_4_ArrayBlockingQueue_1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
//        queue.add(5); // IllegalStateException: Queue full - так как указаный размер 4
        // Но если использовать метод offer для добавленияб то IllegalStateException не выкинется, и елемент НЕ добавится
        queue.offer(5);
        System.out.println(queue);
    }
}
