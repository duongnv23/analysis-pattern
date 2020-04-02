package com.duongnv.pattern.analysis.chapter3;

import lombok.Data;

@Data
public class UnitReference {
    private final CompoundUnit compoundUnit;
    private AtomicUnit atomicUnit;
    private Integer power;

}
