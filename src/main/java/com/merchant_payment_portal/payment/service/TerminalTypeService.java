package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.entity.TerminalType;
import com.merchant_payment_portal.payment.repository.TerminalTypeRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TerminalTypeService {
    private final TerminalTypeRepository repository;

    public TerminalTypeService(TerminalTypeRepository repository){
        this.repository = repository;
    }

    public List<TerminalType> terminalTypeList(){
        return repository.findAll();
    }

    public TerminalType getByTerminalTypeId(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    public TerminalType saveTerminalType(@RequestBody TerminalType terminalType){
        return repository.save(terminalType);
    }

    public String deleteByTerminalType(Long id){
        repository.deleteById(id);
        return "Deleted Successfully";
    }
//https://chatgpt.com/c/6a3f8da3-6ae4-83ec-b1ba-e87b9063505f?mweb_fallback=1
}
