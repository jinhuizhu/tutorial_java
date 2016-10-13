package com.zjh.learning.jse.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinhui on 10/10/2016.
 */
public class MapProductLookupTable implements IProductLookupTable {

    private final Map<Integer, LookupableProduct> idToProductMap = new HashMap<>();

    @Override
    public void addProduct(LookupableProduct productToAdd) {
        if (idToProductMap.containsKey(productToAdd.getId())) {
            throw new IllegalArgumentException("Unable to add product, duplicate id for " + productToAdd);
        }
        idToProductMap.put(productToAdd.getId(), productToAdd);
    }

    @Override
    public LookupableProduct lookupById(int id) {
        return idToProductMap.get(id);
    }

    @Override
    public void clear() {
        idToProductMap.clear();
    }
}
