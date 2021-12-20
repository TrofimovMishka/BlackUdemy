package org.example.udemy.multithreading;

class Lesson_4_synchronized_Block_2 {

    static int count = 0;

//    public static synchronized void increment() {   // При наличии STATIC Неявно используется монитор класа для синхроннизации
//        count++;
//    }

    public static synchronized void increment() {   // При наличии STATIC блок synchronized
        synchronized (Lesson_4_synchronized_Block_2.class){  // должен использовать монитор класа для синхроннизации
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(count);

    }

    static class R2 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        }
    }
}
