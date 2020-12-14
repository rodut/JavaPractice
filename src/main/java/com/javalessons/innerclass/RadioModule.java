package com.javalessons.innerclass;

public class RadioModule {

    public RadioModule() {
        System.out.println("RadioModule initialized.");
    }

    public void call(String number) {
        final int LENGTH = 10;

        /**  A class within a method - a Local Class. It's very rare.
         *   When we make a class inside a method,
         *   we can only use 'default' access modifier.
         */
        class GSMModule {

            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid() {
                if (phoneNumber.length() != LENGTH) {
                    return false;
                } else {
                    try {
                        /**  A code that can give us an error.
                         *   Here we will verify if user inputs an integer,
                         *   if no, we will catch an exception - NumberFormatException
                         */
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }

            public void dialIn() {
                if (isValid()) {
                    System.out.println("We are calling the number " + validNumber);
                } else {
                    System.out.println("This is an invalid number.");
                }
            }
        }

        GSMModule module = new GSMModule(number);
        module.dialIn();
    }
}
