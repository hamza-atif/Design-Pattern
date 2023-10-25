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
public class DoubleBorderShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("DRECTANGLE")){
         return new DoubleBorderRectangle();         
      }else if(shapeType.equalsIgnoreCase("DSQUARE")){
         return new DoubleBorderSquare();
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new DoubleBorderTriangle();
      }		 
      return null;
   }
}