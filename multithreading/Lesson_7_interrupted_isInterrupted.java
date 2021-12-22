package org.example.udemy.multithreading;

class Lesson_7_interrupted_isInterrupted {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterraptedThread interraptedThread = new InterraptedThread();
        interraptedThread.start();
        Thread.sleep(2000);
        interraptedThread.interrupt();
        interraptedThread.join();
        System.out.println("Main ends");

    }
}

class InterraptedThread extends Thread{
    double sqrtSum =0;
    @Override
    public void run() {

        for (int i = 0; i < 1000000000; i++) {
            if(isInterrupted()){
                System.out.println("ЗАпрос на остановку потока");
                return; // прерываем поток
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать пока поток спит");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
