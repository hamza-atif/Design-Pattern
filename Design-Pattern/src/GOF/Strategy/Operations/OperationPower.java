/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Strategy.Operations;
 import java.lang.Math;
/**
 *
 * @author fa20-bse-018
 */
public class OperationPower implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
       return (int) Math.pow(num1,num2);
      
   }

    @Override
    public int Range(int num1, int num2) {
       return 0;
        }
}
