package org.example.udemy.section8;

import java.lang.annotation.*;

class Lesson_15_2_Annotation {
    public static void main(String[] args) throws ClassNotFoundException {

        // Прочитаем информацию из аннотации используя рефлексию

        // Если НЕ использовать @Retention(RetentionPolicy.RUNTIME) - то мы НЕ сможем использовать код нписанный внизу

        Class xiaomiClass = Class.forName("org.example.udemy.section8.Xiaomi"); // Создаем обьект класса Class для рефлексии
        Annotation anntation1 = xiaomiClass.getAnnotation(SmartPhone.class);  // Получаем с помощью этого объекта Анотацию (имя анотации SmartPhone.class)
        // Кастим эту анотацию до SmartPhone:
        SmartPhone sm1 = (SmartPhone)anntation1;
        // Выводим инфу которую несет эта анотация для класса Xiaomi
        System.out.println("Annotation info from Xiaomi class: " +
                sm1.OS() + ", "+ sm1.yearOfCompanyCreation());


        //Тоже самое для класса Iphone
        Class iPhoneClass = Class.forName("org.example.udemy.section8.iPhone"); // Создаем обьект класса Class для рефлексии
        Annotation anntation2 = iPhoneClass.getAnnotation(SmartPhone.class);  // Получаем с помощью этого объекта Анотацию (имя анотации SmartPhone.class)
        // Кастим эту анотацию до SmartPhone:
        SmartPhone sm2 = (SmartPhone)anntation2;
        // Выводим инфу которую несет эта анотация для класса iPhone
        System.out.println("Annotation info from iPhone class: " +
                sm2.OS() + ", "+ sm2.yearOfCompanyCreation());

    }
}

///////////////////////////////////////////// Создание аннотации с полями и применение

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";  //Создание елементов внутри аннотаций, default это то что будет по умолчанию
    int yearOfCompanyCreation() default 2010; // Но можно и поменять эти значения задав в параметре аннотации
    // Елементы могут быть примитивы и массивы, НЕЛЬЗЯ исп. ссылочные типы данных, исключение класс String.
}
@SmartPhone()
class Xiaomi{
    String model;
    double price;
}
@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1998) // Меняем значения по умолчанию на необходимые
class iPhone{
    String model;
    double price;
}