package com.zjh.learning.jse.collections.queue;

import com.google.common.base.MoreObjects;

/**
 * Created by jinhui on 10/9/2016.
 */
public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Enquiry(Customer customer, Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper("Enquiry")
                .add("customer", customer)
                .add("category", category)
                .toString();
    }
}
