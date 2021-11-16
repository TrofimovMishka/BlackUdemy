package org.example.udemy.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Lesson_5 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 12);
        Schoolar schoolar2 = new Schoolar("Maria", 13);
        Schoolar schoolar3 = new Schoolar("Dic", 12);
        Schoolar schoolar4 = new Schoolar("Fonka", 13);


        Student petr = new Student("Petr", 18);
        Student inna = new Student("Inna", 20);

        Employee rob = new Employee("Rob", 40);
        Employee nika = new Employee("Nika", 28);

        Team<Schoolar> schoolarTeam = new Team("Dracony");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team("Mudrecy");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team("Ptachy");
        studentTeam.addNewParticipant(petr);
        studentTeam.addNewParticipant(inna);

        Team<Employee> employeeTeam = new Team("Gopota");
        employeeTeam.addNewParticipant(rob);
        employeeTeam.addNewParticipant(nika);

//        Team<String> hello = new Team<>("hello");      // так нельзя позволять работать - можно добавить любой стринг!!!!
//        hello.addNewParticipant("Goga");                // для этого произведем перемены кода и обозначим их **

        schoolarTeam.playWith(schoolarTeam2);
//        schoolarTeam.playWith(studentTeam);    // так работает а не должно. Студенты должны играть только со студентами а школота только со школотой
                                                 // для этого изменим код и обозначим его !!!!! ### !!!!!!

    }

}
abstract class Participant{
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class  Schoolar extends Participant{
    public Schoolar(String name, int age) {
        super(name, age);
    }
}
class Student extends Participant{
    public Student(String name, int age) {
        super(name, age);
    }
}
class Employee extends Participant{
    public Employee(String name, int age) {
        super(name, age);
    }
}

class Team<T extends Participant>{       // **  - extends Participant !!!!!!!!!!
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant(T participant){
        participantList.add( participant);
        System.out.println("In team "+ name + " inpun new particimant " + ((Participant)participant).getName());   // cast method getName to Particimant type
    }
    public void playWith(Team<T> team){    // ### - <T> !!!!! - now we can play only with team some type
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0){
            winnerName=this.name;
        }
        else{
            winnerName= team.name;
        }
        System.out.println("winner team " + winnerName);

    }
}