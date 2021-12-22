package org.example.udemy.multithreading;

import javax.crypto.CipherInputStream;
import java.util.concurrent.CountDownLatch;

class Lesson_11_CountDownLatch {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();  // Уменьшаем на единицу счетчик -> CountDownLatch(2)
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();  // Уменьшаем на единицу счетчик -> CountDownLatch(1)
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();  // Уменьшаем на единицу счетчик -> CountDownLatch(0) - можна пускать потоки в работу с ресурсом
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Kira", countDownLatch);
        new Friend("Ola", countDownLatch);
        new Friend("Lena", countDownLatch);
        new Friend("Monika", countDownLatch);
        new Friend("Liza", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();

    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();  // start thread
    }

    @Override
    public void run() {
        try {
            countDownLatch.await(); // Попытка доступа к ресурсу - если счетчик не 0 - поток блокируется и ожидает 0 от счетчика
            System.out.println(name + " Start bouth in market");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

