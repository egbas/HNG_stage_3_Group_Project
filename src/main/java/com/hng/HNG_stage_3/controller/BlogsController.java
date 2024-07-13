package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.BlogRequest;
import com.hng.HNG_stage_3.dto.FlutterwavePaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogs/")
public class BlogsController {

    @PostMapping
    public ResponseEntity<ErrorResponse> createBlog(@RequestBody BlogRequest blogRequest){
        return null;
    }
    @GetMapping
    public ResponseEntity<String> getAllBlog(){
        return null;
    }
    @GetMapping("{id}")
    public ResponseEntity<String> getBlogById(@PathVariable Long id){
        return null;
    }
    @PutMapping("{id}")
    public ResponseEntity<String> updateBlog(@PathVariable Long id){
        return null;
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBlog(@PathVariable Long id){
        return null;
    }
}
