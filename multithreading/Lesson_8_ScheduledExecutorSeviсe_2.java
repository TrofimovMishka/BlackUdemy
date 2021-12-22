package org.example.udemy.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Lesson_8_ScheduledExecutorServiсe_2 {      // Используется если необходимо расписание запуска потоков
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // Method scheduleAtFixedRate - для запуска пула через 3 секунды с периодичностью в 1 секунду
        scheduledExecutorService.scheduleAtFixedRate(new org.example.udemy.multithreading.RunnableImp300(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        scheduledExecutorService.shutdown();  // stop thread
    }
}

class RunnableImp300 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");  // Выведем имя потока которое работает сейчас с методом run

        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}

