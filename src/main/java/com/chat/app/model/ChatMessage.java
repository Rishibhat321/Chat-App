package com.chat.app.model;

import java.util.Objects;

public class ChatMessage {

    private Long id;
    private String sender;
    private String content;

    public ChatMessage() {}

    public ChatMessage(String content, Long id, String sender) {
        this.content = content;
        this.id = id;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "content='" + content + '\'' +
                ", id=" + id +
                ", sender='" + sender + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChatMessage that = (ChatMessage) o;
        return Objects.equals(id, that.id) && Objects.equals(sender, that.sender) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sender, content);
    }

}
