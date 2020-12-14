package com.javalessons.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialize.");
    }

    /**
     * Method overloading. In FuelAuto class we already have a fuelUp() method.
     * Basically we are creating methods with the same names but with different parameters.
     */
    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    /**
     * Method overriding presume to redefine the method from the superclass in this subclass. CTRL + O
     * There is an annotation that show us that we are overriding a method from a superclass.
     * If we are overriding a method, the name, parameters and access modifiers must be the same,
     * if there are discrepancies the annotation "@Override" will tell us about this.
     */
    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if(volume > getTankVolume()){
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding diesel.");
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus has started.");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped.");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers.");
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released.");
    }
}
