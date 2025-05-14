package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void startEngine() {
        System.out.println("the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }
    public void accelerate() {
        System.out.println("the car is accelerating");
        System.out.println(getClass().getSimpleName());
    }
    public void brake() {
        System.out.println("the car is braking");
        System.out.println(getClass().getSimpleName());
    }
}
