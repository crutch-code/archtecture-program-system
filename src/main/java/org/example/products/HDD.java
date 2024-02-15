package org.example.products;

import java.util.StringJoiner;

public class HDD extends Product{
    private Double size;

    private Double buffer;

    private Double speedSpindle;

    public HDD(Double cost, String name, Double size, Double buffer, Double speedSpindle) {
        super(cost, name);
        this.size = size;
        this.buffer = buffer;
        this.speedSpindle = speedSpindle;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getBuffer() {
        return buffer;
    }

    public void setBuffer(Double buffer) {
        this.buffer = buffer;
    }

    public Double getSpeedSpindle() {
        return speedSpindle;
    }

    public void setSpeedSpindle(Double speedSpindle) {
        this.speedSpindle = speedSpindle;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", HDD.class.getSimpleName() + "[", "]")
                .add("size=" + size)
                .add("buffer=" + buffer)
                .add("speedSpindle=" + speedSpindle)
                .add("cost=" + cost)
                .add("name='" + name + "'")
                .add("produced='" + produced + "'")
                .toString();
    }
}
