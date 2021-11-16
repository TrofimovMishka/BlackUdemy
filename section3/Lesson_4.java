package org.example.udemy.section3;


import java.util.ArrayList;
import java.util.List;

class Lesson_4 {
    public static void main(String[] args) {
        X x = new Y();

//        List<Number> list = new ArrayList<Integer>();  do not use - it is wrong!!!!!!!!!
        List<?> list = new ArrayList<Integer>();   // Using wildcard!!!

        List<Double> l1 = new ArrayList<>();
        l1.add(9.88);
        l1.add(4.33);
        l1.add(2.88);

        List<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("grrr");
        l2.add("rokkkoko");

        showListInfo(l1);
        showListInfo(l2);

        ArrayList<Double> dList = new ArrayList<>();
        dList.add(9.88);
        dList.add(4.33);
        dList.add(2.88);

        System.out.println(summ(dList));

    }

    static void showListInfo (List<?> list){
        System.out.println("This is my list: " + list);
    }

    public static double summ(ArrayList<? extends Number> arr){ // method take inside parameter type Number or  subclasses Number class
        double summa = 0;
        for(Number e: arr ){
            summa+=e.doubleValue();
        }
        return summa;
    }
}

class X {

}

class Y extends X {

}
