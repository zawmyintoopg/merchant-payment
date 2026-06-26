package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.entity.MerchantSegment;
import com.merchant_payment_portal.payment.service.MerchantSegmentService;
import com.merchant_payment_portal.payment.service.MerchantService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/merchants")
public class MerchantController {

    private MerchantService service;

    public List<Merchant> getAllMerchant(){
       return service.getAllMerchants();
    }
    public Merchant getMerchantById(@PathVariable Long id){
        return service.getMerchantById(id);
    }

    public Merchant saveMerchant(Merchant merchant){
        return service.saveMerchant(merchant);
    }
    public void deleteByMerchantId(Long id){
        service.deleteMerchantById(id);
    }

}
