package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.BlogRequest;
import com.hng.HNG_stage_3.dto.LanguageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    @PostMapping
    public ResponseEntity<ErrorResponse> createLanguages(@RequestBody LanguageRequest languageRequest){
        return null;
    }
    @GetMapping
    public ResponseEntity<String> getAllLanguages(){
        return null;
    }
}
