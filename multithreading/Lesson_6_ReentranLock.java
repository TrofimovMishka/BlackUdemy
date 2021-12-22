package org.example.udemy.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Lesson_6_ReentranLock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.watsupCall();
            }
        });

        thread.start();
        thread1.start();
        thread2.start();
    }
}
 class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();  // Заблокируем объект синхронизации
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock(); // write unlock() in finally block!
        }
    }

     void skypeCall(){
         lock.lock();  // Заблокируем объект синхронизации
         try {
             System.out.println("Skype call starts");
             Thread.sleep(5000);
             System.out.println("Skype call ends");

         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         finally {
             lock.unlock(); // write unlock() in finally block!
         }
     }

     void watsupCall(){
         lock.lock();  // Заблокируем объект синхронизации
         try {
             System.out.println("watsup call starts");
             Thread.sleep(7000);
             System.out.println("watsup call ends");

         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         finally {
             lock.unlock(); // write unlock() in finally block!
         }
     }
 }