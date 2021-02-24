package com.company.abstractClasses.emailManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class GroupAddress extends Address {
    final List<Address> addresses = new ArrayList<>();

    GroupAddress(String identifier) {
        super(identifier);
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    @Override
    List<Address> getTargets() {
        List<Address> result = new ArrayList<>();
        for (Address address : addresses) {
            result.addAll(address.getTargets());
        }
        return result;
    }
}
