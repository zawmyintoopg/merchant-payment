package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.repository.MerchantRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class MerchantService {
    private MerchantRepository merchantRepository;

    public List<Merchant> getAllMerchants(){
       return merchantRepository.findAll();
    }

    public Merchant saveMerchant(Merchant merchant){
       return merchantRepository.save(merchant);
    }

    public Merchant getMerchantById(@PathVariable Long id){
        return merchantRepository.findById(id).orElseThrow();
    }

    public void deleteMerchantById(@PathVariable Long id){
        merchantRepository.deleteById(id);
    }

}
