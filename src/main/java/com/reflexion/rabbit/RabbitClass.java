package com.reflexion.rabbit;

public class RabbitClass {
    @Deprecated
    private String rabbitName;

    @SuppressWarnings(value = "") // This annotation is available only on compilation, no runtime! Reflection works only in runtime, that's why we cannot see this annotation in the printed result
    private int rabbitSpeed;

    @Deprecated
    private int rabbitAge;

    @RabbitAnnotation
    private String rabbitColor;

    public String getRabbitName() {
        return rabbitName;
    }

    public int getRabbitSpeed() {
        return rabbitSpeed;
    }

    public int getRabbitAge() {
        return rabbitAge;
    }

    public String getRabbitColor() {
        return rabbitColor;
    }
}
