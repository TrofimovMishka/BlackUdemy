package org.example.udemy.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Lesson_8 {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1000 , " Nika Rosberg");
//        map.put(2388, " Monika Gelber");
//        map.put(246246, " Kira Volkova");
//        map.put(null, "Daria Fedorova");
//        map.putIfAbsent(2323, "Monaka Losa");
//        System.out.println(map);
//        System.out.println(map.get(1000));
//        System.out.println(map.keySet());
        Map<Student1, Double> map = new HashMap<>();

        Student1 student1 = new Student1("Kira", "Frolova", 3);
        Student1 student2 = new Student1("Nika", "Alota", 4);
        Student1 student3 = new Student1("Ola", "Ogtond", 3);

        Student1 student4 = new Student1("Kira", "Frolova", 3);
        Student1 student5 = new Student1("Mika", "Rota", 5);

        map.put(student1, 8.4);
        map.put(student2, 7.7);
        map.put(student3, 8.1);

        System.out.println(map);

        boolean result = map.containsKey(student4);
        System.out.println("result: " + result);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        for (Map.Entry<Student1, Double> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

        Map<Integer, String> integerStringMap = new HashMap<>();


    }

}

class Student1 {
    String name;
    String surname;
    int course;

    public Student1(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course && Objects.equals(name, student1.name) && Objects.equals(surname, student1.surname);
    }



}
