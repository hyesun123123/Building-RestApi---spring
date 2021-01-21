package com.example.myrest;

public class GreetingAcc {
    private final long id;
    private final String content;

    public GreetingAcc(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
