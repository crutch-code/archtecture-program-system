package org.example.factories;

import org.example.products.Product;

import java.util.Map;

public interface Factory<E extends Product>{
    E get(Map<String, Object> params);
}
