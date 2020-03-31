package com.duongnv.pattern.analysis.accountability;

import com.duongnv.pattern.analysis.accountability.Address;
import com.duongnv.pattern.analysis.accountability.EmailAddress;
import com.duongnv.pattern.analysis.accountability.TelephoneNumber;
import lombok.Data;

@Data
public class Party {
    private TelephoneNumber telephoneNumber;
    private Address address;
    private EmailAddress emailAddress;
}
