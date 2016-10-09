package com.zjh.learning.jse.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static com.zjh.learning.jse.collections.queue.Category.PRINTER;

/**
 * Created by jinhui on 10/9/2016.
 */
public class CategorizedHelpDesk {

    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category category) {
        return enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        processEnquiry(enquiry -> enquiry.getCategory() == PRINTER, "Is it out of paper?");
    }

    public void processGeneralEnquiry() {
        processEnquiry(enquiry -> enquiry.getCategory() != PRINTER, "Have you tried turning it off and on again?");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public static void main(String[] args) {
        CategorizedHelpDesk helpDesk = new CategorizedHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
