package org.example.udemy.section8;

import java.util.Arrays;

class Lesson_11_3_Matches_Split {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789; " +
                " Petrova Mariya, Ukraine, Kiyv, Lomnosov stereet, 33, Flat 18, " +
                " email masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321; " +
                "Chuck Norris, USA, Hollywoood, All strs street, 87, Flat21, " +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +175363628.";
        String s2 = " chuck@gmail.com ";

        boolean result = s2.matches("\\w+@\\w+.(com|ru)");
        System.out.println(result);

        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
