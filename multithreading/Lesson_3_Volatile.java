package org.example.udemy.multithreading;

class Lesson_3_Volatile extends Thread {

    // Concurrency - Asynchronous  || Parallelism - Synchronous

    /////////////////////////  VOLATILE  - изменчивый не постоянный

    volatile boolean b = true; //Чтобы этого избeжать применяем volatile на той переменной

    @Override
    public void run() {
        long counter = 0;
        while(b){
            counter++;
        }
        System.out.println("Loop is fimish, counter = "+ counter);
    }

    public static void main(String[] args) throws InterruptedException {
//        // In case when b is not volatile - program will have infinity loop:
        Lesson_3_Volatile thread = new Lesson_3_Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
//
//        // Потому что при многопоточной работе - значение переменных копируется в CPU кеш,
//        // а мы значение меняем которое хранится thread.b = false;  в кеше другого ядраю и не понятно
//        // когда инфа обновится у другого ядра. Чтобы этого избeжать применяем volatile на той переменной,
//        и тогда значение переменной хранится в main-memory а не в кеше ядра:


    }
}

