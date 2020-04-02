package com.duongnv.pattern.analysis.chapter3;

public class Measurement extends Observation {

    private final Quantity quantity;
    private final PhenomenonType type;

    public Measurement(Person person, PhenomenonType type, Quantity quantity) {
        super(person);
        this.type = type;
        this.quantity = quantity;
    }
}
