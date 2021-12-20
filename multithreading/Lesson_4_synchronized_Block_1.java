package org.example.udemy.multithreading;

class Lesson_4_synchronized_Block_1 {

    public static void main(String[] args) {
        MyRannable2 myRannable = new MyRannable2();
        Thread thread1 = new Thread(myRannable);
        Thread thread2 = new Thread(myRannable);
        Thread thread3 = new Thread(myRannable);
        thread1.start();
        thread2.start();
        thread3 .start();

    }
}
class Counter2{
    static int count = 0;
}
class MyRannable2 implements Runnable{
    public void doWork1(){
        synchronized (this) {                  // synchronize block - this - это обьект этого класа где исп.блок
            Counter2.count++;                  // вместо this можно писать монитор какого объекта используем для синхронизации
            System.out.print(Counter2.count + " ");
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
