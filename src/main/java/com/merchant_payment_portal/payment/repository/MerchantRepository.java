package com.merchant_payment_portal.payment.repository;

import com.merchant_payment_portal.payment.entity.Merchant;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
