package com.ivandjoh.dto;

import java.math.BigDecimal;

public class TransferDto {

    private String accountFrom;
    private String accountTo;
    private BigDecimal amount;

    public TransferDto() {}

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
