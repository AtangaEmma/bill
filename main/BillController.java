package com.example.electricitybill.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bill")
public class BillController {

    @GetMapping("/calculate")
    public BillResponse calculateBill(@RequestParam int units) {
        double billAmount = calculateElectricityBill(units);
        return new BillResponse(units, billAmount, "Bill calculated successfully");
    }

    @PostMapping("/pay")
    public PaymentResponse payBill(@RequestBody PaymentRequest request) {
        double billAmount = calculateElectricityBill(request.getUnits());
        if (request.getAmountPaid() >= billAmount) {
            return new PaymentResponse("Payment successful", request.getAmountPaid(), billAmount, "Thank you for your payment!");
        } else {
            return new PaymentResponse("Payment failed", request.getAmountPaid(), billAmount, "Insufficient amount. Please pay the full bill.");
        }
    }

    // Edit this method to customize the bill calculation logic
    private double calculateElectricityBill(int units) {
        double ratePerUnit;
        if (units <= 100) {
            ratePerUnit = 1.5;
        } else if (units <= 300) {
            ratePerUnit = 2.5;
        } else {
            ratePerUnit = 4.0;
        }
        return units * ratePerUnit;
    }
}
