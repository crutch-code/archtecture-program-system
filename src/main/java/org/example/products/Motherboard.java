package org.example.products;

import java.util.StringJoiner;

public class Motherboard extends Product{

    private String socket;

    private String chipset;

    private Short memorySlots;


    public Motherboard(Double cost, String name, String socket, String chipset, Short memorySlots) {
        super(cost, name);
        this.socket = socket;
        this.chipset = chipset;
        this.memorySlots = memorySlots;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public Short getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(Short memorySlots) {
        this.memorySlots = memorySlots;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Motherboard.class.getSimpleName() + "[", "]")
                .add("socket='" + socket + "'")
                .add("chipset='" + chipset + "'")
                .add("memorySlots=" + memorySlots)
                .add("cost=" + cost)
                .add("name='" + name + "'")
                .add("produced='" + produced + "'")
                .toString();
    }
}
