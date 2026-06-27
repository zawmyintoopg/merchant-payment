    package com.merchant_payment_portal.payment.controller;

    import com.merchant_payment_portal.payment.entity.Merchant;
    import com.merchant_payment_portal.payment.entity.MerchantSegment;
    import com.merchant_payment_portal.payment.service.MerchantSegmentService;
    import com.merchant_payment_portal.payment.service.MerchantService;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/merchants")
    public class MerchantController {

        private MerchantService service;

        public  MerchantController(MerchantService service){
            this.service = service;
        }
        @GetMapping
        public List<Merchant> getAllMerchant(){
           return service.getAllMerchants();
        }
        @GetMapping("/{id}")
        public Merchant getMerchantById(@PathVariable Long id){
            return service.getMerchantById(id);
        }
        @PostMapping
        public Merchant saveMerchant(@RequestBody Merchant merchant){
            return service.saveMerchant(merchant);
        }
        @DeleteMapping("/{id}")
        public void deleteByMerchantId(@PathVariable Long id){
            service.deleteMerchantById(id);
        }

    }
