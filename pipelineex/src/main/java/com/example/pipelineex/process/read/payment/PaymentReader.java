package com.example.pipelineex.process.read.payment;

import com.example.pipelineex.core.Payment;
import com.example.pipelineex.core.entities.IFilter;
import com.example.pipelineex.core.entities.IMessage;

public class PaymentReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Payments...");
        for (Payment payment : input.getInvoiceInfo().getPayments()) {
            System.out.println("Payment ID: " + payment.getPaymentId() + ", Card Number: " + payment.getCardNumber());
        }
        return input;
    }
}
