package org.example.udemy.section5;

class Lesson_5 {      // Anonymous inner class
    public static void main(String[] args) {
        Math3 math3 = new Math3(){    // exsample use anonymous class!!! first step (// can use normal class if it need)
            int a =0;                 // body
            void abc(){};             // anonymous
            @Override                  //  class
            public int doOperand(int a, int b) { //
                return a+b;              //
            }
        };     // exsample use anonymous class!!! last step
        System.out.println(math3.doOperand(21, 7));
    }
}
interface  Math3{                        // can use normal class if it need
    int doOperand(int a, int b);
}
