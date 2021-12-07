package org.example.udemy.section8;

class Lesson_11_5_ReplaceAll {
    public static void main(String[] args) {
        String s1 = "Hello,     imy  friend    How are     iyou!   Java  ?";

        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll(" {2,}", " "); //заменить 2 и более пробела на один
//        s1 = s1.replaceAll("\\bi\\w+", "4444");  // заменить слова начинаются на i
        s1 = s1.replaceFirst("\\bi\\w+", "4444");
        System.out.println(s1);
    }
}
