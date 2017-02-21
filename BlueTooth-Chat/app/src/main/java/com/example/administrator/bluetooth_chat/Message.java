package com.example.administrator.bluetooth_chat;

/**
 * Created by Administrator on 2017/2/17.
 */
public class Message {
    private int type;
    private String content;
    ;

    public Message() {
    }

    public Message(int type, String content) {
        this.type = type;
        this.content = content;

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}