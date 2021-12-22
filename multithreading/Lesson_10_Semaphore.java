package org.example.udemy.multithreading;

import java.util.concurrent.Semaphore;
/*
Для ограничения количества потоков которые могут иметь доступ к ресурсу исп. Semaphore
 */

class Lesson_10_Semaphore {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        Person kira = new Person("Kira", callBox);
        Person marina = new Person("Marina", callBox);
        Person monika = new Person("Monika", callBox);
        Person elza = new Person("Elza", callBox);
        Person liza = new Person("Liza", callBox);
    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();              // после создания сразу запускать
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " wait...");
            callBox.acquire();    //Попытка получить разрешение от Semaphore. Если доступа нет -
                                  // блокирует поток до получания разрешения, после получения
                                  // разрешения уменьшает счетчик Semaphore на 1
            System.out.println(name + " use phone");
            sleep(2000);
            System.out.println(name + " finish call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            callBox.release(); // Освобождаем ресурс и увеличиваем счетчик Semaphore на 1
        }
    }
}
