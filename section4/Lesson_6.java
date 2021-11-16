package org.example.udemy.section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Lesson_6 {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(3);
//        arr.add(8);
//        arr.add(129);
//        arr.add(45);
//        arr.add(98);
//        arr.add(32);
//        arr.add(99);
//        Collections.sort(arr);                               // prepare our collection to method binarySearch
//        int index = Collections.binarySearch(arr, 3);   // ready binarySearch inside class Collections
//        System.out.println(index);

        Employee emp1 = new Employee(100, "Nika", 34000);
        Employee emp2 = new Employee(14, "Mila", 44322);
        Employee emp3 = new Employee(78, "Ania", 56990);
        Employee emp4 = new Employee(25, "Kira", 34700);
        Employee emp5 = new Employee(68, "Liza", 33200);
        Employee emp6 = new Employee(33, "Monika", 50000);
        Employee emp7 = new Employee(90, "Elena", 74000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);  //for use this method we need implements interface Comparable<> in class Employee
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(90, "Elena", 74000));
        System.out.println(index2);
    }
}

class Employee implements Comparable<Employee>{    // implements interface Comparable for sorting our list Employee
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {           // override method toCompare for sorting our list Employee
        int result = this.id - o.id;
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
