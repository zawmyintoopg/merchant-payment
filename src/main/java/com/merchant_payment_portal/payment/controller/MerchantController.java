package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.dto.MerchantRequest;
import com.merchant_payment_portal.payment.dto.MerchantResponse;
import com.merchant_payment_portal.payment.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/merchants")
@RequiredArgsConstructor
public class MerchantController {

    private final MerchantService service;

    // CREATE
    @PostMapping
    public MerchantResponse createMerchant(@RequestBody MerchantRequest request) {
        return service.createMerchant(request);
    }

    // GET ALL
    @GetMapping
    public List<MerchantResponse> getAllMerchants() {
        return service.getAllMerchants();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public MerchantResponse getMerchantById(@PathVariable Long id) {
        return service.getMerchantById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public MerchantResponse updateMerchant(@PathVariable Long id,
                                           @RequestBody MerchantRequest request) {
        return service.updateMerchant(id, request);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteMerchant(@PathVariable Long id) {
        service.deleteMerchant(id);
        return "Merchant deleted successfully";
    }
}