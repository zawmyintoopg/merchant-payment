package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.dto.LoginRequest;
import com.merchant_payment_portal.payment.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthController {
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        return authService.login(request.getUserName(),request.getUserPassword());
    }

}
