package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.dto.MerchantRequest;
import com.merchant_payment_portal.payment.dto.MerchantResponse;

import java.util.List;

public interface MerchantService {

    MerchantResponse createMerchant(MerchantRequest request);

    List<MerchantResponse> getAllMerchants();

    MerchantResponse getMerchantById(Long id);

    MerchantResponse updateMerchant(Long id, MerchantRequest request);

    void deleteMerchant(Long id);
}