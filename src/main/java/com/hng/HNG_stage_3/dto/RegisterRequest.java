package com.hng.HNG_stage_3.dto;

import com.hng.HNG_stage_3.model.Organisation;

import java.time.LocalDate;

public class RegisterRequest {


    private Long id;
    private String name;
    private String email;
    private String password;
    private Organisation organisation;
}
