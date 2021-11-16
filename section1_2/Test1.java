package org.example.udemy.section1_2;

import java.util.ArrayList;
import java.util.Collections;                     // !!!!!!!!Comparator!!!!!!!!!!!!
import java.util.Comparator;
import java.util.List;

class Test1 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(13509, "Maria", "Szarapowa", 12500);
        Employee2 emp2 = new Employee2(13506, "Lia", "Gramm", 11300);
        Employee2 emp3 = new Employee2(13504, "Sonia", "Lokka", 18500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n" + list);
//        Collections.sort(list, new NameComparator());  // sort name, use object class NameComparator like second parameter for sort method
        Collections.sort(list);   // sort id
        System.out.println("after sorting: \n" + list);


    }
}

class Employee2 implements Comparable<Employee2> {   // for compare object need implements interfase Comparable and override method compareTo
    Integer id; // use Integer if you use copareTo for this variable
    String name;
    String surname;
    Integer salary;  // use Integer if you use  copareTo for this variable

    public Employee2(int id, String name, String surname, int salary) { // auto create constructor  use <alt + insert>
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() { // auto create override method use <alt+insert>
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee2 anothorEmp) {  // witch parametr you use for compare object. in this task I compare id
        return this.id - anothorEmp.id;           // !!!!!!!!!!Second method - more useful compare method put inside class whit object
                                                    // for other, not more useful method, we create new classes whose implements Camparator
    }
}

//class IDComparator implements Comparator<Employee2>{
//
//    @Override
//    public int compare(Employee2 emp1, Employee2 emp2) {
//        if(emp1.id == emp2.id){
//            return 0;
//        }
//        else if (emp1.id < emp2.id){
//            return -1;
//        }
//        else{
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee2>{

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SurnameComparator implements Comparator<Employee2>{

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.surname.compareTo(emp2.surname);
    }
}

class SalaryComparator implements Comparator<Employee2>{

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary.compareTo(emp2.salary);
    }
}

