/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank acc
 *
 * @author trisha
 */
public class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.run();
    }

    public void run() {
        System.out.println("Welcome to the bank, What is your name?");
        Scanner scanner = new Scanner (System.in);
        String name = scanner.next();
        System.out.println("Hello" + " "+ name + "," + "We are creating and saving accounts for you.");
        
        Customer customer = new Customer(name);
        
        System.out.println ("What is your Address?");
        
        String Address = scanner.next();
        
        customer.setAddress(Address);
        
        BankAccount checkingAccount = new BankAccount("checking", customer);
        
        BankAccount savingAccount = new BankAccount("savings", customer);
        
        
        //information of customer
        System.out.println();
        System.out.println("Customer Info");
        System.out.println(checkingAccount.getAccountInfo());
        
        System.out.println("Checking account");
        System.out.println(checkingAccount.getAccountInfo());
        
        System.out.println("Saving account");
        System.out.println(savingAccount.getAccountInfo());
        
        //Deposit
        //Checking acc
        System.out.println();
        System.out.println("Amount Decimal to deposit into your checking account?");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);
        
        
        //Saving acc
         System.out.println();
        System.out.println("Amount Decimal to deposit into your saving account?");
        amount = scanner.nextDouble();
        savingAccount.deposit(amount);
        
        
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());
        
        //Withdraw
         System.out.println();
         System.out.println("Amount Decimal to withdraw into your checking account?");
         amount = scanner.nextDouble();
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         System.out.println();
         System.out.println("Amount Decimal to withdraw into your saving account?");
         amount = scanner.nextDouble();
        try {
            savingAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
       
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());
        scanner.close();
    }


    
        
}
