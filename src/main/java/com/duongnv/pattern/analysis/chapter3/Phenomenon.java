package com.duongnv.pattern.analysis.chapter3;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Phenomenon extends ObservationConcept{
    private final PhenomenonType type;
}
