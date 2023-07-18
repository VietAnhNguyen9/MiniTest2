package bai2;

import java.time.LocalDate;

public class Meat extends Material{
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    public double getAmount() {
        return cost * weight;
    }
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}

