package com.javalessons.oop;

/**
 * An enum can be declared in a class, or can be like a class itself
 */
public enum Size {
    /**  All the enums are static and final */
    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFINED("");

    private String abbreviation;

    /** We cannot have a public constructor in enum.
     *  Enum can have a constructor with no return type.
     */
    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
