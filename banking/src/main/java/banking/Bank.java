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
        
        System.out.println();
        System.out.println("Customer Info");
        System.out.println(checkingAccount.getAccountInfo());
    }

}
