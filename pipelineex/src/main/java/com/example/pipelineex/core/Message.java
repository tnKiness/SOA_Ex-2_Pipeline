package com.example.pipelineex.core;

import com.google.gson.Gson;

public class Message {
    private InvoiceInfo invoiceInfo;
    private String fileContent;

    public Message(InvoiceInfo invoiceInfo, String fileContent) {
        this.invoiceInfo = invoiceInfo;
        this.fileContent = fileContent;
    }

    public InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public String toString() {
        return "Message [invoiceInfo=" + invoiceInfo + ", fileContent=" + fileContent + "]";
    }
    
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
