package org.example.udemy.section4;

import java.util.ArrayList;
import java.util.Iterator;

class Lesson_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Liza");
        arrayList1.add("Katia");
        arrayList1.add("Monika");
        arrayList1.add("Kira");
        arrayList1.add("Goood");
        arrayList1.add("Food");
        arrayList1.add("Mania");

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Liza")){
                System.out.println(iterator.next());
            }
        }
    }
}
