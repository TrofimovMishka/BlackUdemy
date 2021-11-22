package org.example.udemy.section6;

class Lesson_2 {
    static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def((String str) -> {                        // lambda expression
            return str.length();
        });
    }
}

interface I {
    int abc(String s);  // abstrackt method
}
