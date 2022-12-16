package com.zjh.learning.jse.collections.list;


import org.junit.jupiter.api.Test;

import static com.zjh.learning.jse.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * Created by jinhui on 10/9/2016.
 */
public class ShipmentTest {
    private final Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() {
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment, contains(door, window));
    }

    @Test
    public void shouldReplaceItems() {
        shipment.add(door);
        shipment.add(window);
        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(floorPanel, window));
    }

    @Test
    public void shouldNotReplaceMissingItems() {
        shipment.add(window);
        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(window));
    }

    @Test
    public void shouldIdentifyVanRequirements() {
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();

        assertThat(shipment.getLightVanProducts(), contains(window));

        // contains also checks for order, so "contains(door, floorPanel)" won't work here
        assertThat(shipment.getHeavyVanProducts(), contains(floorPanel, door));
    }
}
