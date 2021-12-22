package org.example.udemy.multithreading;

class Lesson_5_wait_notify {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(consumer);
        thread.start();
        thread1.start();
    }
}

class  Market{
    private int breadCount =0;
    public synchronized void getBread(){
        while (breadCount<1){
            try {
                wait();         // release (освобождает) monitor and puts the thread into standby mode (режим ожидания)
                                // thread consumer wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Costomer bouth 1 bread");
        System.out.println("Count bread in market = "+ breadCount);
        notify();               //wake up thread, у которого РАНЕЕ был вызван мето wait
    }

    public synchronized void putBread(){
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Production add 1 bread");
        System.out.println("Count bread in market = "+ breadCount);
        notify();
    }
}

class Producer implements Runnable{
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}