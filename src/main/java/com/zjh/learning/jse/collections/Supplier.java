package com.zjh.learning.jse.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinhui on 10/9/2016.
 */
public class Supplier {
    private final String name;
    private Set<Product> products = new HashSet<>();

    public Supplier(String name) {
        this.name = name;
    }

    public Set<Product> products() {
        return this.products;
    }
}
