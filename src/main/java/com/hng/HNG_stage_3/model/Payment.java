package com.hng.HNG_stage_3.model;

import com.hng.HNG_stage_3.enums.PaymentProvider;

import java.time.LocalDate;

public class Payment {
    private Long id;
    private Number  amount;
    private String currency;
    private PaymentProvider provider;
    private String status;
    private LocalDate createdAt;
    private User user;

}
