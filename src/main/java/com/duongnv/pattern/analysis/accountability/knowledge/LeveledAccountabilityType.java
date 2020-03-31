package com.duongnv.pattern.analysis.accountability.knowledge;

import lombok.Data;

import java.util.List;

@Data
public class LeveledAccountabilityType extends AccountabilityType{
    private List<PartyType> levels;
}
