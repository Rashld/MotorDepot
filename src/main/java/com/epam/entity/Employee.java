package com.epam.entity;

public abstract class Employee extends User{

    private String passportID;

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        return !(getPassportID() != null ? !getPassportID().equals(employee.getPassportID()) : employee.getPassportID() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getPassportID() != null ? getPassportID().hashCode() : 0);
        return result;
    }
}
