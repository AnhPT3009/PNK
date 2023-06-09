package com.example.appqr.models;

import java.util.List;

public class SkDetailModel {
    private boolean success;
    private String message;
    private List<SkDetail> result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SkDetail> getResult() {
        return result;
    }

    public void setResult(List<SkDetail> result) {
        this.result = result;
    }
}
