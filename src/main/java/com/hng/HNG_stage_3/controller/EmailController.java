package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.EmailRequest;
import com.hng.HNG_stage_3.payload.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages/")
public class EmailController {

    @PostMapping("email")
    public ResponseEntity<ErrorResponse> login(@RequestBody EmailRequest emailRequest){
        return null;
    }
}
