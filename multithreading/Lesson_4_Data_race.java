package org.example.udemy.multithreading;

class Lesson_4_Data_race {

    // получаем не правильное значение в следствии одновремменного доступа к переменной с разных потоков - это ошибка
    public static void main(String[] args) {
        MyRannable myRannable = new MyRannable();
        Thread thread1 = new Thread(myRannable);
        Thread thread2 = new Thread(myRannable);
        Thread thread3 = new Thread(myRannable);
        thread1.start();
        thread2.start();
        thread3 .start();

    }
}
class Counter{
    static int count = 0;
}
class MyRannable implements Runnable{
   public void increment(){
       Counter.count++;
       System.out.print(Counter.count + " ");
   }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
