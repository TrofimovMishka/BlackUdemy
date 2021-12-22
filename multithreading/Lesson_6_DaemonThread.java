package org.example.udemy.multithreading;

class Lesson_6_DaemonThread {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user Tread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon thread");
        daemonThread.setDaemon(true);                //Создание потока демона.
        // Программа закончится когда все потоки НЕ демоны выполнят свой код, не дожидаясь пока закончит работу поток демон

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread{
    @Override
    public  void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i ='A'; i<='J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}