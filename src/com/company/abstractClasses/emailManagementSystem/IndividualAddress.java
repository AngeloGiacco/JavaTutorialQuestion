package com.company.abstractClasses.emailManagementSystem;

import java.util.List;

public class IndividualAddress extends Address {
    public IndividualAddress(String identifier) {
        super(identifier);
    }
    @Override
    List<Address> getTargets() {
        return List.of(this);
    }

}
