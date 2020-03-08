/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybankmachine;

/**
 *
 * @author Jorda
 */
public class ATM {
    // public variables to be used later
    public static int StartingBalance = 1000;
    public static double InterestRate = 1.4;
    public static double InterestPeriod = 365;
    
    // intital constructor
    public static void StartUp(String bankName){
        bankName = "CIBC";
        
        System.out.println("Your Current Account Balance Is: $" + StartingBalance);
    }
    // all banking functions
    public static void Withdrawl(double WithdrawlAmount){
        double EndBalance = StartingBalance - WithdrawlAmount;
        
        System.out.println("");
        System.out.println("Your New Balance Is: $" + EndBalance);
    }
    public static void Deposit(double depositAmount){
        double EndBalance = StartingBalance + depositAmount;
        System.out.println("Your New Balance Is: $" + EndBalance);
        
    }
    public static void InterestRate(double StartingBalance){  
        double EndBalanceInterest = StartingBalance * 1 + InterestRate * InterestPeriod - StartingBalance;
        System.out.println("Your Current Interest Rate Is " + EndBalanceInterest + " In One Year");
    }
    public static void InvestmentInterest(int daysInvested, int InvestmentBalance){
        double yearlyInterest = InvestmentBalance *InterestRate - InvestmentBalance;
        double dailyInterest = yearlyInterest / 365;
        double afterInvestment = daysInvested * dailyInterest + InvestmentBalance;
        
        System.out.println("After " + daysInvested + " days You Will Have $" + afterInvestment);
    }
}
