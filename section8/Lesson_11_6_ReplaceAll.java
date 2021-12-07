package org.example.udemy.section8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Lesson_11_6_ReplaceAll {
    public static void main(String[] args) {
        String s = "12345678912345680218013;"+
                "34567890098765431125454;" +
                "23456789987654231222987";
        //имеем card number 6543 6788 4321 6555, data - 03/29 cvt - 433
        //Задача:
        //изменим формат стринга: сначала должна идти дата, потом номер карты, потом cvt
        // Пишем патерн для нашего RegExp:
                                        //група  1     2        3       4      5        6       7
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s);

//                                          // группа        5 / 6  1  2  3  4  (7)- устанавливаем порядок который необходим
//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7)); // sout only group 7
        }
    }

}
