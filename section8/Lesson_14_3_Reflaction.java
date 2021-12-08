package org.example.udemy.section8;

import java.lang.reflect.Field;

class Lesson_14_3_Reflaction {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        // Хотим прочитать private поле класа:
        Employee emp1 = new Employee(10, "Monika", "HR"); // Создаем обьект класа
        Class employeeClass = emp1.getClass();   // Создаем обьект класа Class
        Field field = employeeClass.getDeclaredField("salary");   //  Создаем обьект класа Field c помощью объекта класа Class

        field.setAccessible(true);   // Устанавливаем возможность доступа в private поле класа на true

        double salaryValue = (Double) field.get(emp1);  // Кастим до Double, и читаем это поле
        System.out.println(salaryValue);

        field.set(emp1, 15000); // Для изменения этого поля
        System.out.println(emp1);

    }
}
