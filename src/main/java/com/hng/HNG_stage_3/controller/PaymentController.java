package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.FlutterwavePaymentRequest;
import com.hng.HNG_stage_3.dto.StripePaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments/")
public class PaymentController {

    @PostMapping("stripe")
    public ResponseEntity<ErrorResponse> stripe(@RequestBody StripePaymentRequest stripePaymentRequest){
        return null;
    }
    @PostMapping("flutterwave")
    public ResponseEntity<ErrorResponse> flutterwave(@RequestBody FlutterwavePaymentRequest flutterwavePaymentRequest){
        return null;
    }
}
