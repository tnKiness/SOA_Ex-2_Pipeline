package com.example.pipelineex.core;

import com.google.gson.Gson;

public class Invoice {
    private long invoiceId;
    private long custId;
    private long productId;
    private long quantity;
    private String description;
    
    public Invoice(long invoiceId, long custId, long productId, long quantity, String description) {
        this.invoiceId = invoiceId;
        this.custId = custId;
        this.productId = productId;
        this.quantity = quantity;
        this.description = description;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Invoice [invoiceId=" + invoiceId + ", custId=" + custId + ", productId=" + productId + ", quantity="
                + quantity + ", description=" + description + "]";
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
