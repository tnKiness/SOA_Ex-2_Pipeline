package com.example.pipelineex.process.read.note;

import com.example.pipelineex.core.entities.Delivery;
import com.example.pipelineex.core.messagequeue.IMessage;
import com.example.pipelineex.pipes.IFilter;

public class NoteReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Notes...");
        for (Delivery note : input.getOrderInfo().getNotes()) {
            System.out.println("Note ID: " + note.getNoteId() + ", Delivery Address: " + note.getDeliveryAdd());
        }
        return input;
    }
}
