package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    // Getters and Setters:

}





