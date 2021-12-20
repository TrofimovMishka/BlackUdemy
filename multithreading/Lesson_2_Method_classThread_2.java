package org.example.udemy.multithreading;

class Lesson_2_Method_classThread_2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);  // use for sleep thread
            System.out.println("Name thread: "+ Thread.currentThread().getName() + " "+  i);

        }

        MyThread6 myThread6 = new MyThread6();
        Thread thread = new Thread(myThread6);
        thread.start();
        thread.join();  //  main-thread  wait while thread.join() will finish, when thread-main finish too
//        thread.join(500); - wait 500 milliseconds
         System.out.println("The end");
    }
}

class MyThread6 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(700);  // use for sleep thread, you must use try - catch block, because use interface
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Name thread: "+ Thread.currentThread().getName() + " " + i);

        }
    }
}
