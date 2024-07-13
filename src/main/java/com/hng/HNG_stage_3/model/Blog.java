package com.hng.HNG_stage_3.model;

import java.time.LocalDate;

public class Blog {
    private Long id;
    private String  title;
    private String  content;
    private LocalDate creationDate;
    private LocalDate updateDate;
    private User authorId;

}
