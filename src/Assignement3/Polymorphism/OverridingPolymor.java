package Assignement3.Polymorphism;

import javaAssignement3.Polymorphism.Bike;
import javaAssignement3.Polymorphism.Car;
import javaAssignement3.Polymorphism.Vehicle;

public class OverridingPolymor {
    public static void main(String[] args) {
        javaAssignement3.Polymorphism.Vehicle vl = new Vehicle();
        vl.start();

        Car cr = new Car();
        cr.start();

        Bike bk = new Bike();
        bk.start();
    }
}
