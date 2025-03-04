package com.example.pipelineex.core.messagequeue;

import com.example.pipelineex.core.entities.OrderInfo;

public interface IMessage {
    OrderInfo getOrderInfo();
    void setOrderInfo(OrderInfo orderInfo);
    String getFileContent();
    void setFileContent(String fileContent);
}
