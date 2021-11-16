package org.example.udemy.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Lesson_2 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        StringBuilder c = new StringBuilder("C");
        StringBuilder d = new StringBuilder("D");

        StringBuilder [] array = new StringBuilder[]{a, b, c, d};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("....");
        System.out.println(list);
        array[0]=new StringBuilder("F");
        System.out.println(list);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Liza");
        arrayList1.add("Katia");
        arrayList1.add("Monika");
        arrayList1.add("Kira");
        arrayList1.add("Goood");
        arrayList1.add("Food");
        arrayList1.add("Mania");


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Kira");
        arrayList2.add("Mania");
        arrayList2.add("Monika");

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);
//        System.out.println(arrayList1.containsAll(arrayList2));

//        List<String> list1 = arrayList1.subList(1, 4);
//        System.out.println(list1 );
//        list1.add("Freed");
//        list1.remove("Monika");
//        System.out.println("ArrayList = "+arrayList1);
//        System.out.println("SubList = "+list1);
//
//        String[] array2 = arrayList1.toArray(new String[5]);

        List<Integer> list2 = List.of(3, 7, 9);




    }
}
