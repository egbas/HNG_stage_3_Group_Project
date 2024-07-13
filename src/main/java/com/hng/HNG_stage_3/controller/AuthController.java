package com.hng.HNG_stage_3.controller;

import com.hng.HNG_stage_3.dto.ChangePasswordRequest;
import com.hng.HNG_stage_3.dto.LoginRequest;
import com.hng.HNG_stage_3.dto.MagicLinkRequest;
import com.hng.HNG_stage_3.payload.AuthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/")
public class AuthController {

    @PostMapping("login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest){
        return null;
    }

    @PostMapping("magic-link")
    public ResponseEntity<AuthResponse> magicLink(MagicLinkRequest magicLinkRequest){
        return null;
    }

    @PostMapping("change-password")
    public ResponseEntity<AuthResponse> changePassword(ChangePasswordRequest changePasswordRequest){
        return null;
    }
}
