package com.zjh.learning.jse.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by jinhui on 10/9/2016.
 */
public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);

        // Iterator
        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product p = productIterator.next();
            if (p.getWeight() > 20) {
                System.out.println(p);
            } else {
                // we can remove an element with an iterator.
                productIterator.remove();
            }
        }
        System.out.println(products);

//        // for each loop:  we can't remove an element in a for-each loop
//        for (Product p: products) {
//            System.out.println(p);
//        }

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(door));
        System.out.println(products.contains(window));


        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);
        products.removeAll(otherProducts);
        System.out.println(products);
    }
}
