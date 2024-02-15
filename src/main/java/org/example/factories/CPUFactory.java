package org.example.factories;

import org.example.products.CPU;

import java.util.Map;

public class CPUFactory implements Factory<CPU> {
    @Override
    public CPU get(Map<String, Object> params) {
        return null;
    }
}
