package com.epam.clean_code;

/**
 * ConstructionCostEstimator
 */
public class ConstructionCostEstimator {

    private int selectedOption;
    private long totalAreaOfHouse;
    private boolean automated;

    public ConstructionCostEstimator(int selectedOption, long totalAreaOfHouse, boolean automated) {
        this.selectedOption = selectedOption;
        this.totalAreaOfHouse = totalAreaOfHouse;
        this.automated = automated;
    }

    public double getCostEstimation(){
        double estimationCost;
        if(automated){
            estimationCost = 2500*selectedOption;
        }
        else{
            switch (selectedOption) {
                case 1:
                    estimationCost = 1200 * totalAreaOfHouse;
                    break;
                case 2:
                    estimationCost = 1500 * totalAreaOfHouse;
                    break;
                case 3:
                    estimationCost = 1800 * totalAreaOfHouse;
                    break;
                default:
                    estimationCost = -1;
                    break;
            }
        }
        return estimationCost;
    }
}