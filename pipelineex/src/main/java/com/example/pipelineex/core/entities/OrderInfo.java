package com.example.pipelineex.core.entities;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class OrderInfo {
    private List<Order> orders;
    @SerializedName("delivery") private List<Delivery> notes;
    private List<Payment> payments;
    private List<CreditNote> creditNotes;

    public OrderInfo(List<Order> orders, List<Delivery> notes, List<Payment> payments, List<CreditNote> creditNotes) {
        this.orders = orders;
        this.notes = notes;
        this.payments = payments;
        this.creditNotes = creditNotes;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Delivery> getNotes() {
        return notes;
    }

    public void setNotes(List<Delivery> notes) {
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
        return "OrderInfo [orders=" + orders + ", notes=" + notes + ", payments=" + payments + ", creditNotes="
                + creditNotes + "]";
    }
    
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
