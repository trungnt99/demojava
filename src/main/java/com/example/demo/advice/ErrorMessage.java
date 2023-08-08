package com.example.demo.advice;

import java.util.Calendar;
import java.util.Date;

public class ErrorMessage {
    private int statusCode;
    private Date timesStamp;
    private String message;
    private String description;

    public ErrorMessage(int statusCode, Date timesStamp, String message, String description) {
        this.statusCode = statusCode;
        this.timesStamp = timesStamp;
        this.message = message;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Date getTimesStamp() {
        return timesStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
