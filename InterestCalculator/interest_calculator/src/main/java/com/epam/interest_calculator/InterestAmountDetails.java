package com.epam.interest_calculator;

/**
 * InterestAmountDetails
 */
public class InterestAmountDetails {

    protected double principleAmount, rateOfInterest, timePeriod;

    protected InterestAmountDetails(double principleAmount, double rateOfInterest, double timePeriod) {
        this.principleAmount = principleAmount;
        this.rateOfInterest = rateOfInterest;
        this.timePeriod = timePeriod;
    }
}