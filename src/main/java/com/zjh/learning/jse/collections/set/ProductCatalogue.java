package com.zjh.learning.jse.collections.set;

import com.zjh.learning.jse.collections.Product;
import com.zjh.learning.jse.collections.Supplier;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by jinhui on 10/9/2016.
 */
public class ProductCatalogue implements Iterable<Product> {

//    private final Set<Product> products = new HashSet<>();

    // TreeSet implements SortedSet, which preserves certain ordering
    private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Set<Product> lightVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProduct);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        for (Product p: products) {
            if (p.getWeight() > 20) {
                return p;
            }
        }
        return products.last();
    }
}
