package org.ulpgc.is1.model;

import java.util.Objects;

public class Court {
    private String name;
    private int price;
    private CourtType type;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CourtType getType() {
        return type;
    }

    public void setType(CourtType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Nombre de la Pista: " + name + " - " + "Precio: " + price + "€ - " + "Tipo: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Court court = (Court) o;
        return price == court.price && type == court.type && Objects.equals(name, court.name);
    }
}
