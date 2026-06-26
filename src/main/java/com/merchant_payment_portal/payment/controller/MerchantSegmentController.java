package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.entity.MerchantSegment;
import com.merchant_payment_portal.payment.repository.MerchantRepository;
import com.merchant_payment_portal.payment.repository.MerchantSegmentRepository;
import com.merchant_payment_portal.payment.service.MerchantSegmentService;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/segments")
public class MerchantSegmentController {

    private MerchantSegmentService merchantSegmentService;

    public MerchantSegmentController(MerchantSegmentService merchantSegmentService){
        this.merchantSegmentService = merchantSegmentService;
    }
   //get all records
    @GetMapping
    public List<MerchantSegment> getAllMerchantSegments(){
        return merchantSegmentService.getAllMerchantSegments();
    }
    // get one record merchant
    @GetMapping("/{id}")
    public MerchantSegment getAllMerchantSegmentById(@PathVariable Long id){
        return merchantSegmentService.getMerchantSegmentById(id);
    }
    //save merchant
    @PostMapping
    public MerchantSegment createMerchantSegment(MerchantSegment merchantSegment){
        return merchantSegmentService.saveMerchantSegment(merchantSegment);
    }
    //delete merchant
    @DeleteMapping("/{id}")
    public String deleteMerchantSegment(Long id){
        merchantSegmentService.deleteMerchantSegment(id);
        return "Deleted Successfully";
    }



}
