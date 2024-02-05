package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.Objects;

public class Customer {

    private final ArrayList<Reservation> reservation;
    private NIF nif;
    private String name;
    private String surname;

    public Customer(String name, String surname, NIF nif){
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.reservation = new ArrayList<Reservation>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public void addReservation (Reservation reservation) {
        this.reservation.add(reservation);
    }

    public ArrayList<Reservation> getReservation() {
        return reservation;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " - " + "Apellido: " + surname + " - " + "NIF: " + nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return (Objects.equals(name, customer.name)) && (Objects.equals(surname, customer.surname)) && (Objects.equals(nif, customer.nif));
    }

}