package com.epam.clean_code;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select material standard and full Automation if required :");
        System.out.println("1. Standard materials with no Automation");
        System.out.println("2. Above standard materials with no Automation");
        System.out.println("3. High end standard materials with no Automation");
        System.out.println("4. High end standard materials with full Automation");
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
        System.out.println("Cost Estimated for construction for the given details is: "+estimate.getCostEstimation());
        sc.close();
    }
}
