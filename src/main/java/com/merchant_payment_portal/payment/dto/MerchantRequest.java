package com.merchant_payment_portal.payment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;


public class MerchantRequest {
    @NotBlank(message = "Merchant Number is Required")
    @Size(max=20,message = "Merchant Number Can not greater than 20")
    private String merchantNumber;
    @NotBlank(message = "Merchant Name is Required")
    private String merchantName;
    @NotNull(message = "Merchant Registration is Required")
    private LocalDate merchantRegDate;
    @NotBlank(message = "Merchant Type is Required")
    private String merchantType;
    @NotBlank(message = "Merchant Status is Required")
    private String merchantStatus;
    @NotBlank(message = "Merchant Account Number is Required")
    private String bankAccountNumber;
    @NotNull(message = "Merchant Segment is Required")
    private Long segmentId;

    public MerchantRequest(){

    }
    public MerchantRequest(
            String merchantNumber,
            String merchantName,
            LocalDate merchantRegDate,
            String merchantType,
            String merchantStatus,
            String bankAccountNumber
            , Long segmentId){
        this.merchantNumber = merchantNumber;
        this.merchantName = merchantName;
        this.merchantRegDate = merchantRegDate;
        this.merchantType = merchantType;
        this.merchantStatus = merchantStatus;
        this.bankAccountNumber = bankAccountNumber;
        this.segmentId = segmentId;
    }

    public String getMerchantNumber(){
        return merchantNumber;
    }
    public void setMerchantNumber(String merchantNumber){
        this.merchantNumber= merchantNumber;
    }
    public String getMerchantName(){
        return merchantName;
    }
    public void setMerchantName(String merchantName){
        this.merchantName = merchantName;
    }
    public LocalDate getMerchantRegDate(){
        return merchantRegDate;
    }
    public void setMerchantRegDate(LocalDate merchantRegDate){
        this.merchantRegDate = merchantRegDate;
    }
    public String getMerchantType(){
        return merchantType;
    }
    public void setMerchantType(String  merchantType){
        this.merchantType = merchantType;
    }
    public String getMerchantStatus(){
        return merchantStatus;
    }
    public void setMerchantStatus(String  merchantStatus){
        this.merchantStatus = merchantStatus;
    }
    public String getBankAccountNumber(){
        return bankAccountNumber;
    }
    public void setBankAccountNumber(String  bankAccountNumber){
        this.bankAccountNumber = bankAccountNumber;
    }
    public Long getSegmentId(){
        return segmentId;
    }
    public void setSegmentId(Long segmentId){
        this.segmentId = segmentId;
    }
}
