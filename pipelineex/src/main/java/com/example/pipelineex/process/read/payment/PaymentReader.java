package com.example.pipelineex.process.read.payment;

import com.example.pipelineex.core.entities.Payment;
import com.example.pipelineex.core.messagequeue.IMessage;
import com.example.pipelineex.pipes.IFilter;

public class PaymentReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Payments...");
        for (Payment payment : input.getOrderInfo().getPayments()) {
            System.out.println("Payment ID: " + payment.getPaymentId() + ", Card Number: " + payment.getCardNumber());
        }
        return input;
    }
}
