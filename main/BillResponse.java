package com.example.electricitybill.controller;

public class BillResponse {
    private int unitsConsumed;
    private double billAmount;
    private String message;

    // Constructor
    public BillResponse(int unitsConsumed, double billAmount, String message) {
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
        this.message = message;
    }

    // Getters and setters
    // Edit these methods to customize the response fields as needed
}
