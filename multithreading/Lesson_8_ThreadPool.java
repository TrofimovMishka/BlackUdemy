package org.example.udemy.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Lesson_8_ThreadPool {         // and ExecutorService
    public static void main(String[] args) throws InterruptedException {
        //Создание пула с 5тью thread внутри
        ExecutorService executorService =  Executors.newFixedThreadPool(5);

        //Создание пула с 1 thread внутри
//        ExecutorService executorService = Executors.newSingleThreadExecutor();


        //Создание пула с динамическим созданием thread-ов внутри
//        ExecutorService executorService = Executors.newCachedThreadPool();


        for (int i = 0; i < 10; i++) {

            executorService.execute(new RunnableImp100()); //Передаем в пул работу класа RunnableImp100
        }
        executorService.shutdown(); // Закончи работу пула. Если не добавить - то пул будет ждать новых заданий
        executorService.awaitTermination(5, TimeUnit.SECONDS);  // Работает как join - main поток ждет указанное
                                                                        // время пока пул завершит работу.
        System.out.println("Main ends");
    }
}

class RunnableImp100 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());  // Выведем имя потока которое работает сейчас с методом run
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}