package com.example.pipelineex.process.read.invoice;

import com.example.pipelineex.core.entities.Order;
import com.example.pipelineex.core.messagequeue.IMessage;
import com.example.pipelineex.pipes.IFilter;

public class InvoiceReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Invoices...");
        for (Order invoice : input.getOrderInfo().getOrders()) {
            System.out.println("Invoice ID: " + invoice.getOrderId() + ", Product ID: " + invoice.getProductId());
        }
        return input;    }
}
