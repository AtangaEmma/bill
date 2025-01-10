package com.example.electricitybill.controller;

public class PaymentResponse {
    private String status;
    private double amountPaid;
    private double billAmount;
    private String message;

    // Constructor
    public PaymentResponse(String status, double amountPaid, double billAmount, String message) {
        this.status = status;
        this.amountPaid = amountPaid;
        this.billAmount = billAmount;
        this.message = message;
    }

    // Getters and setters
    // Edit these methods to customize the response fields as needed
}
