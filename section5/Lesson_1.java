package org.example.udemy.section5;

class Lesson_1 { //static inner nested class - example
    public static void main(String[] args) {
        Car.Engine en = new Car.Engine(280);  // how create object static inner nested classes
        System.out.println(en);
        Car car = new Car("red", 2, en);
        System.out.println(car);
    }
}

class Car{                     //Outer class
    String color;
    int doorCount;
    Engine engine;

    void someInfo(){
        System.out.println(Engine.countOfObjects);  // OUTER class have access to static variable

        Engine engine = new Engine(244);  // how OUTER class have access to
        System.out.println(engine.horsePower);      // private variable
    }

    @Override
    public String toString() {
        return "My car{" +
                "color = '" + color + '\'' +
                ", doorCount = " + doorCount +
                ", engine = " + engine +
                '}';
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public static class Engine{         //static nested class
       private int horsePower;
       static int countOfObjects;

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower = " + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
    }
}
