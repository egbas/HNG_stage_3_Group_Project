package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.LanguageRequest;
import com.hng.HNG_stage_3.dto.RegionRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/regions/")
public class RegionsController {
    @PostMapping
    public ResponseEntity<ErrorResponse> createRegion(@RequestBody RegionRequest regionRequest){
        return null;
    }
    @GetMapping
    public ResponseEntity<String> getAllRegions(){
        return null;
    }
}
