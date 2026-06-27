package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.dto.MerchantRequest;
import com.merchant_payment_portal.payment.dto.MerchantResponse;
import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.entity.MerchantSegment;
import com.merchant_payment_portal.payment.exception.ResourceNotFoundException;
import com.merchant_payment_portal.payment.repository.MerchantRepository;
import com.merchant_payment_portal.payment.repository.MerchantSegmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService{
    private final MerchantRepository merchantRepository;
    private final MerchantSegmentRepository merchantSegmentRepository;

    @Override
    public MerchantResponse createMerchant(MerchantRequest request){

        //check duplicate
        if(merchantRepository.existsByMerchantNumber(request.getMerchantNumber())) {
            throw new RuntimeException("Merchant Number already exists with number "+request.getMerchantNumber());
        }
        //find segment id
        MerchantSegment merchantSegment = merchantSegmentRepository.findById(request.getSegmentId()).orElseThrow(()->new ResourceNotFoundException("Merchant Segment not found"));
        // DTO and Entity Map
        Merchant merchant = new Merchant(
                request.getMerchantNumber(),
                request.getMerchantName(),
                request.getMerchantRegDate(),
                request.getMerchantType(),
                request.getMerchantStatus(),
                request.getBankAccountNumber(),
                merchantSegment
        );
        //save to DB
        Merchant savedMerchant = merchantRepository.save(merchant);
        // response
        return mapToResponse(savedMerchant);

    }
    private MerchantResponse mapToResponse(Merchant successMerchant){

        // map entity -> response DTo
        return new MerchantResponse(
                successMerchant.getId(),
                successMerchant.getMerchantNumber(),
                successMerchant.getMerchantName(),
                successMerchant.getMerchantRegDate(),
                successMerchant.getMerchantType(),
                successMerchant.getMerchantStatus(),
                successMerchant.getBankAccountNumber(),
                successMerchant.getMerchantSegment().getSegmentName()
        );
    }

}
