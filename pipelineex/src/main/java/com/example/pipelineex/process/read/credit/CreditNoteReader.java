package com.example.pipelineex.process.read.credit;

import com.example.pipelineex.core.CreditNote;
import com.example.pipelineex.core.entities.IFilter;
import com.example.pipelineex.core.entities.IMessage;
import com.google.gson.Gson;

public class CreditNoteReader implements IFilter<IMessage> {
    @Override
    public IMessage execute(IMessage input) {
        System.out.println("Processing Credit Notes...");
        for (CreditNote creditNote : input.getInvoiceInfo().getCreditNotes()) {
            System.out.println("Credit Note: " + creditNote.getCreditNote() + ", Notes: " + creditNote.getNotes());
        }
        return input;
    }
}
