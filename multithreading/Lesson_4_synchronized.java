package org.example.udemy.multithreading;

class Lesson_4_synchronized {

    // Использование снхронизации доступа к методу многими потоками.
    // Пока один поток работает с методом - все другие не имеют к рему доступа
    // Для этого в сигнатуру метода пишем ключивое слово synchronized
    // Стоит отметить что к переменным НЕЛЬЗЯ применять synchronized
    static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(count);

    }

    static class R implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        }
    }
}
