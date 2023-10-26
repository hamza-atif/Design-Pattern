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
public class MealBuilder {

   public Meal prepareVegMeal() {
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      meal.addItem(new DietCoke()); // Add Diet version of Coke
      meal.addItem(new Tea()); // Add Tea
      return meal;
   }

   public Meal prepareNonVegMeal() {
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      meal.addItem(new DietPepsi()); // Add Diet version of Pepsi
      meal.addItem(new Tea()); // Add Tea
      return meal;
   }
}