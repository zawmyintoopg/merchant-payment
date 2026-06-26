package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.entity.MerchantSegment;
import com.merchant_payment_portal.payment.service.MerchantSegmentService;

import java.util.List;

public class MerchantController {

    private MerchantSegmentService service;

    public List<MerchantSegment> getAllMerchant(){
       return service.getAllMerchantSegments();
    }
}
