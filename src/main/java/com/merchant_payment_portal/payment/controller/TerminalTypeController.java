package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.entity.TerminalType;
import com.merchant_payment_portal.payment.repository.TerminalTypeRepository;
import com.merchant_payment_portal.payment.service.TerminalTypeService;

public class TerminalTypeController {
    private final TerminalTypeService service;

    public TerminalTypeController(TerminalTypeService service){
        this.service = service;
    }


}
