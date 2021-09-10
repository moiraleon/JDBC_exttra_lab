package com.devmountain.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

public class Account {







    private int id;
    private String account_type;
    private float balance;
    private Date create_date;
    private BigInteger employee_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public BigInteger getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(BigInteger employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && balance == account.balance && Objects.equals(account_type, account.account_type) && Objects.equals(create_date, account.create_date) && Objects.equals(employee_id, account.employee_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account_type, balance, create_date, employee_id);
    }
}
