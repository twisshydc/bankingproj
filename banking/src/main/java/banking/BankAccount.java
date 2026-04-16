/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author trisha
 */
public class BankAccount {
    String AccountType;
    double balance;
    Customer customer;
   
    
    public BankAccount(String AccountType,Customer customer){
        this.AccountType = AccountType;
        this.customer = customer;
        
        
            
        
        
    }
    public void deposit(double amount){
        this.balance += amount;
        
    }
        public void withdraw(double amount) throws Exception{
          if (amount > this.balance){
             throw new Exception("Amount is greater than the available balance");
          }    
        this.balance -= amount;
    }
        public String getAccountInfo(){
           return this.AccountType + ":" + this.balance;
           
        }
        
        public String getCustomerInfo(){
            
        return this.customer.getName() + "from" + this.customer.getAddress();
            
        
        }
        
        
 
}
