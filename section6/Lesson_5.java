package org.example.udemy.section6;

import java.util.ArrayList;
import java.util.function.Supplier;

class Lesson_5 {                      // Supplier
    public static ArrayList<Car> createThreeCars (Supplier<Car> carSupplier){
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void main(String[] args) {
        ArrayList<Car> outCars = createThreeCars(() -> new Car("BMW", "red", 3.5));
//        ArrayList<Car> outCars2 = createThreeCars(() -> new Car("Mercdes", "black", 2.5));

        System.out.println(outCars);


    }
    
}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
    
}
