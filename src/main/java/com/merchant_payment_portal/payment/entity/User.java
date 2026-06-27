package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "User name is Required")
    @Column(name="user_name",nullable = false,unique = true)
    private String userName;
    @NotBlank(message = "User Password is Required")
    @Column(name="user_password",nullable = false)
    private String userPassword;
    private String role;
    public User(){

    }
    public User(String userName, String userPassword, String role){
        this.userName = userName;
        this.userPassword = userPassword;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getUserName(){
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

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }
}
