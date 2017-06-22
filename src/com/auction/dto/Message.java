package com.auction.dto;

import com.auction.dto.response.ClientResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazmul hasan
 */
public class Message extends ClientResponse implements Serializable
{
    private int id;
    private User from;
    private User to;
    Product product;
    private String subject;
    private long createdOn;
    //this will not be added into the database
    private List<MessageText> messageTextList;
    private String createdTime;
    public Message()
    {
        messageTextList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<MessageText> getMessageTextList() {
        return messageTextList;
    }

    public void setMessageTextList(List<MessageText> messageTextList) {
        this.messageTextList = messageTextList;
    }
    
    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
