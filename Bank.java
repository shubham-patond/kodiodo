package com.bankprogram;

import java.util.Scanner;


 class NegativeAmountException extends Exception {
 public NegativeAmountException(String message) {
     super(message);
 }
}

class Bank {
 private double balance;

 public Bank() {
     this.balance = 0.0;
 }
 public void deposit(double amount) throws NegativeAmountException {
     if (amount < 0) {
        
         throw new NegativeAmountException("Cannot deposit a negative amount: " + amount);
     }
     balance += amount;
     System.out.println("Deposit successful! Current balance: " + balance);
 }

 public double getBalance() {
     return balance;
 }


 public static void main(String[] args) {
     // Create Bank object
     Bank bank = new Bank();
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter deposit amount: ");
         double amount = scanner.nextDouble();

         bank.deposit(amount);

     } catch (NegativeAmountException e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }

}