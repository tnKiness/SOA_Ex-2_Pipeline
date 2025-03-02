package com.example.pipelineex.core;

import java.util.List;

import com.google.gson.Gson;

public class InvoiceInfo {
    private List<Invoice> invoices;
    private List<Note> notes;
    private List<Payment> payments;
    private List<CreditNote> creditNotes;

    public InvoiceInfo(List<Invoice> invoices, List<Note> notes, List<Payment> payments, List<CreditNote> creditNotes) {
        this.invoices = invoices;
        this.notes = notes;
        this.payments = payments;
        this.creditNotes = creditNotes;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<CreditNote> getCreditNotes() {
        return creditNotes;
    }

    public void setCreditNotes(List<CreditNote> creditNotes) {
        this.creditNotes = creditNotes;
    }

    @Override
    public String toString() {
        return "InvoiceInfo [invoices=" + invoices + ", notes=" + notes + ", payments=" + payments + ", creditNotes="
                + creditNotes + "]";
    }
    
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
