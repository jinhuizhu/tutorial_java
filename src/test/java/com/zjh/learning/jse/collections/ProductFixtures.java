package com.zjh.learning.jse.collections;

/**
 * Created by jinhui on 10/9/2016.
 */
public class ProductFixtures {
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static final Supplier bobs = new Supplier("Bob's Household Supplies");
    public static final Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floorPanel);

        kates.products().add(floorPanel);
        kates.products().add(door);
        kates.products().add(window);
    }
}
