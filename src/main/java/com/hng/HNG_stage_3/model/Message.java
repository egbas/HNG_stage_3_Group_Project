package com.hng.HNG_stage_3.model;

import java.time.LocalDate;

public class Message {
    private Long id;
    private String  emailTo;
    private String subject;
    private String  body;
    private LocalDate sentAt;
    private LocalDate   createdAt;
    private User user;

}
