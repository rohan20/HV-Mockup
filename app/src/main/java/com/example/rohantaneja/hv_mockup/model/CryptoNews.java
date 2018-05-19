package com.example.rohantaneja.hv_mockup.model;

public class CryptoNews {

    private String title;
    private String source;
    private String timestamp;

    public CryptoNews(String title, String source, String timestamp) {
        this.title = title;
        this.source = source;
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public String getSource() {
        return source;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
