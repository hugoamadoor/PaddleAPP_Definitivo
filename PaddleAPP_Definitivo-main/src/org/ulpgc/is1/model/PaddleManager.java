package org.ulpgc.is1.model;

import java.util.ArrayList;

public class PaddleManager {

    private final ArrayList<Court> courts;
    private final ArrayList<Customer> customers;
    private final ArrayList<Reservation> reservations;

    public PaddleManager() {

        courts = new ArrayList<>();
        customers = new ArrayList<>();
        reservations = new ArrayList<>();
    }


    public void addCustomer(String firstName, String lastName, String nif, int memberId, String street, int number, int postalCode, String city) {
        NIF nifObj = new NIF(nif);
        Address address = new Address(street, number, postalCode, city);
        Member member = new Member(firstName, lastName, nifObj, memberId, address);
        customers.add(member);
    }



    public void addCustomer(String firstName, String lastName, String nif) {
        NIF nifObj = new NIF(nif);
        Customer customer = new Customer(firstName, lastName, nifObj);
        customers.add(customer);
    }

    public void addCourt(String name, int capacity, CourtType type) {
        Court court = new Court(name, capacity, type);
        courts.add(court);
    }

    public void reserve(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public Customer getCustomer(int i) {
        if ((i >= 0) && i < (customers.size())) {
            return customers.get(i);
        } else {
            return null;
        }
    }


    public Court getCourt(int i) {
        if ((i >= 0) && (i < courts.size())) {
            return courts.get(i);
        } else {
            return null;
        }
    }


    public int countCustomer() {
        return this.customers.size();
    }

    public ArrayList<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }

    public void remove(int i) {
        if (i >= 0 && i < customers.size()) {
            this.customers.remove(i);
        }
    }

    public ArrayList<Court> getCourts() {
        return courts;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}