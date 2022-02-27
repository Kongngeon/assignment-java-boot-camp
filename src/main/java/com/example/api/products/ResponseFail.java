package com.example.api.products;

public class ResponseFail {
    private String message;
    private String status = "FAIL";

    public ResponseFail(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }
}
