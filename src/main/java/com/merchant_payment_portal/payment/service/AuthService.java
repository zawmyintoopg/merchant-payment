package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.entity.User;
import com.merchant_payment_portal.payment.repository.UserRepository;
import com.merchant_payment_portal.payment.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor

public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public String login (String username, String password){

        User user = userRepository.findByUsername(username).
                orElseThrow(()->new RuntimeException("User not found !"));
        if(!passwordEncoder.matches(password,user.getUserPassword())){
            throw new RuntimeException("Invalid Password");
        }
        return jwtUtil.generateToken(username);
    }
}
