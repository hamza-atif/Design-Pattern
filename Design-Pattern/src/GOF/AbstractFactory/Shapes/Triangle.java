/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.AbstractFactory.Shapes;

/**
 *
 * @author fa20-bse-018
 */
public class Triangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Triangle::draw() method.");
   }
}
