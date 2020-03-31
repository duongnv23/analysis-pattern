package com.duongnv.pattern.analysis.accountability;

import lombok.Data;

@Data
public abstract class OperatingScope {
    private Accountability accountability;
    private Location location;
}
