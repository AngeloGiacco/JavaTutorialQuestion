package com.company.abstractClasses.emailManagementSystem;

import java.util.List;
import java.util.Objects;

abstract class Address {
    final String identifier;
    Address(String identifier) {
        this.identifier = identifier;
    }
    abstract List<Address> getTargets();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(identifier, address.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}
