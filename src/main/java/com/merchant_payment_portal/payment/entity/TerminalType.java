package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="terminaltype")
public class TerminalType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String terminalTypeName;
    private String status;

    public TerminalType(String terminalTypeName, String status){
        this.terminalTypeName = terminalTypeName;
        this.status = status;
    }
    public Long getId(){
        return id;
    }
    public String getTerminalTypeName(){
        return terminalTypeName;
    }
    public String getStatus(){
        return status;
    }
    public void setTerminalTypeName(String terminalTypeName){
        this.terminalTypeName = terminalTypeName;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
