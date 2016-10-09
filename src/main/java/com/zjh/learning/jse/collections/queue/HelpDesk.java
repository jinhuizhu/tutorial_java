package com.zjh.learning.jse.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by jinhui on 10/9/2016.
 */
public class HelpDesk {

    private final Queue<Enquiry> enquiryQueue = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        enquiryQueue.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        // remove()
        while (!enquiryQueue.isEmpty()) {
            final Enquiry enquiry = enquiryQueue.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }

//        // poll(): returns null if the Q is empty.
//        Enquiry enquiry;
//        while ((enquiry = enquiryQueue.poll()) != null) {
//            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
//        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processAllEnquiries();
    }
}
