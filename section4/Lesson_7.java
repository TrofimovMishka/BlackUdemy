package org.example.udemy.section4;

import java.util.Stack;
import java.util.Vector;

class Lesson_7 {  // big O notation

    public static void main(String[] args) {
//        Vector<String> stringVector = new Vector<>();
//        stringVector.add("Monika");
//        stringVector.add("Kira");
//        stringVector.add("Ola");
//
//        System.out.println(stringVector.firstElement());

        System.out.println("main starts");
        abc3();
        System.out.println("main ends");

        Stack<String> stringStack = new Stack<>();
        stringStack.add("Monika");
        stringStack.add("Kira");
        stringStack.add("Ola");

        System.out.println(stringStack);
        System.out.println( stringStack.pop());
        System.out.println(stringStack);


    }
    static  void abc1(){
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");

    }
    static  void abc2(){
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");

    }
    static  void abc3(){
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");

    }


}
