package org.example.udemy.section8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class Lesson_14_1_Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class employeeClass = Class.forName("org.example.udemy.section8.Employee");  // Первый метод создания объекта класса Class

//        Class employeeClass2 = Employee.class;   // Второй метод создания объекта класса Class
//        Employe emp = new Employe();             // Третий метод создания объекта класса Class
//        Class employeeClass2 = emp.getClass();    // Третий метод создания объекта класса Class

        Field someField = employeeClass.getField("id");   // Создаем объект класа Field и запрашиваем поле id
        System.out.println("Type of id field: " + someField.getType());  // Запрашиваем getType  тип этого поля -> int

        System.out.println("----------------------------------------------------");

        Field[] filds = employeeClass.getFields(); // все поля класса Employee кроме private
        for (Field field : filds) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType()); // getName -> Имя поля,  getType -> его тип
        }

        System.out.println("----------------------------------------------------");

        Field[] allFilds2 = employeeClass.getDeclaredFields(); // Абсолютно все поля класса даже private
        for (Field field : allFilds2) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType()); // getName -> Имя поля,  getType -> его тип
        }

        System.out.println("----------------------------------------------------");

        Method someMethod1 = employeeClass.getMethod("increeseSalary");  // Доступ к методу класа Employee
        System.out.println("Return type method: " + someMethod1.getName() + " = " +
                someMethod1.getReturnType());  // getReturnType  ->  возвращает  тип returna  метода
        System.out.println("Parameter type method: " + someMethod1.getName() + " = " +
                Arrays.toString(someMethod1.getParameterTypes())); // getParameterTypes -> массив типов всех параметров

        System.out.println("----------------------------------------------------");



        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);  // Доступ к методу класа Employee
        //  double.class -> Это тип параметра, чтобы понять какой именно метод использовать если есть overloaded методы
        System.out.println("Return type method: " + someMethod2.getName() + " = " +
                someMethod2.getReturnType());  // getReturnType  ->  возвращает тип returna метода
        System.out.println("Parameter type method: " + someMethod2.getName() + " = " +
                Arrays.toString(someMethod2.getParameterTypes())); // getParameterTypes -> массив типов всех параметров

        System.out.println("----------------------------------------------------");




        Method[] allMethods = employeeClass.getMethods();   // Возвращает все методы класа и класа родителя кроме private

        for (Method oneMethod : allMethods) {
            System.out.println("Name method: " + oneMethod.getName()); // -> Имя метода
            System.out.println("Return type method: " + oneMethod.getName() + " = " +
                    oneMethod.getReturnType());  // getReturnType  ->  возвращает тип returna  метода
            System.out.println("Parameter type method: " + oneMethod.getName() + " = " +
                    Arrays.toString(oneMethod.getParameterTypes())); // getParameterTypes -> массив типов всех параметров
            System.out.println("----------------------------------------------------");
        }
        System.out.println("----------------------------------------------------");


        Method[] allMethods2 = employeeClass.getDeclaredMethods();   // Возвращает все методы класа вместе с private, кроме методов класа родителя

        for (Method oneMethod : allMethods2) {
            System.out.println("Name method: " + oneMethod.getName()); // -> Имя метода
            System.out.println("Return type method: " + oneMethod.getName() + " = " +
                    oneMethod.getReturnType());  // getReturnType  ->  возвращает тип returna  метода
            System.out.println("Parameter type method: " + oneMethod.getName() + " = " +
                    Arrays.toString(oneMethod.getParameterTypes())); // getParameterTypes -> массив типов всех параметров
            System.out.println("----------------------------------------------------");

        }
        System.out.println("----------------------------------------------------");



        //////////////////////    Мы хотим только Public методы нашего класа вывести  ///////////////////////////////////////

        Method[] allMethods3 = employeeClass.getDeclaredMethods();   // Возвращает все методы класа вместе с private, кроме методов класа родителя

        for (Method oneMethod : allMethods3) {

            if (Modifier.isPublic(oneMethod.getModifiers())) {  // Проверяем тип модификатора доступа Public ли он
                // с помощью класа Modifier и метода .isPublic; и вызываем getModifiers() на методе чтобы получить его модификатора доступа

                System.out.println("Name method: " + oneMethod.getName()); // -> Имя метода
                System.out.println("Return type method: " + oneMethod.getName() + " = " +
                        oneMethod.getReturnType());  // getReturnType  ->  возвращает тип returna  метода
                System.out.println("Parameter type method: " + oneMethod.getName() + " = " +
                        Arrays.toString(oneMethod.getParameterTypes())); // getParameterTypes -> массив типов всех параметров
                System.out.println("----------------------------------------------------");
            }
        }
        System.out.println("----------------------------------------------------");


        //////////////////////          Получим инфу о конструкторах класса         ////////////////////////////////

     Constructor constructor1 =  employeeClass.getConstructor();   // Если не указать параметры внутри то получим инфу о конструкторе без параметров
        System.out.println("Constructor has: " +
                constructor1.getParameterCount() + " parameters."); // -> Количество параметров
        System.out.println("Types parameters are: " +
                Arrays.toString(constructor1.getParameterTypes())); // -> Тип параметров
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");



        Constructor constructor2 =  employeeClass.getConstructor(int.class, String.class, String.class);
        //Если указать параметры внутри то получим инфу о конструкторе именно с этими параметрами
        System.out.println("Constructor has: " +
                constructor2.getParameterCount() + " parameters."); // -> Количество параметров
        System.out.println("Types parameters are: " +
                Arrays.toString(constructor2.getParameterTypes())); // -> Тип параметров
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");


        /////////////////////////  Получим все конструкторы класа //////////////////////////
        Constructor[] allConstructors = employeeClass.getConstructors();
        for (Constructor oneConstructor: allConstructors){
            System.out.println("Constructor name is: " + oneConstructor.getName()); // -> name
            System.out.println("Constructor has n: " +
                    oneConstructor.getParameterCount() + " parameters."); // -> Количество параметров
            System.out.println("Types parameters are: " +
                    Arrays.toString(oneConstructor.getParameterTypes())); // -> Тип параметров
            System.out.println("----------------------------------------------------");

        }
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");







    }
}

class Employee {
    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public Employee() {
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    private void checgeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department is: " + department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void increeseSalary() {
        salary *= 2;
    }
}
