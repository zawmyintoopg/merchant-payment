package com.merchant_payment_portal.payment.dto;

import java.time.LocalDate;

public class MerchantResponse {
    private Long id;
    private String merchantNumber;
    private String merchantName;
    private LocalDate merchantRegDate;
    private String merchantType;
    private String merchantStatus;
    private String bankAccountNumber;
    private String segmentName;
    public MerchantResponse(){

    }
    public MerchantResponse(
            Long id,
            String merchantNumber,
            String merchantName,
            LocalDate merchantRegDate,
            String merchantType,
            String merchantStatus,
            String bankAccountNumber
            , String segmentName){
        this.id = id;
        this.merchantNumber = merchantNumber;
        this.merchantName = merchantName;
        this.merchantRegDate = merchantRegDate;
        this.merchantType = merchantType;
        this.merchantStatus = merchantStatus;
        this.bankAccountNumber = bankAccountNumber;
        this.segmentName = segmentName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getSegmentName(){
        return segmentName;
    }
    public void setSegmentName(String  segmentName){
        this.segmentName = segmentName;
    }
}
