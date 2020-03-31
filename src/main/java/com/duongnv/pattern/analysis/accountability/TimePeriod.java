package com.duongnv.pattern.analysis.accountability;

import lombok.Data;

import java.time.Instant;

@Data
public class TimePeriod {
    private Instant start;
    private Instant end;
}
