package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

    // Getters and Setters:

}





