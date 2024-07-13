package com.hng.HNG_stage_3.service;

import com.hng.HNG_stage_3.dto.FlutterwavePaymentRequest;
import com.hng.HNG_stage_3.dto.LoginRequest;
import com.hng.HNG_stage_3.dto.StripePaymentRequest;
import com.hng.HNG_stage_3.payload.AuthResponse;
import com.hng.HNG_stage_3.payload.ErrorResponse;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public ErrorResponse stripe(StripePaymentRequest stripePaymentRequest){
        return null;
    }

    public AuthResponse flutterwave(FlutterwavePaymentRequest flutterwavePaymentRequest){
        return null;
    }
}
