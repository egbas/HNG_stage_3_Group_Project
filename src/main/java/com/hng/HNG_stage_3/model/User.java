package com.hng.HNG_stage_3.model;

import java.time.LocalDate;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDate creationDate;
    private LocalDate updateDate;
    private Organisation organisation;
}
