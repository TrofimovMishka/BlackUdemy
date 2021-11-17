package org.example.udemy.section4;

import java.util.HashSet;
import java.util.Set;

class Lesson_11 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Monika");
        stringSet.add("Kira");
        stringSet.add("Kristina");
        stringSet.add(null);
        stringSet.remove(null);

        System.out.println(stringSet);
        System.out.println(stringSet.size());

        Set<Integer> integers1 = new HashSet<>();
        integers1.add(5);
        integers1.add(7);
        integers1.add(12);
        integers1.add(54);

        Set<Integer> integers2 = new HashSet<>();
        integers2.add(3);
        integers2.add(8);
        integers2.add(16);
        integers2.add(5);
        integers2.add(7);

        Set<Integer> union = new HashSet<>(integers1);
        union.addAll(integers2);
        System.out.println(union);

        Set<Integer> intersect = new HashSet<>(integers1);
        intersect.retainAll(integers2);
        System.out.println(intersect);

        Set<Integer> subtact = new HashSet<>(integers1);
        subtact.removeAll(integers2);
        System.out.println(subtact);



    }
}
