package org.example.udemy.section8;

import com.sun.xml.bind.v2.WellKnownNamespace;

import java.util.Arrays;

class Lesson_12_1_Enum {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        System.out.println(today.weekDays); // что за день
        WeekDays w1 = WeekDays.MONDAY;
        WeekDays w2 = WeekDays.MONDAY;
        WeekDays w3 = WeekDays.SATURDAY;
        System.out.println(w1==w2);  // true
        System.out.println(w1 == w3); // false

//        System.out.println(WeekDays.FRIDAY == WeekDays2.FRIDAY);  // Так нельзя сравнивать!!!!!!
        System.out.println(WeekDays.FRIDAY.equals(WDays2.FRIDAY));  // Так можно сравнивать, но всегда будет false!!!

        WeekDays w4 = WeekDays.valueOf("MONDAY"); // получить обект enum  по стрингу, но если такой енум существует!!!
        System.out.println(w4);

        WeekDays [] arrayDays = WeekDays.values(); //масив из значений enum
        System.out.println(Arrays.toString(arrayDays));

    }
}

enum WeekDays {                  //Syntax for creating Enumeration
    MONDAY ("Bad"),    // Если есть конструктор с параметром - то его необходимо передать каждому ENUM
    TUESDAY ("Bad"),     // Если есть конструктор с параметром - то его необходимо передать каждому ENUM
    WEDNESDAY("So, so"), // Если есть конструктор с параметром - то его необходимо передать каждому ENUM
    THURSDAY("So, so"),   // Если есть конструктор с параметром - то его необходимо передать каждому ENUM
    FRIDAY("So, so"),
    SATURDAY("Good"),
    SUNDAY("Good");     // Если есть конструктор с параметром - то его необходимо передать каждому ENUM

    private String mood;   // настроение

    WeekDays(String mood) {   // Если есть конструктор с параметром - то его необходимо передать каждому ENUM
                                // Этот конструктор всегда PRIVATE!!!
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}
enum WDays2 {
    MONDAY,
    TUESDAY ,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go in job");
                break;

            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekend");
                break;
        }
        System.out.println("Mood this day: "+ weekDays.getMood());
    }
}