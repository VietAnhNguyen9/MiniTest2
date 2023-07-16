package bai2;

import bai1.Manager;

import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getAmount() {
        return quantity*cost;
    }
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(365);
    }

}
