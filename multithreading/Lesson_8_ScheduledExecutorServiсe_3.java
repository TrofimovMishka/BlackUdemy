package org.example.udemy.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Lesson_8_ScheduledExecutorServiсe_3 {      // Используется если необходимо расписание запуска потоков
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // Method scheduleWithFixedDelay - для запуска пула через 3 секунды с периодичностью между задачами в 1 секунду
        scheduledExecutorService.scheduleWithFixedDelay(new org.example.udemy.multithreading.RunnableImp400(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        scheduledExecutorService.shutdown();  // stop thread
    }
}

class RunnableImp400 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");  // Выведем имя потока которое работает сейчас с методом run
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}

