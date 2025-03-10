package com.example.pipelineex.process.read.credit;

import com.example.pipelineex.core.entities.CreditNote;
import com.example.pipelineex.core.messagequeue.IMessage;
import com.example.pipelineex.pipes.IFilter;

public class CreditNoteReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Credit Notes...");
        for (CreditNote creditNote : input.getOrderInfo().getCreditNotes()) {
            System.out.println("Credit Note: " + creditNote.getCreditNote() + ", Notes: " + creditNote.getNotes());
        }
        return input;
    }
}
