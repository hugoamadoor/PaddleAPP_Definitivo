package org.ulpgc.is1.model;

public abstract class Extra {
    protected int price;

    public Extra (int price) {
        this.price = price;
    }

    public abstract String getName();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
