package org.example.udemy.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Lesson_9_Callable_Future_1 {
    /*
    Как найти факториал числа используя Runnable and ExecutorService
     */
    static int factorialRes;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);

        executorService.execute(factorial);
//        // Можем использовать submit и в случае с объектом реализовавшим Runnable
//        Future future = executorService.submit(factorial);
        executorService.shutdown();

        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialRes);
//        System.out.println(future.isDone());

    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Enter wrong number");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        Lesson_9_Callable_Future_1.factorialRes = result;
    }
}
