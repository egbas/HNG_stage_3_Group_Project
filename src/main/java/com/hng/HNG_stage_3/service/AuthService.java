package com.hng.HNG_stage_3.service;

import com.hng.HNG_stage_3.dto.ChangePasswordRequest;
import com.hng.HNG_stage_3.dto.LoginRequest;
import com.hng.HNG_stage_3.dto.MagicLinkRequest;
import com.hng.HNG_stage_3.payload.AuthResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public AuthResponse login(LoginRequest loginRequest){
        return null;
    }

    public AuthResponse magicLink(MagicLinkRequest magicLinkRequest){
        return null;
    }

    public AuthResponse changePassword(ChangePasswordRequest changePasswordRequest){
        return null;
    }
}
