package org.example.udemy.section4;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Lesson_10 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student3> hashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student3 student1 = new Student3("Kira", "Frolova", 3);
        Student3 student2 = new Student3("Nika", "Alota", 4);
        Student3 student3 = new Student3("Ola", "Ogtond", 3);
        Student3 student4 = new Student3("Monika", "Gebler", 3);

        hashMap.put(6.9, student1);
        hashMap.put(8.2, student2);
        hashMap.put(7.4, student3);
        hashMap.put(7.5, student4);
//
//        System.out.println(hashMap);
//
//
//        System.out.println(hashMap.get(7.4));
//        System.out.println(hashMap.get(6.9));
//        System.out.println(hashMap);

        Hashtable<Double, Student3> hashtable = new Hashtable<>();
        hashtable.put(6.9, student1);
        hashtable.put(8.2, student2);
        hashtable.put(7.4, student3);
        hashtable.put(7.5, student4);
        System.out.println(hashtable);


    }
}
