
package GOF.Strategy.Operations;

/**
 *
 * @author fa20-bse-018
 */
public class OperationAdd extends Computer implements Strategy{
    OperationAdd (Strategy nextStrategy){
        this.nextStrategy=nextStrategy;
    }
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }

    @Override
    public int Range(int num1, int num2) {
        if (num1 <=100 && num2<=100 && num1>0){
            return num1 + num2;
        }
        if(nextStrategy!=null){
             nextStrategy.Range(num1,num2);
        }
        else{
             System.out.print("Enter Valid Number");
        }
         return 0;

    }
}
