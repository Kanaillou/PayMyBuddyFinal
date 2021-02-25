package org.example.paymybuddy.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Account {

    private Long id;//FK
    private BigDecimal amount;
    private Date date;

    private User owner;
    private CreditCard card;
    private List<Transaction> transactions;

    public Account(long id, BigDecimal amount, Date date, User owner, CreditCard card, List<Transaction> transactions) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.owner = owner;
        this.card = card;
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public long getId() {
        return id;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    public long getAccountId() {
        return id;
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
}
