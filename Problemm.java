import java.util.*;
import java.lang.*;
import java.io.*;
class Problemm  {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Enter investment amount:");
         double investmentAmount = input.nextDouble();
         System.out.println("Enter annual interest rate in percentage:");
         double monthlyInterestRate = input.nextDouble();
         System.out.println("Enter number of years:");
         double numberOfYears = input.nextDouble();
         double futureInvestmentValue = investmentAmount * Math.pow((1 + (monthlyInterestRate / 1200)), (numberOfYears * 12));
         futureInvestmentValue = (int) (futureInvestmentValue * 100) / 100.0;
         System.out.println("Accumulated value is " + futureInvestmentValue + "\n");
    }
}