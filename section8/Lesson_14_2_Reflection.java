package org.example.udemy.section8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;

class Lesson_14_2_Reflection {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class employeeClass = Class.forName("org.example.udemy.section8.Employee");  //созданиe объекта класса Class

        //Создадим обьект класа Employee
        // до java 11 можно было создать так:
//       Object o = employeeClass.newInstance();    // щас так уже не создают

        // Рекомендуется так:

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor<Employee> constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Employee obj2 = constructor2.newInstance(12, "Kira", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);// Создаем обьект кот получит все методы класа Employee
        method.invoke(obj2, 844.44);  //Вызываем метод класа методом invoke, в параметре1 - это обьект на котором
        //  вызываем и параметр необходимый вызываемому методу.
        System.out.println(obj2);


    }
}
