package org.example.udemy.multithreading;

import java.util.concurrent.*;

class Lesson_9_Callable_Future_2 {
    /*
    Как найти факториал числа используя Callable
     */
    static int factorialRes;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        Future<Integer> future = executorService.submit(factorial2);  // Метод submit - для запуска пула в работу.
        /*
        от метода execute отличется тем что имеет return type и это объект Future<>.
         */
        // получим значение из объекта Future:
        try {
            System.out.println("isDone - "+future.isDone());   // А закончена ли задача и готов ли объект выдать результат
            System.out.println("Wanna get result");
            factorialRes = future.get();  // Преобразовать объект Future в готовый вид
            System.out.println("Get result");
            System.out.println("isDone - "+future.isDone()); // А закончена ли задача и готов ли объект выдать результат

        } catch (ExecutionException e) {
            System.out.println(e.getCause()); //   Причина исключения*
        }finally {
            executorService.shutdown();
        }
        System.out.println(factorialRes);
    }
}

// Разница от интерфейса Runnable  в том что Callable принимает тип параметров
// через дженерик и может выбрсывать исключения. И метод call имеет return
class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Enter incorrect number");  //   Причина исключения*
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
