package org.example.udemy.section8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Lesson_5_Serialization {
    public static void main(String[] args) {

/////////////////////////Example use ObjectOutputStream ///////////////////////////////////////////////////////////

//        List<String> employees = new ArrayList<>();
//        employees.add("Monika");
//        employees.add("Kira");
//        employees.add("Jessi");
//        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"));
//        ){
//            outputStream.writeObject(employees);
//            System.out.println("Done!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
/////////////////////////Example2 use ObjectOutputStream ///////////////////////////////////////////////////////////
        Car car = new Car("BMW", "Black");
        Employees emp1 = new Employees("Monika", "Geller", "IT", 32000,  car );

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Rabotnik2.bin"));
        ) {
            outputStream.writeObject(emp1);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
