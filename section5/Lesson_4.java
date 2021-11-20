package org.example.udemy.section5;

class Lesson_4 { // Тaк тоже можно использовать local inner nested classб но нужно использовать Anonymous inner class!!!
    public static void main(String[] args) {
        class Slozenie implements Math2{
            @Override
            public int doOperand(int a, int b) {
                return a+b;
            }
        }
        Slozenie slozenie = new Slozenie();
        System.out.println(slozenie.doOperand(5,3));
    }
}
interface  Math2{
    int doOperand(int a, int b);
}
