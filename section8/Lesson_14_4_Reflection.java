package org.example.udemy.section8;

import javax.print.attribute.standard.PresentationDirection;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Lesson_14_4_Reflection {
    void sum (int a, int b){
        int result = a+b;
        System.out.println("Sum " + a+ " and "+ b +" = "+result);
    }
    void subtraction (int a, int b){
        int result = a-b;
        System.out.println("Subtraction " + a+ " and "+ b +" = "+result);
    }
    void multiplication (int a, int b){
        int result = a*b;
        System.out.println("Multiplication " + a+ " and "+ b +" = "+result);
    }

    void devision (int a, int b){
        int result = a/b;
        System.out.println("Devision " + a+ " and "+ b +" = "+result);
    }
}
class TestCalc{
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Test20.txt"))) {

        // Читаем из файла инфу и записываемв переменные
            String methodName = reader.readLine();
            int firstArgument = Integer.parseInt(reader.readLine());
            int secondArgument = Integer.parseInt(reader.readLine());

            // Создаем обьект нашего класа
            Lesson_14_4_Reflection reflection = new Lesson_14_4_Reflection();

            // Создаем обьект класа Class
            Class cl = reflection.getClass();

            // Создаем обьект класа Method
            Method method =null;
            Method[] methods = cl.getDeclaredMethods();

            // Сверяем название метода прочитанного с файла с нашим методом
            for(Method myMethod: methods){
                if(myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }

            // Выполняем наш метод с прочитанными параметрами из файла
            method.invoke(reflection, firstArgument, secondArgument);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
