package com.zjh.learning.jse.collections.map;

import com.google.common.base.MoreObjects;
import com.zjh.learning.jse.collections.Product;

/**
 * Created by jinhui on 10/10/2016.
 */
public class LookupableProduct extends Product {
    private final int id;

    public LookupableProduct(int id, String name, int weight) {
        super(name, weight);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper("LookupableProduct")
                .add("id", id)
                .add("name", name)
                .add("weight", weight)
                .toString();
    }
}
