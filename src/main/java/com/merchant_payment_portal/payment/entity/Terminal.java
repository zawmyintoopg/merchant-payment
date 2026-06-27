package com.merchant_payment_portal.payment.entity;


import jakarta.persistence.*;


@Entity
@Table(name="terminal")
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "terminal_number")
    private String terminalNumber;
    @Column(name="terminal_serialnumber")
    private String terminalSerialNumber;
    @ManyToOne
    @JoinColumn(name="terminal_type_id")
    private TerminalType terminalType;
    private String status;

    public Terminal(){

    }

    public Terminal(String terminalNumber,String terminalSerialNumber, String status){
        this.terminalNumber = terminalNumber;
        this.terminalSerialNumber = terminalSerialNumber;
        this.status = status;
    }
    public Long getId(){
        return id;
    }
    public String getTerminalNumber(){
        return terminalNumber;
    }
    public String getTerminalSerialNumber(){
        return terminalSerialNumber;
    }
    public String getStatus(){
        return status;
    }
    public void setTerminalNumber(String terminalNumber){
        this.terminalNumber = terminalNumber;
    }
    public void setTerminalSerialNumber(String terminalSerialNumber){
        this.terminalSerialNumber = terminalSerialNumber;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
