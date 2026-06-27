package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="terminal_assignment")
public class TerminalAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="merchant_id")
    private Merchant merchant;

    @ManyToOne
    @JoinColumn(name = "terminal_id")
    private Terminal terminal;
    @Column(name ="assign_date")
    private LocalDate assignDate;
    @Column(name ="un_assign_date")
    private LocalDate unAssignDate;

    private TerminalAssignment(){

    }

    public TerminalAssignment(Merchant merchant, Terminal terminal, LocalDate assignDate,LocalDate unAssignDate) {

        this.merchant = merchant;
        this.terminal = terminal;
        this.assignDate = assignDate;
        this.unAssignDate = unAssignDate;
    }
            public Long getId(){
                return id;
            }
            public LocalDate getAssignDate(){
                return assignDate;
            }
            public LocalDate getUnAssignDate(){
                return unAssignDate;
            }

            public void setAssignDate(LocalDate assignDate){
                this.assignDate = assignDate;
             }
             public void setUnAssignDate(LocalDate unAssignDate){
                this.unAssignDate = unAssignDate;
            }
    }

