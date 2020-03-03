package com.epam.clean_code;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static final Logger LOGGER = LogManager.getLogger("App.class");
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Select material standard and full Automation if required :");
        LOGGER.info("1. Standard materials with no Automation");
        LOGGER.info("2. Above standard materials with no Automation");
        LOGGER.info("3. High end standard materials with no Automation");
        LOGGER.info("4. High end standard materials with full Automation");
        int selectedOption;
        long totalAreaOfHouse;
        boolean automated;
        selectedOption = sc.nextInt();

        System.out.print("Enter the total surface area of the house in square feet: ");
        totalAreaOfHouse = sc.nextLong();
        if (selectedOption == 4)
            automated = true;
        else
            automated = false;
        ConstructionCostEstimator estimate = new ConstructionCostEstimator(selectedOption, totalAreaOfHouse, automated);
        LOGGER.info("Cost Estimated for construction for the given details is: "+estimate.getCostEstimation());
        sc.close();
    }
}
