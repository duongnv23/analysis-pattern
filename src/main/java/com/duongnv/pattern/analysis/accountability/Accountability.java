package com.duongnv.pattern.analysis.accountability;

import com.duongnv.pattern.analysis.accountability.knowledge.AccountabilityType;
import lombok.Data;

@Data
public class Accountability {
    private Party commissioner;
    private Party responsible;

    private AccountabilityType type;
    private TimePeriod timePeriod;
    private Rule rule;
}
