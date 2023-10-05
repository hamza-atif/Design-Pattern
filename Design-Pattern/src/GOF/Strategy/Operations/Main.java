/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Strategy.Operations;

/**
 *
 * @author fa20-bse-018
 */
public class Main {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd(new OperationSubtract()));		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
      
      context = new Context(new OperationDivision());		
      System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
      
      context = new Context(new OperationPower());		
      System.out.println("10^5 = " + context.executeStrategy(10, 5));
   }
}
