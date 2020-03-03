package com.epam.interest_calculator;

/**
 * SimpleInterestCalculator
 */
public class SimpleInterestCalculator extends InterestAmountDetails {

    public SimpleInterestCalculator(double principleAmount, double rateOfInterest, double timePeriod){
        super(principleAmount, rateOfInterest, timePeriod);
    }
    public double getTotalSimpleInterest(){
        double interestAmount;
        interestAmount = principleAmount * (1 + (rateOfInterest / 100.00) * timePeriod);
        return interestAmount;
    }
}