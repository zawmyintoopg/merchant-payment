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

import java.util.List;

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
    @Override
    public List<MerchantResponse> getAllMerchants() {

        List<Merchant> merchants = merchantRepository.findAll();

        return merchants.stream()
                .map(this::mapToResponse)
                .toList();
    }
    @Override
    public MerchantResponse getMerchantById(Long id) {

        Merchant merchant = merchantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Merchant not found"));

        return mapToResponse(merchant);
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
    @Override
    public MerchantResponse updateMerchant(Long id, MerchantRequest request) {

        Merchant merchant = merchantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Merchant not found"));

        merchant.setMerchantNumber(request.getMerchantNumber());
        merchant.setMerchantName(request.getMerchantName());
        merchant.setMerchantRegDate(request.getMerchantRegDate());
        merchant.setMerchantType(request.getMerchantType());
        merchant.setMerchantStatus(request.getMerchantStatus());
        merchant.setBankAccountNumber(request.getBankAccountNumber());

        Merchant updated = merchantRepository.save(merchant);

        return mapToResponse(updated);
    }

    @Override
    public void deleteMerchant(Long id) {

        Merchant merchant = merchantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Merchant not found"));

        merchantRepository.delete(merchant);
    }

}
