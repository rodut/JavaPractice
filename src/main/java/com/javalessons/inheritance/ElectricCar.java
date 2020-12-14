package com.javalessons.inheritance;

public class ElectricCar extends Auto{

    private int batteryVolume;
    private int passengerNumber;

    public ElectricCar(String producer, String model, int batteryVolume, int passengersNumber) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengerNumber = passengersNumber;
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Electric car has started.");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Electric car has stopped.");
    }

    public void charge(){
        System.out.println("Battery is charging.");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
