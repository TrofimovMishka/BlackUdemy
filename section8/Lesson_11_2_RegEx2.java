package org.example.udemy.section8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Lesson_11_2_RegEx2 {
    public static void main(String[] args) {
//      String s1 = "ABCD ABCE ABCFABCGABCH";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("ABC");         // шаблон поиска

//        String s1 = "OWUGOQWGAOIHCPIOB";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("[ABC]");         // шаблон поиска

//        String s1 = "ABDOPABCOP";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");         // шаблон поиска

//        String s1 = "abcd abce abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");         // шаблон поиска

//        String s1 = "abcd abce abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("abc(e|5)");         // шаблон поиска

//        String s1 = "abcd abce abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("abc.");         // шаблон поиска

//        String s1 = "abcd abce abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("^abc");         // шаблон поиска

//        String s1 = "abcd abce abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("bch$");         // шаблон поиска

//        String s1 = "abcd abce abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("\\d");         // шаблон поиска

//        String s1 = "abcd-abce+abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("\\W");         // шаблон поиска

//        String s1 = "abcd-abce+abc5abcg6abch";               // где ищем шаблон
//        Pattern pattern1 = Pattern.compile("\\w{3,}");         // шаблон поиска

        String s1 = "abcd-abce5+abc5abcg6abch";               // где ищем шаблон
        Pattern pattern1 = Pattern.compile("\\w{5}");         // шаблон поиска

        Matcher matcher = pattern1.matcher(s1);
        while(matcher.find()){                              // true если найдены совпадения
            System.out.print("Position: "+ matcher.start() +"   "); // start() -> index соответствия
            System.out.println(matcher.group());            // group() -> возвращает совпадение

        }
    }
}
