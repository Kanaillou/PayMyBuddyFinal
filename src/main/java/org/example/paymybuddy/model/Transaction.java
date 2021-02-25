package org.example.paymybuddy.model;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

    private Long id;
    private String description;
    private BigDecimal amount;
    private Date date;
    private User sender;
    private User receiver;
    private Account account;

    public Transaction(long id, String description, BigDecimal amount, Date date, User sender, User receiver, Account account) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
