package org.example.udemy.section4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Lesson_5 {
    // Is String palindrom?

    public static void main(String[] args) {
        String s = "odog";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversliterator = list.listIterator(list.size()); // have start from the End
        boolean isPalindrom = true;
        while (iterator.hasNext() && reversliterator.hasPrevious()) {
            if (iterator.next() != reversliterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
            if(isPalindrom){
                System.out.println("Palindrom");
            }
            else {
                System.out.println("Is NOT palindrom");
            }



    }
}
