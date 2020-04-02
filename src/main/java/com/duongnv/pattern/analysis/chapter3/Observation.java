package com.duongnv.pattern.analysis.chapter3;

import lombok.Data;

@Data
public class Observation {
    private final Person person;
    private Protocol protocol;
    private TimeRecord timeApplied;
    private TimeRecord timeRecorded;
}
