package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.dto.MerchantRequest;
import com.merchant_payment_portal.payment.dto.MerchantResponse;
import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface MerchantService {
    MerchantResponse createMerchant(MerchantRequest request);
}
