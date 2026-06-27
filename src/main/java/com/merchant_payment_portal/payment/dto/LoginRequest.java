package com.merchant_payment_portal.payment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequest {
    @NotBlank(message = "User name is required")
    private String userName;
    @NotBlank(message = "User password is required")
    @Size(max=10,message = "Password is 10 is much")
    private String userPassword;
    public LoginRequest(){

    }
    public LoginRequest(String userName,String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserPassword(){
        return userPassword;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
}
