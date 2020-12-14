package com.javalessons.inheritance;

import java.util.List;

/**
 * In Java we can extend (inherit) only one class, it's a inconvenience.
 * We cannot inherit a final class.
 */

public class InheritanceMain {
    public static void main(String[] args) {

        Engine truckEngine = new Engine(8.0, EngineType.DIESEL, 1200);
        Engine busEngine = new Engine(4.0, EngineType.DIESEL, 600);

        /** Our Truck "is an" Auto */
        Auto truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 10);
        /** Our ElectricCar "is an" Auto */
        Auto car = new ElectricCar("Tesla", "Model S", 150000, 4);
        /** Our Bus "is an" Auto */
        Auto bus = new Bus("Mercedes", "Megabus", busEngine, 200, 300, 42);
        Auto auto = new Auto("VW", "Polo", busEngine);
//        truck.start();
//        truck.accelerate(40);
//        truck.stop();
//        truck.fuelUp(50);
//        truck.load();
//        truck.unload();

//        System.out.println("\n");

//        car.start();
//        car.accelerate(80);
//        car.stop();
//        car.charge();

//        System.out.println("\n");

//        bus.fuelUp();
//        bus.pickUpPassengers(35);
//        bus.start();
//        bus.accelerate(50);
//        bus.stop();
//        bus.releasePassengers();

//        Engine engine = bus.getEngine();
//        System.out.println(engine.getEngineType());
//
//        List<Piston> pistons = engine.getPiston();
//        System.out.println(pistons);

        runCar(bus);
        runCar(truck);
        runCar(car);
        runCar(auto);

    }

    private static void runCar(Auto auto){
        auto.start();
        auto.stop();

        if(auto instanceof FuelAuto){
            FuelAuto fuelAuto = (FuelAuto) auto;
            fuelAuto.fuelUp(50);
        }
    }
}
