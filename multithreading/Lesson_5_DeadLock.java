package org.example.udemy.multithreading;

class Lesson_5_DeadLock {   //Симуляция ситуации когда 2 потока ждут друг друга до бесконечности - DEADLOCK
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: - Попытка захватить монитор об.lock1");
        synchronized (Lesson_5_DeadLock.lock1){              //!!!!!!!!!!!!!!!!!!!!
            System.out.println("Thread10: - Mонитор об.lock1 захвачен");
            System.out.println("Thread10: - Попытка захватить монитор об.lock2");
            synchronized (Lesson_5_DeadLock.lock2){          //!!!!!!!!!!!!!!!!!!!!
                System.out.println("Thread10: - Mониторы об.lock1 и об.lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: - Попытка захватить монитор об.lock2");
        synchronized (Lesson_5_DeadLock.lock2){            //!!!!!!!!!!!!!!!!!!!!
            System.out.println("Thread20: - Mонитор об.lock2 захвачен");
            System.out.println("Thread20: - Попытка захватить монитор об.lock1");
            synchronized (Lesson_5_DeadLock.lock1){         //!!!!!!!!!!!!!!!!!!!!
                System.out.println("Thread20: - Mониторы об.lock1 и об.lock2 захвачены");
            }
        }
    }
}