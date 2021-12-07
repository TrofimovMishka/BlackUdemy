package org.example.udemy.section8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Lesson_11_1_RegExp1 {
    public static void main(String[] args) {
        String s = " Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789; " +
                " Petrova Mariya, Ukraine, Kiyv, Lomnosov stereet, 33, Flat 18, " +
                " email masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321; " +
                "Chuck Norris, USA, Hollywoood, All strs street, 87, Flat21, " +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +175363628.";

//        Pattern pattern = Pattern.compile("\\w+");  // ищем одно или более повторение букв, цыфр или _

//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");    //ищем все номера домов и квартир - предположим что они состоят из 2х цыфр
                                                               // \\b граница слова
//        Pattern pattern = Pattern.compile("\\+\\d{9}");   // ищем номера телефонов, + в начале нужно екранировать \,
                                                            // но и этот символ нужно экранировать \ом, вот поэтому у нас в начале \\+

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");   // ищем email - (ru|com) or \\w+
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
