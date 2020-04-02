package com.duongnv.pattern.analysis.chapter3;

public class CategoryObservation extends Observation {
    private final ObservationConcept observationConcept;

    public CategoryObservation(Person person, ObservationConcept observationConcept) {
        super(person);
        this.observationConcept = observationConcept;
    }
}
