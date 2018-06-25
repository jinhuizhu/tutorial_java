package com.zjh.learning.jse.collections.set;

import org.junit.Test;

import static com.zjh.learning.jse.collections.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Created by jinhui on 10/9/2016.
 */
public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        // order independent, exact match
        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }

    @Test
    public void shouldFindLightVanProducts() {
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
    }

    @Test
    public void shouldFindHeavyVanProducts() {
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
    }
}
