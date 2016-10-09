package com.zjh.learning.jse.collections;

import com.google.common.base.MoreObjects;

import java.util.Comparator;

/**
 * Created by jinhui on 10/9/2016.
 */
public class Product {
    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper("Product")
                .add("name", name)
                .add("weight", weight)
                .toString();
    }


//    public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
//        @Override
//        public int compare(Product o1, Product o2) {
//            return Integer.compare(o1.getWeight(), o2.getWeight());
//        }
//    };

    // comparator in java8
    public static final Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);
}
