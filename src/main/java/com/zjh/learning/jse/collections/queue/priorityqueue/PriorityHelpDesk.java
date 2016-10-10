package com.zjh.learning.jse.collections.queue.priorityqueue;

import com.zjh.learning.jse.collections.queue.Category;
import com.zjh.learning.jse.collections.queue.Customer;
import com.zjh.learning.jse.collections.queue.Enquiry;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by jinhui on 10/10/2016.
 */
public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = (o1, o2) -> o1.getCategory().compareTo(o2.getCategory());

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        while (!enquiries.isEmpty()) {
            Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquiries();
    }
}
