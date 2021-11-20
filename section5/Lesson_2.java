package org.example.udemy.section5;

class Lesson_2 {        // inner nested class - example
    public static void main(String[] args) {
//        Car2 carObj = new Car2("black", 2, 360);
//        System.out.println(carObj);
//        carObj.new Engine2(540); // how create object inner non-static nested classes
//        System.out.println();

        Car2 car2 = new Car2("red", 4);
        Car2.Engine2 engine2 = car2.new Engine2(320);  // how create object inner non-static nested classes
        car2.setEngine(engine2);
        System.out.println(car2);
        System.out.println(engine2);

        Car2.Engine2 engine21 = new Car2("yellow", 2).new Engine2(200);  // another method create object inner non-static nested classes with outer class together
                                                                                                    // non use method
    }
}

class Car2 {                     //Outer class
    String color;
    int doorCount;
    Engine2 engine;

//    void someInfo(){
//        System.out.println(Engine2.countOfObjects);  // OUTER class have access to static variable
//
//        Engine2 engine = new Engine2(244);  // how OUTER class have access to
//        System.out.println(engine.horsePower);      // private variable
//    }

    @Override
    public String toString() {
        return "My car{" +
                "color = '" + color + '\'' +
                ", doorCount = " + doorCount +
                ", engine = " + engine +
                '}';
    }

    //    public Car2(String color, int doorCount, int horsePower) {
//        this.color = color;
//        this.doorCount = doorCount;
//        this.engine = this.new Engine2(horsePower);    //create new object inner non-static nested class
//    }
    public Car2(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine2 engine){
        this.engine=engine;
    }

        public class Engine2 {         //static nested class
            private int horsePower;


            @Override
            public String toString() {
                return "My engine{" +
                        "horsePower = " + horsePower +
                        '}';
            }

            public Engine2(int horsePower) {
                this.horsePower = horsePower;
            }
        }
    }

