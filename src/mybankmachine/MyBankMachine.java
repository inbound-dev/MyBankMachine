/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankmachine;
import java.util.Scanner;
/**
 *
 * @author Jorda
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String BankName = "CIBC";
        boolean CustomerPresent = true;
        double StartingBalance = 1000;
        
        System.out.println("Hello Welcome to CIBC");
        System.out.println("What Can We Help you with");
            
        while(CustomerPresent != false){
            
            Scanner Input = new Scanner(System.in);
        
            String FirstChoice  = Input.next();
        
            if(FirstChoice.equals("withdrawl") || FirstChoice.equals("Withdrawl")){
                
                
                System.out.println("");
                ATM.StartUp(BankName);
                System.out.println("How Much Would You Like To Withdrawl");
            
                double WithdrawlAmount = Input.nextDouble();
            
                ATM.Withdrawl(WithdrawlAmount);
                
                System.out.println("Have a Good Day");
                CustomerPresent = false;
            }
            if(FirstChoice.equals("deposit") || FirstChoice.equals("Deposit")){
                System.out.println("Your current Account Balance Is: $" + StartingBalance);
                System.out.println("How Much Do you want to Deposit");
                
                double depositAmount = Input.nextDouble();
                ATM.Deposit(depositAmount);
                System.out.println("Have a Good Day");
                CustomerPresent = false;
            }
            if(FirstChoice.equals("Interest") || FirstChoice.equals("interest")){
                ATM.InterestRate(StartingBalance);
                CustomerPresent = false;
            }  
            if(FirstChoice.equals("Balance") || FirstChoice.equals("balance")){
                System.out.println("Your Current Balance is: $" + StartingBalance);
                CustomerPresent = false;
            }
            if(FirstChoice.equals("Investments") || FirstChoice.equals("investments")){
                
                System.out.println("How Much Would you like to invest?");
                int balanceInvested = Input.nextInt();
                System.out.println("How many Days would you like to Invest this balanace?");
                int daysInvested = Input.nextInt();
                ATM.InvestmentInterest(daysInvested, balanceInvested);
                CustomerPresent = false;
            }
            else {
                System.out.println("Sorry We Cant Help With that yet");
                CustomerPresent = false;
            }
        }
    }
}
