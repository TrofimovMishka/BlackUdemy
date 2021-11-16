package org.example.udemy.section1_2;

import java.util.ArrayList;
import java.util.Collections;                    //!!!!!!Comparable!!!!!!!!!!!
import java.util.List;

class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(13509, "Maria", "Szarapowa", 12500);
        Employee emp2 = new Employee(13506, "Lia", "Gramm", 11300);
        Employee emp3 = new Employee(13504, "Sonia", "Lokka", 18500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n" + list);
        Collections.sort(list); // sorting list with different parametr. Need override method compareTo (use alt+shift+enter)
        System.out.println("after sorting: \n" + list);


    }
}

class Employee implements Comparable<Employee> {   // for compare object need implements interfase Comparable and override method compareTo
    Integer id; // use Integer if you use copareTo for this variable
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) { // auto create constructor  use <alt + insert>
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
    public int compareTo(Employee anothorEmp) {  // witch parametr you use for compare object? in this task I compare id
//        if(this.id == anothorEmp.id){             !!!!!!!!!!!First method!!!!!!!!!!!!!!
//            return 0;
//        }
//        else if (this.id < anothorEmp.id){
//            return -1;
//        }
//        else{
//            return 1;
//        }
//    }

//        return this.id - anothorEmp.id;           // !!!!!!!!!!Second method - more useful!!!!!!!!!!!!!!!
        return this.id.compareTo(anothorEmp.id);    // if id is Integer - not int!!!! use this method
//        return this.name.compareTo(anothorEmp.name); // if you wont compare name variables
    }
}
