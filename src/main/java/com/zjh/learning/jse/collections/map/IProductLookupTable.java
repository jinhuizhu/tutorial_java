package com.zjh.learning.jse.collections.map;

/**
 * Created by jinhui on 10/10/2016.
 */
public interface IProductLookupTable {

    void addProduct(final LookupableProduct productToAdd);

    LookupableProduct lookupById(final int id);

    void clear();
}
