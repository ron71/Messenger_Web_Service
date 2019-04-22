package com.infinitybehind.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

//JAXP changes the code to XML, but it needs a clue to know what it has to convert to XML, i.e is annotation

@XmlRootElement

public class Message {
    private long id;
    private String message;
    private String author;
    private Date created;

    public Message() {
    }

    public Message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}