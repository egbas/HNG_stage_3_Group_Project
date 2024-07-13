package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.RegisterRequest;
import com.hng.HNG_stage_3.dto.UpdateRequest;
import com.hng.HNG_stage_3.payload.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping
    public ResponseEntity<Response> getAll(){

        return null;
    }

    @PostMapping
    public ResponseEntity<Response> createUser(@RequestBody RegisterRequest registerRequest){

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> findUserById(@PathVariable("id") Long id){

        return null;
    }


    @PutMapping("/{id}")
    public ResponseEntity<Response> updateUser(@PathVariable("id") Long id, @RequestBody UpdateRequest updateRequest){

        return null;
    }
}
