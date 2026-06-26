package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.entity.MerchantSegment;
import com.merchant_payment_portal.payment.repository.MerchantRepository;
import com.merchant_payment_portal.payment.repository.MerchantSegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantSegmentService {
    @Autowired
    private MerchantSegmentRepository repository;

    public List<MerchantSegment> getAllMerchantSegments(){
        return repository.findAll();
    }
    public MerchantSegment saveMerchantSegment(MerchantSegment merchantSegment){
        return repository.save(merchantSegment);
    }
    public MerchantSegment getMerchantSegmentById(Long id){
        return repository.findById(id).orElse(null);
    }
    public void deleteMerchantSegment(Long id){
        repository.deleteById(id);
    }




}
