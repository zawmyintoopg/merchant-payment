package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;

@Entity
@Table(name="terminal_type")
public class TerminalType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="terminal_type_name")
    private String terminalTypeName;
    private String status;
    public TerminalType(){

    }
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
