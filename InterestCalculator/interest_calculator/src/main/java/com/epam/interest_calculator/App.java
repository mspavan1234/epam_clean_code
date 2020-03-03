package com.epam.interest_calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static final Logger LOGGER = LogManager.getLogger("App.class");
    public static void main( String[] args )
    {
        double principleAmount, rateOfInterest, timePeriod, interestAppliedPerTimePeriod;

        Scanner scan = new Scanner(System.in);

        LOGGER.info("Enter amount details time period to calculate interest: ");

        LOGGER.info("1. Enter value of Principle Amount: ");
        principleAmount = scan.nextDouble();

        LOGGER.info("2. Enter value of Rate of Interest: ");
        rateOfInterest = scan.nextDouble();

        LOGGER.info("3. Enter the value of time period in years for which interest is to be calculated: ");
        timePeriod = scan.nextDouble();
        
        LOGGER.info("4. Number of times interest applied per time period: ");
        interestAppliedPerTimePeriod = scan.nextDouble();
        
        SimpleInterestCalculator simpleInterest = new SimpleInterestCalculator(principleAmount, rateOfInterest, timePeriod);

        CompoundInterestCalculator compoundInterest = new CompoundInterestCalculator(principleAmount, rateOfInterest, timePeriod, interestAppliedPerTimePeriod);

        LOGGER.info("Total Simple Interest Amount: " + simpleInterest.getTotalSimpleInterest());
        LOGGER.info("Total Compound Interest Amount: " + compoundInterest.getTotalCompoundInterest());

        scan.close();

    }
}
