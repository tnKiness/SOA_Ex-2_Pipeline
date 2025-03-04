package com.example.pipelineex.core.entities;

import com.example.pipelineex.core.messagequeue.IMessage;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message implements IMessage {
    @Expose @SerializedName("order_info") private OrderInfo orderInfo;
    private String fileContent;

    public Message(OrderInfo orderInfo, String fileContent) {
        this.orderInfo = orderInfo;
        this.fileContent = fileContent;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public String toString() {
        return "Message [orderInfo=" + orderInfo + ", fileContent=" + fileContent + "]";
    }
    
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
