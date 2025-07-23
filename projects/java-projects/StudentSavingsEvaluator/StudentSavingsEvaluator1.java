/* Chakrika Vemireddy
   MIS350 Project
   Started: 6/12/24
   Last Edit: 07/10/2025
*/

import java.util.Scanner;

public class StudentSavingsEvaluator1 {

    // main method needed
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalIncome = 0.0;
        double totalExpenses = 0.0;
        int choice;

        do {
        System.out.println("Welcome to the Student Savings Evaluator!");
        System.out.println("Please pick which step you want to do (0-2)");
        System.out.println("0 - Income");
        System.out.println("1 - Expenses");
        System.out.println("2 - Report");
        System.out.println("3 - Exit");
        choice = input.nextInt();
        
        switch(choice){
         case 0: totalIncome = income(); break;
         case 1: totalExpenses = expenses(); break;
         case 2: report(totalIncome, totalExpenses); break;
         case 3: System.out.println("Thank you for using the Student Savings Evaluator!"); break;
         default: System.out.println("Invalid");
         }
        } while(choice != 3);
    }
    public static double income (){
      // Process 1: Income Entry
      Scanner input = new Scanner(System.in);
        double totalMonthlyIncome = 0.0;
        String moreIncome;

        
        System.out.println("Let's begin by entering your income sources!\n");

        // Prompt for income amount
        do {
            System.out.print("Please enter income source amount: $");
            double incomeAmount = input.nextDouble();

            // Give user options of frequency
            int frequencyChoice = -1;
            while (frequencyChoice != 0 && frequencyChoice != 1 && frequencyChoice != 2) {
                System.out.println("Select income frequency:");
                System.out.println("0 - Weekly");
                System.out.println("1 - Biweekly");
                System.out.println("2 - Monthly");
                System.out.print("Enter your frequency choice (0, 1, or 2): ");
                frequencyChoice = input.nextInt();

                // Only allows these inputs
                if (frequencyChoice != 0 && frequencyChoice != 1 && frequencyChoice != 2) {
                    System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                }
            }

            // Calculating monthly income
            double monthlyIncome = convertToMonthly(incomeAmount, frequencyChoice);
            totalMonthlyIncome += monthlyIncome;

            // Allowing more input to be added
            System.out.print("Do you want to add another income source? (yes/no): ");
            moreIncome = input.next();

        } while (moreIncome.equals("yes"));

        // Display total monthly income
        System.out.printf("\nTotal Monthly Income: $%.2f\n\n", totalMonthlyIncome);

        return totalMonthlyIncome;

    }
    
    public static double expenses(){
       Scanner input = new Scanner(System.in);
      // Process 2: Expense Input
        double totalFixedExpenses = 0.0;
        double totalVariableExpenses = 0.0;

        System.out.println("Now, let's enter your monthly expenses.\n");

        // Fixed expenses input
        System.out.println("--- Enter Fixed Monthly Expenses ---");
        String moreFixed;
        do {
            System.out.print("Enter fixed expense amount: $");
            double expense = input.nextDouble();
            totalFixedExpenses += expense;
            System.out.print("Do you want to add another fixed expense? (yes/no): ");
            moreFixed = input.next();
        } while (moreFixed.equals("yes"));

        // Variable expenses input
        System.out.println("\n--- Enter Variable Monthly Expenses ---");
        String moreVariable;
        do {
            System.out.print("Enter variable expense amount: $");
            double expense = input.nextDouble();
            totalVariableExpenses += expense;
            System.out.print("Do you want to add another variable expense? (yes/no): ");
            moreVariable = input.next();
        } while (moreVariable.equals("yes"));

        // Total expense calculation
        double totalExpenses = totalFixedExpenses + totalVariableExpenses;
        System.out.printf("\nTotal Fixed Expenses: $%.2f\n", totalFixedExpenses);
        System.out.printf("Total Variable Expenses: $%.2f\n", totalVariableExpenses);
        System.out.printf("Total Monthly Expenses: $%.2f\n\n", totalExpenses);

        return totalExpenses;

    }
    
    public static void report(double totalMonthlyIncome, double totalExpenses){
      // Process 3: Savings Evaluation
       
        // Add report header
        System.out.println("\n=== Monthly Savings Report ===");

        // Calculate savings and percentage
        double savings = totalMonthlyIncome - totalExpenses;
        double savingsPercentage = (savings / totalMonthlyIncome) * 100;

        // Output savings results
        System.out.printf("\nAmount Saved: $%.2f\n", savings);
        System.out.printf("Savings Percentage: %.2f%%\n", savingsPercentage);

        // Feedback based on savings percentage
        if (savingsPercentage >= 25.0) {
            System.out.println("Excellent job! You are saving above average per month.");
        } 
        else if (savingsPercentage >= 18.0) {
            System.out.println("Good job! You are saving an average amount per month.");
        } 
        else if (savingsPercentage >= 10.0) {
            System.out.println("You're saving below average per month. Please try to improve.");
        } 
        else if (savingsPercentage >= 0.0) {
            System.out.println("You're barely saving any income per month. You need to change your spending habits.");
        } 
        else {
            System.out.println("Warning: Your expenses exceed your income!");
        }
        // Add a blank line before returning to menu
        System.out.println();
    }
    

    // Method to convert to monthly income based on frequency
    public static double convertToMonthly(double income, int frequencyChoice) {
        double result = income;
        switch (frequencyChoice) {
            case 0: result = income * 4; break;
            case 1: result = income * 2; break;
            case 2: result = income; break;
            default: System.out.println("Invalid frequency selected.");
        }
        return result;
    }
}