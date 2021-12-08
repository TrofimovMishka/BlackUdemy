package org.example.udemy.section8;

import java.util.Scanner;

class Lesson_13_1_Scanner {
    public static void main(String[] args) {

      //////////////////////////// Для работы с консолью ////////////////////////////////////

//        Scanner scanner = new Scanner(System.in); // Для работы с консолью
//        System.out.println("Input number: ");
//        int a = scanner.nextInt();
//        System.out.println("You number: " +a );
//
//        String s = scanner.nextLine();
//        String s2 = scanner.next(); // читает до первого пробела
//        System.out.println(s2);

        ///////////////////////////// Для работы со строками //////////////////////////////////////

        Scanner scanner = new Scanner("Hello me friend \n How are you!");
//        String s = scanner.next(); // Получим строку до первого пробелa
//        String s1 = scanner.nextLine(); // Получим строку до первой новой линии
//        String s2 = scanner.nextLine(); // Получим строку до первой следующей новой линии
//
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);

        // Чтобы исключить exception  по окончанию строки:
//        while(scanner.hasNextLine()){    // Есть ли еще строка?       hasNextInt() - есть ли еще цыфра ...
//            System.out.println(scanner.nextLine());
//        }

        System.out.println(scanner.nextLine().charAt(2));   // Выведем 2ю букву
        scanner.close();



    }
}
