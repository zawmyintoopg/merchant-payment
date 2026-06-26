package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="merchantsegment")
public class MerchantSegment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="segment_code")
    private String segmentCode;
    @Column(name="segment_name")
    private String segmentName;
    private String status;
    @OneToMany(mappedBy = "merchantSegment")
    private List<Merchant> merchants;
    public MerchantSegment(){

    }
    public MerchantSegment(String segmentCode,String segmentName, String status){
        this.segmentName = segmentName;
        this.status = status;
    }

    public Long getId(){
        return id;
    }
    public String getSegmentCode(){return  segmentCode;}
    public String getSegmentName(){
        return segmentName;
    }

    public String getStatus(){
        return status;
    }
    public void setSegmentCode(String segmentCode){this.segmentCode = segmentCode;}
    public void setSegmentName(String segmentName){
        this.segmentName = segmentName;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
