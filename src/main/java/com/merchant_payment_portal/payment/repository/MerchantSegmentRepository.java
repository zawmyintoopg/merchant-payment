package com.merchant_payment_portal.payment.repository;

import com.merchant_payment_portal.payment.entity.Merchant;
import com.merchant_payment_portal.payment.entity.MerchantSegment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantSegmentRepository extends JpaRepository<MerchantSegment, Long> {

}
