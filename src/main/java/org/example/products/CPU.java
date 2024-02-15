package org.example.products;

import java.util.StringJoiner;

public class CPU extends Product{

    private Double frequency;

    private Short cores;

    private Short threads;


    public CPU(Double cost, String name, Double frequency, Short cores, Short threads) {
        super(cost, name);
        this.frequency = frequency;
        this.cores = cores;
        this.threads = threads;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public Short getCores() {
        return cores;
    }

    public void setCores(Short cores) {
        this.cores = cores;
    }

    public Short getThreads() {
        return threads;
    }

    public void setThreads(Short threads) {
        this.threads = threads;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CPU.class.getSimpleName() + "[", "]")
                .add("frequency=" + frequency)
                .add("cores=" + cores)
                .add("threads=" + threads)
                .add("cost=" + cost)
                .add("name='" + name + "'")
                .toString();
    }
}
