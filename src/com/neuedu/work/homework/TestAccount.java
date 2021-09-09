package com.neuedu.work.homework;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("存入:");
        double b = sc.nextDouble();
        System.out.println("支出:");
        double d = sc.nextDouble();

        try {
            Account a = new Account("tom", 100);
            a.save(b);
            a.pay(d);
        } catch (BNEException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Account {
    private String accountnumber;
    private double balance;

    public Account(String accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void save(double d) {
        System.out.println("账户" + accountnumber + "余额" + (balance + d));
    }

    public void pay(double d) throws BNEException {
        if (balance < d) {
            throw new BNEException();
        } else {
            System.out.println("账户" + accountnumber + "余额" + (balance - d));
        }
    }
}

class BNEException extends Exception {

    public BNEException() {
    }

    @Override
    public String getMessage() {
        return "余额不足";
    }
}