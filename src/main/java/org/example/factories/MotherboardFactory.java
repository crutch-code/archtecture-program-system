package org.example.factories;

import org.example.products.Motherboard;

import java.util.Map;

public class MotherboardFactory implements Factory<Motherboard> {
    @Override
    public Motherboard get(Map<String, Object> params) {
        return null;
    }
}
