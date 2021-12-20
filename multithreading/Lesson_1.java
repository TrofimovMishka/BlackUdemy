package org.example.udemy.multithreading;

class Lesson_1_Creating_Thread {
    public static void main(String[] args) {
        // Создание не синхронизтрованных потоков. Они никак не связаны
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

        // Method 2 for creating thread
        MyThread3 myThread3 = new MyThread3(); // this object must implements interface Runna ble
        Thread thread = new Thread(myThread3);
        thread.start();


        //Method 3 for creating thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();


        //Method 4 for creating thread
        new Thread(() -> System.out.println("Yahoooo")).start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println(i);
        }
    }

}
