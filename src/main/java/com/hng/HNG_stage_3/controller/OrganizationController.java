package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.CreateRequest;
import com.hng.HNG_stage_3.payload.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @GetMapping
    public ResponseEntity<Response> getAll(){

        return null;
    }

    @PostMapping
    public ResponseEntity<Response> createOrg(@RequestBody CreateRequest createRequest){

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getOrgById(@PathVariable("id") Long id){

        return null;
    }


}
