package org.example.udemy.section8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class Lesson_15_1_Annotation {
    public static void main(String[] args) {
        Parent p = new Child("kira");
        p.showInfo();

    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
 @Deprecated        // Аннотация для устаревших методов
    void showInfo(){
        System.out.println("It's Parent class, name ="+ name);
    }
}

class Child extends Parent{
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo(){
        System.out.println("It's Child class, name ="+ name);
    }
}
@MyAnnotatiom
class Employe2{
    String name;
    double salary;

    public Employe2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @MyAnnotatiom
    void increeseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employe2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

///////////////////////////////////////    Создадим новую аннотацию    //////////////////////////////////////////////
@Target({ElementType.METHOD, ElementType.TYPE})
// METHOD - Это поле значит что наша аннотация применима только для методов.
// TYPE - Это поле значит что наша аннотация применима только для class, interface, enum.
// ElementType - Это ENUM и внутри него можно посмотреть какие значения принемает
@Retention(RetentionPolicy.RUNTIME)
// RetentionPolicy - Это ENUM и внутри него можно посмотреть какие значения принемает
// SOURCE - отбрасывается компилятором, в byte code  не видна
// CLASS - default если не указать, в byte code видна, но во время выполнения программы отбрассывается
// RUNTIME - видна и во время выполнения программы
@interface MyAnnotatiom{

}

