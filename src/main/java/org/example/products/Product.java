package org.example.products;

import java.util.StringJoiner;

public abstract class Product {
    protected Double cost;

    protected String name;

    protected String produced;

    protected Product() {
    }

    public Product(Double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("cost=" + cost)
                .add("name='" + name + "'")
                .toString();
    }
}
