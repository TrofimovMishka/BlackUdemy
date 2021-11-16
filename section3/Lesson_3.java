package org.example.udemy.section3;

import java.util.ArrayList;

class Lesson_3 {       // !!!!!!!!!Parametrized method!!!!!!!!!!!!
    public static void main(String[] args) {
        ArrayList<Integer> integrs = new ArrayList<>();
        integrs.add(2);
        integrs.add(4);
        integrs.add(66);
        int a = GenMethod.getSecondElem(integrs);
        System.out.println(a);

        ArrayList<String> integrs2= new ArrayList<>();
        integrs2.add("gooo");
        integrs2.add("Yahoo");
        integrs2.add("Hello");
        String b = GenMethod.getSecondElem(integrs2);
        System.out.println(b);



    }

}

class GenMethod{
    public static <T> T getSecondElem(ArrayList<T> al){
        return al.get(1);
    }
}

