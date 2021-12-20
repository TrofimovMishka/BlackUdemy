package org.example.udemy.multithreading;

class Lesson_2_Method_classThread_1 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println("Name thread: " + myThread5.getName() +"\n"+
                " Priority of thread: " + myThread5.getPriority());
        MyThread5 myThread6 = new MyThread5();

//        System.out.println("Name thread: " + myThread6.getName() +"\n"+
//                " Priority of thread: " + myThread6.getPriority());
        myThread6.setName("My thread");

        myThread6.setPriority(Thread.MAX_PRIORITY);
        myThread6.setPriority(10); // or set like this one


        System.out.println("Name thread: " + myThread6.getName() +"\n"+
                " Priority of thread: " + myThread6.getPriority());


        System.out.println("Tread name: " + Thread.currentThread().getName()); // return name this thread

    }
}
class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
