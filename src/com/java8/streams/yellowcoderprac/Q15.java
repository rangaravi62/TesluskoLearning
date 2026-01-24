package com.java8.streams.yellowcoderprac;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q15 {
    public static void main(String[] args) {
//        Q44. Given a list of transactions, filter out transactions of a specific type and collect them into a set ?

        List<Transaction> transactions = List.of(
                new Transaction("deposit", 100.0),
                new Transaction("withdrawal", 50.0),
                new Transaction("deposit", 200.0),
                new Transaction("transfer", 150.0));

        String targetType = "deposit";

        Set<Transaction> transactionSet = transactions.stream().filter(tran -> tran.getType().equals(targetType)).collect(Collectors.toSet());

        System.out.println(transactionSet);


    }
}


class Transaction {

    private String type;

    private double amount;


    // Constructor, getters, and setters


    public Transaction(String type, double amount) {

        this.type = type;

        this.amount = amount;

    }


    public String getType() {

        return type;

    }


    public double getAmount() {

        return amount;

    }


    @Override

    public String toString() {

        return "Transaction{" +

                "type='" + type + '\'' +

                ", amount=" + amount +

                '}';

    }

}
