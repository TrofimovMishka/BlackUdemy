package org.example.udemy.section81;

import org.example.udemy.section8.Employees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

class Lesson_5_Serialization_programmer2 {
    public static void main(String[] args) {

/////////////////////////////////Example 1  ObjectInputStream  /////////////////////////////////////////////////////

//        List<String> employees;
//        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"));
//        ){
//            employees = (ArrayList)inputStream.readObject();
//            System.out.println(employees);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
/////////////////////////////////Example 2  ObjectInputStream  /////////////////////////////////////////////////////

        Employees bestemp;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Rabotnik2.bin"));
        ) {
            bestemp = (Employees) objectInputStream.readObject(); // method return Object - becose use casting to Employees
            System.out.println(bestemp);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
