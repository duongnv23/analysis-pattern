package com.duongnv.pattern.analysis.accountability.knowledge;

import lombok.Data;

import java.util.Set;

@Data
public class DirectionalAccountabilityType extends AccountabilityType {
    private Set<PartyType> commissioners;
    private Set<PartyType> responsibles;
}
