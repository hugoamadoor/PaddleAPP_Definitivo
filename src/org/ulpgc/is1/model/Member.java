package org.ulpgc.is1.model;

public class Member extends Customer {
    private Address address;
    private int points;

    public Member(String name, String surname, NIF nif, int points, Address address) {
        super(name, surname, nif);
        this.points = points;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public int getPoints() {
        return points;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
