package org.example.udemy.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Lesson_8_ScheduledExecutorServiсe_1 {  // Используется если необходимо расписание запуска потоков
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImp200());
//        }
        // Method - schedule   Установим расписание пуска:
        // Выполнить задание RunnableImp200 через 3 секунды:
        scheduledExecutorService.schedule(new RunnableImp200(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();  // stop thread
    }
}
class RunnableImp200 implements Runnable{
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
