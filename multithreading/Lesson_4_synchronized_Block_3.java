package org.example.udemy.multithreading;

public class Lesson_4_synchronized_Block_3 {
    /*
    Пример - нам могут звонить используя моб.связь, могут по скайп, могут по WatsUp. ПУскай будут 3 потока отвечающие
    за каждый вид связи. Правила такие: Мы не можем ответить на другой звонок во время выполнения какого либо другого
    нужно сначала закончить действующий.
     */

    static final Object LOCK = new Object();  // Use this object for synchronize our methods

    void mobileCall() {
        synchronized (LOCK) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (LOCK) {
            System.out.println("Skype Call call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype Call call ends");
        }
    }

    void whatsupCall() {
        synchronized (LOCK) {
            System.out.println("Whatsup Call call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsup Call call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableMobile());
        Thread thread2 = new Thread(new RunnableSkype());
        Thread thread3 = new Thread(new RunnableWhatssup());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class RunnableMobile implements Runnable {
    @Override
    public void run() {
        new Lesson_4_synchronized_Block_3().mobileCall();
    }
}

class RunnableSkype implements Runnable {
    @Override
    public void run() {
        new Lesson_4_synchronized_Block_3().skypeCall();
    }
}

class RunnableWhatssup implements Runnable {
    @Override
    public void run() {
        new Lesson_4_synchronized_Block_3().whatsupCall();
    }
}

