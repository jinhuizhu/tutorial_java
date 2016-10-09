package com.zjh.learning.jse.collections.list;

import com.zjh.learning.jse.collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jinhui on 10/9/2016.
 */
public class Shipment implements Iterable<Product> {

    public static final int PRODUCT_NOT_PRESENT = -1;
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts = new ArrayList<>();
    private List<Product> heavyVanProducts = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void replace(Product p1, Product p2) {
        final int index = products.indexOf(p1);
        if (index != PRODUCT_NOT_PRESENT) {
            products.set(index, p2);
        }
    }

    public void prepare() {
        // sort out list of products by weight
        products.sort(Product.BY_WEIGHT);

        // find the product index that needs the heavy van
        int splitPoint = findSplitPoint();

        // assign views of the product list of heavy and light vans
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());
    }

    private int findSplitPoint() {
        for (int i = 0; i <products.size(); i++) {
            final Product product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
