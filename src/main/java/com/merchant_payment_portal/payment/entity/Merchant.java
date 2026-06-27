package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.Mapping;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="merchant")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "merchant_number")
    private String merchantNumber;
    @Column(name = "merchant_name")
    private String merchantName;
    @Column(name = "merchant_reg_date")
    private LocalDate merchantRegDate;
    @Column(name = "merchant_type")
    private String merchantType;
    @Column(name = "merchant_status")
    private String mechantStatus;
    @Column(name = "account_number")
    private String accountNumber;
    @ManyToOne
    @JoinColumn(name="segment_id")
    private MerchantSegment merchantSegment;


}