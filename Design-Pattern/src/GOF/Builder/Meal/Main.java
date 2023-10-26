/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Builder.Meal;

/**
 *
 * @author fa20-bse-018
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Meal Builder App!");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Prepare Veg Meal");
            System.out.println("2. Prepare Non-Veg Meal");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Meal vegMeal = mealBuilder.prepareVegMeal();
                    customizeMeal(vegMeal, scanner);
                    System.out.println("Veg Meal Details:");
                    vegMeal.showItems();
                    System.out.println("Total Cost: " + vegMeal.getCost());
                    break;

                case 2:
                    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
                    customizeMeal(nonVegMeal, scanner);
                    System.out.println("Non-Veg Meal Details:");
                    nonVegMeal.showItems();
                    System.out.println("Total Cost: " + nonVegMeal.getCost());
                    break;

                case 3:
                    System.out.println("Thank you for using the Meal Builder App. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    private static void customizeMeal(Meal meal, Scanner scanner) {
        while (true) {
            System.out.println("\nCustomize your meal:");
            System.out.println("1. Add sweetness to Tea");
            System.out.println("2. Add cream to Tea");
            System.out.println("3. Finish customizing");
            int customChoice = scanner.nextInt();

            switch (customChoice) {
                case 1:
                    System.out.println("Enter sweetness type (e.g., Sugar, Honey): ");
                    String sweetnessType = scanner.next();
                    System.out.println("Enter amount of sweetness in spoons: ");
                    int sweetnessSpoons = scanner.nextInt();
                    ((Tea) meal.getItems().stream()
                            .filter(item -> item.name().equals("Tea"))
                            .findFirst()
                            .orElse(null))
                            .addSweetness(sweetnessType, sweetnessSpoons);
                    break;

                case 2:
                    ((Tea) meal.getItems().stream()
                            .filter(item -> item.name().equals("Tea"))
                            .findFirst()
                            .orElse(null))
                            .addCream();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid customizing option. Please select a valid option.");
            }
        }
    }
}