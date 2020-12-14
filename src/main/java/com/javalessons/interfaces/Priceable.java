package com.javalessons.interfaces;

public interface Priceable extends Deliverable, Orderable {

    default int calcPrice() {
        return calcOrderPrice() + calcDeliveryPrice();
    }
}
