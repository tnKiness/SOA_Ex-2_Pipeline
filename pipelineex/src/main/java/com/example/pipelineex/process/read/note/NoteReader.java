package com.example.pipelineex.process.read.note;

import com.example.pipelineex.core.Note;
import com.example.pipelineex.core.entities.IFilter;
import com.example.pipelineex.core.entities.IMessage;

public class NoteReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Notes...");
        for (Note note : input.getInvoiceInfo().getNotes()) {
            System.out.println("Note ID: " + note.getNoteId() + ", Delivery Address: " + note.getDeliveryAdd());
        }
        return input;
    }
}
