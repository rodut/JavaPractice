package com.javalessons.innerclass;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    /**
     * Anonymous class
     */
    public interface AbstractPhoneButton {
        void click();
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {

        initDisplay();
        gsm = new RadioModule();
        initButton();
    }

    public void initButton() {
        button = new AbstractPhoneButton() {
            @Override
            public void click() {
                System.out.println("Button was clicked.");
            }
        };
    }

    public void call(String number) {
        button.click();
        gsm.call(number);
    }

    private void initDisplay() {

        /**  Instance of our display */
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
