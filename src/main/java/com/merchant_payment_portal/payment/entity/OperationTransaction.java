package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class OperationTransaction {
    private Long id;
    private String ref;
    @Column(name = "transaction_datetime")
    private LocalDateTime transactionDateTime;

    @Column(name = "settlement_datetime")
    private LocalDateTime settlementDateTime;

    @Column(name = "transaction_amount")
    private Double transaction_amount;

    @Column(name = "card_number")
    private String card_number;

    @Column(name = "card_type_id")
    private String card_type_id;

    @JoinColumn(name="merchant_id")
    @ManyToOne
    private Merchant merchant;

    @JoinColumn(name="terminal_id")
    @ManyToOne
    private Terminal terminal;

    public OperationTransaction(){

    }

    public Long getId(){
        return id;
    }

    public String ref(){
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

    public Double getTransaction_amount(){
        return transaction_amount;
    }
    public void setTransaction_amount(Double transaction_amount){
        this.transaction_amount = transaction_amount;
    }

    public String  getCard_number(){
        return card_number;
    }
    public void setCard_number(String card_number){
        this.card_number = card_number;
    }

    public String getCard_type_id(){
        return card_type_id;
    }
    public void setCard_type_id(String card_type_id){
        this.card_type_id = card_type_id;
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
    public void setTerminal(Terminal terminal){
        this.terminal = terminal;
    }

}
