package org.example.factories;

import org.example.products.SSD;

import java.util.Map;

public class HDDFactory implements Factory<SSD> {
    @Override
    public SSD get(Map<String, Object> params) {
        return null;
    }
}
