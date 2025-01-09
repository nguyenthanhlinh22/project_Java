package com.dailycodework.springbootbasic.modules.users.controllers;

import com.dailycodework.springbootbasic.modules.users.dtos.LoginRequest;
import com.dailycodework.springbootbasic.modules.users.dtos.LoginResponse;
import com.dailycodework.springbootbasic.modules.users.services.interfaces.UserServiceInterface;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/auth")
public class AuthController {
    private final UserServiceInterface userService;

    public AuthController(UserServiceInterface userService) {
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse auth = userService.login(request);

        return ResponseEntity.ok(auth);
    }


}
