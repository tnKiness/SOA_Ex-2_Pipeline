package com.example.pipelineex.core.entities;

import com.example.pipelineex.core.InvoiceInfo;

public interface IMessage {
    InvoiceInfo getInvoiceInfo();
    void setInvoiceInfo(InvoiceInfo invoiceInfo);
    String getFileContent();
    void setFileContent(String fileContent);
}
