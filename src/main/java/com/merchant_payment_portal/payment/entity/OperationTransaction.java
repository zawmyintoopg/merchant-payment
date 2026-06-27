package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name="operation_transaction")
public class OperationTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    @Column(name = "transaction_datetime")
    private LocalDateTime transactionDateTime;

    @Column(name = "settlement_datetime")
    private LocalDateTime settlementDateTime;

    @Column(name = "transaction_amount")
    private Double transactionAmount;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_type")
    private String cardType;

    @JoinColumn(name="merchant_id")
    @ManyToOne
    private Merchant merchant;

    @JoinColumn(name="terminal_id")
    @ManyToOne
    private Terminal terminal;
    private String status;

    public OperationTransaction(){

    }
    public Long getId(){
        return id;
    }
    public String getRef(){
        return ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public LocalDateTime getTransactionDateTime(){
        return transactionDateTime;
    }
    public void setTransactionDateTime(LocalDateTime transactionDateTime){
        this.transactionDateTime = transactionDateTime;
    }
    public LocalDateTime getSettlementDateTime(){
        return settlementDateTime;
    }
    public void setSettlementDateTime(LocalDateTime settlementDateTime){
        this.settlementDateTime = settlementDateTime;
    }
    public Double getTransactionAmount(){
        return transactionAmount;
    }
    public void setTransactionAmount(Double transactionAmount){
        this.transactionAmount = transactionAmount;
    }
    public String  getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getCardType(){
        return cardType;
    }
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    public Merchant getMerchant(){
        return merchant;
    }
    public void setMerchant(Merchant merchant){
        this.merchant = merchant;
    }
    public Terminal getTerminal(){
        return terminal;
    }
    public void setTerminal(Terminal terminalId) {
        this.terminal = terminalId;
    }
    public String getStatus(){
        return status;
    }
    public void SetStatus(String status){
        this.status = status;
    }

}
