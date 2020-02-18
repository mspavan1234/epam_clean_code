package com.epam.interest_calculator;

import main.CompoundInterestCalculator;
import main.SimpleInterestCalculator;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double principleAmount, rateOfInterest, timePeriod, interestAppliedPerTimePeriod;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount details time period to calculate interest: ");

        System.out.print("1. Enter value of Principle Amount: ");
        principleAmount = scan.nextDouble();

        System.out.print("2. Enter value of Rate of Interest: ");
        rateOfInterest = scan.nextDouble();

        System.out.print("3. Enter the value of time period in years for which interest is to be calculated: ");
        timePeriod = scan.nextDouble();
        
        System.out.print("4. Number of times interest applied per time period: ");
        interestAppliedPerTimePeriod = scan.nextDouble();
        
        SimpleInterestCalculator simpleInterest = new SimpleInterestCalculator(principleAmount, rateOfInterest, timePeriod);

        CompoundInterestCalculator compoundInterest = new CompoundInterestCalculator(principleAmount, rateOfInterest, timePeriod, interestAppliedPerTimePeriod);

        System.out.println("Total Simple Interest Amount: " + simpleInterest.getTotalSimpleInterest());
        System.out.println("Total Compound Interest Amount: " + compoundInterest.getTotalCompoundInterest());

        scan.close();

    }
}
