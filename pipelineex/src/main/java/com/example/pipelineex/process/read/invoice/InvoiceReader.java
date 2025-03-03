package com.example.pipelineex.process.read.invoice;

import com.example.pipelineex.core.Invoice;
import com.example.pipelineex.core.entities.IFilter;
import com.example.pipelineex.core.entities.IMessage;

public class InvoiceReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Invoices...");
        for (Invoice invoice : input.getInvoiceInfo().getInvoices()) {
            System.out.println("Invoice ID: " + invoice.getInvoiceId() + ", Product ID: " + invoice.getProductId());
        }
        return input;    }
}
