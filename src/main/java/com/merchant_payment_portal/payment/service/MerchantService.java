package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MerchantService {
    private final MerchantRepository merchantRepository;

    public MerchantService(MerchantRepository merchantRepository){
        this.merchantRepository = merchantRepository;
    }

    public List<Merchant> getAllMerchants(){
       return merchantRepository.findAll();
    }

    public Merchant saveMerchant(@RequestBody Merchant merchant){
       return merchantRepository.save(merchant);
    }

    public Merchant getMerchantById(Long id){
        return merchantRepository.findById(id).orElseThrow();
    }

    public void deleteMerchantById(Long id){
        merchantRepository.deleteById(id);
    }

}
